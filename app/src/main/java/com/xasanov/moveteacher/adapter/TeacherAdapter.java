package com.xasanov.moveteacher.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xasanov.moveteacher.R;
import com.xasanov.moveteacher.datas.TeacherDatas;
import com.xasanov.moveteacher.interfaces.Clicker;

import java.util.ArrayList;

/**
 * Created by root on 6/29/17.
 */

public class TeacherAdapter extends RecyclerView.Adapter<TeacherAdapter.Holder>{

    private  Context context;
    private ArrayList<TeacherDatas> list;
    private LayoutInflater inflater;
    private Clicker clicker;


    public TeacherAdapter(ArrayList<TeacherDatas> list, Context ctx,Clicker clicker) {
        this.list = list;

        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        context = ctx;

        this.clicker = clicker;

    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.teacher,parent,false);


        return new Holder(view);

    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {



        TeacherDatas item = list.get(position);




        holder.teacherName.setText(item.getNameTeacher());


    }

    @Override
    public int getItemCount() {


        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {


        TextView teacherName;

        RelativeLayout layout;

        public Holder(final View itemView) {
            super(itemView);



            teacherName = (TextView) itemView.findViewById(R.id.name_teacher);



            layout = (RelativeLayout) itemView.findViewById(R.id.container);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    clicker.click(getAdapterPosition());

                }
            });





        }


    }


}
