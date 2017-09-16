package com.xasanov.moveteacher;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



public class SearchTeacherActivity extends AppCompatActivity {


    private Spinner levelSpinner,timeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.search_teacher);

        initWids();


    }

    private void initWids() {



        String levels[] = {"beginner","elementary","pre-intermediate","intermediate","upper","advanced"};


        levelSpinner = (Spinner) findViewById(R.id.levelSpinner);

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.spinner_element,levels);

        levelSpinner.setAdapter(adapter);


        String times[] = {
                "9.00-10.30",
                "9.30-11.00",
                "10.00-11.30",
                "10.30-12.00",
                "11.00-12.30",
                "11.30-13.00",
                "12.00-13.30",
                "12.30-14.00",
                "13.00-14.30",
                "13.30-15.00",
                "14.00-15.30",
                "14.30-16.00",
                "15.00-16.30",
                "15.30-17.00",
                "16.00-17.30",
                "16.30-18.00",
                "17.00-18.30"
        };


        timeSpinner = (Spinner) findViewById(R.id.timeSpinner);

        ArrayAdapter adapter2 = new ArrayAdapter(this,R.layout.spinner_element,times);

        timeSpinner.setAdapter(adapter2);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.search_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SearchTeacherActivity.this,FoundTeachersActivity.class);
                startActivity(intent);

            }
        });


    }


}
