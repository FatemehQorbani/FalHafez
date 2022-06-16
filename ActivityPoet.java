package com.shariaty.falhafez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import NetWork.APIpoem;
import model.poet;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ActivityPoet extends AppCompatActivity {


    RecyclerView recyclerView;
    List<poet> poetsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poet);
        recyclerView=findViewById(R.id.recyclerview);
        poetsList=new ArrayList<>();

        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://ganjgah.ir/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        APIpoem myapicall=retrofit.create(APIpoem.class);
        Call <List<poet>> call=myapicall.getData();
        call.enqueue(new Callback<List<poet>>() {
            @Override
            public void onResponse(Call<List<poet>> call, Response<List<poet>> response) {
                if (response.code()!=200) {
                    return;
                }
                List<poet> poet= response.body();
                for (poet poetss : poet){
                    poetsList.add(poetss);
                }
                PutDataIntoRecyclerView(poetsList);
            }

            @Override
            public void onFailure(Call<List<poet>> call, Throwable t) {

            }
        });


    }

    private void PutDataIntoRecyclerView(List<poet> poetsList) {
        PoetAdapter adapter=new PoetAdapter(this,poetsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }


    public void onClickBack(View v)
    {
        Intent intent2 = new Intent(this,
                MainActivity.class);

        Bundle b = new Bundle();
        intent2.putExtra("bundle data", b);
        startActivity(intent2);
    }
}