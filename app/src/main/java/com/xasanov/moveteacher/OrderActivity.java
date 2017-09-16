package com.xasanov.moveteacher;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by root on 7/16/17.
 */

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner districtSpinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order
        );


        getterIntent();
        initWids();


    }

    private void initWids() {


        String districts[] = {"M.Ulugbek","Yunusobod","Yashnobod","Sergeli"};


        districtSpinner = (Spinner) findViewById(R.id.districtSpinner);

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.spinner_element,districts);

        districtSpinner.setAdapter(adapter);




        Button doneBtn = (Button) findViewById(R.id.done_btn);
        doneBtn.setOnClickListener(this);

    }

    private void getterIntent() {
    Intent intent = getIntent();
        Toast.makeText(this, ""+intent.getStringExtra("name"), Toast.LENGTH_SHORT).show();


    }


    @Override
    public void onClick(View v) {

        Intent i = new Intent(OrderActivity.this, MainActivity.class);
// set the new task and clear flags
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);

    }
}
