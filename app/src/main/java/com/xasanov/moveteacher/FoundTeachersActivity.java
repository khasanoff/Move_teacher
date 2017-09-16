package com.xasanov.moveteacher;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.xasanov.moveteacher.adapter.TeacherAdapter;
import com.xasanov.moveteacher.datas.TeacherDatas;
import com.xasanov.moveteacher.interfaces.Clicker;

import java.util.ArrayList;

/**
 * Created by root on 6/29/17.
 */

public class FoundTeachersActivity extends AppCompatActivity implements Clicker{


    private TeacherAdapter adapter;
    private RecyclerView recyclerView;
    private TextView teachers_count;
    private ArrayList<TeacherDatas> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.found_teachers);



        getList();


        initWids();

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        adapter = new TeacherAdapter(list,this,this);


        recyclerView.setAdapter(adapter);



    }


    private void initWids(){

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Found teachers count:"+list.size());
        toolbar.setTitleTextColor(Color.WHITE);


    }


    private void getList() {

        list  = new ArrayList();
        list.add(new TeacherDatas("Mariarty"));
        list.add(new TeacherDatas("Sherlock"));
        list.add(new TeacherDatas("Watson"));


    }


    @Override
    public void click(int id) {

        Intent intent = new Intent(this,TeacherDatasActivity.class);
        intent.putExtra("name",list.get(id).getNameTeacher());
        intent.putExtra("a","b");
        startActivity(intent);

    }



}
