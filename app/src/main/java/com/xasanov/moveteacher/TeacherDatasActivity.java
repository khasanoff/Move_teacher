package com.xasanov.moveteacher;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class TeacherDatasActivity extends AppCompatActivity {

        private String a;
        private Intent getIntent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.White);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_datas_activity);


        getIntent = getIntent();


        if (!getIntent.getStringExtra("a").equals("a")) {

            getterIntent();
            initWids();

        }else {

            FloatingActionButton toOrderBtn = (FloatingActionButton) findViewById(R.id.toOrder_btn);
            toOrderBtn.setVisibility(View.INVISIBLE);

        }



    }

    private void initWids() {


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        toolbar.setTitle(a);





        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView firstName = (TextView) findViewById(R.id.first_name_textView);

        TextView lastName = (TextView) findViewById(R.id.last_name_textView);
        lastName.setText(a);








        FloatingActionButton toOrderBtn = (FloatingActionButton) findViewById(R.id.toOrder_btn);
        toOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TeacherDatasActivity.this,OrderActivity.class);
                intent.putExtra("name",a);
                startActivity(intent);
            }



        });



    }


    public void getterIntent() {




        Intent intent = getIntent();
        a = intent.getStringExtra("name");
        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();


    }



}

