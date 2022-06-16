package com.shariaty.falhafez;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import model.poet;

public class PoetAdapter extends RecyclerView.Adapter<PoetAdapter.MyViewHolder>{

    private Context mcontext;
    private List<poet> poetlist;


    public PoetAdapter(Context mcontext, List<poet> poetlist) {
        this.mcontext = mcontext;
        this.poetlist = poetlist;
    }
    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent , int viewtype) {
        View v;
        LayoutInflater layoutInflater=LayoutInflater.from(mcontext);
        v=layoutInflater.inflate(R.layout.activity_list_item,parent,false);
        return  new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {


        holder.name.setText(poetlist.get(position).getName());
        holder.birth.setText(poetlist.get(position).getBirthYearInLHijri());
        holder.death.setText(poetlist.get(position).getDeathYearInLHijri());
        holder.birthplace.setText(poetlist.get(position).getBirthPlace());



    }

    @Override
    public int getItemCount() {
        return poetlist.size();
    }

    public static class  MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView birth;
        TextView death;
        TextView birthplace;


        public MyViewHolder( View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.txtname);
            birth=itemView.findViewById(R.id.txtbirth);
            death=itemView.findViewById(R.id.death);
            birthplace=itemView.findViewById(R.id.txtbirthplace);


        }
    }

}
