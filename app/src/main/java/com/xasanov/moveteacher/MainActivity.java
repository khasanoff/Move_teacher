package com.xasanov.moveteacher;



import android.content.Intent;

import android.graphics.Color;
import android.support.annotation.NonNull;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.xasanov.moveteacher.datas.TeacherDatas;


public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener,
        View.OnClickListener{

    private DrawerLayout drawer ;
    private NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.White);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initWids();

        initToolbar();






    }

    private void initWids() {

    drawer = (DrawerLayout) findViewById(R.id.drawer);


        ImageButton btn = (ImageButton) findViewById(R.id.main_btn);
        btn.setOnClickListener(this);


        Button report = (Button) findViewById(R.id.reportBtn);
        report.setOnClickListener(this);

        Button infoHelp = (Button) findViewById(R.id.info_help_btn);
        infoHelp.setOnClickListener(this);





        navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);



    }

    private void initToolbar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);


        setSupportActionBar(toolbar);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open,R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();






        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            drawer.openDrawer(Gravity.START);



            }
        });




    }


    @Override
    public void onBackPressed() {



        if (drawer.isDrawerOpen(Gravity.START)){
            drawer.closeDrawer(Gravity.LEFT);

        }else{
            super.onBackPressed();

        }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Log.d("hapa", "onNavigationItemSelected: ");
        switch (item.getItemId()){


            case R.id.message_for_us:



                startActivity(new Intent(this,MessageForUsActivity.class));

                break;

            case R.id.your_teacher:

                Intent intent = new Intent(this, TeacherDatasActivity.class);
                intent.putExtra("a","a");

                startActivity(intent);

                break;



            case R.id.exit_to_app:

               finish();
                break;


        }


        drawer.closeDrawer(GravityCompat.START);

        return false;

    }


                        @Override
                        public void onClick(View v) {

                            Intent intent ;

                            switch (v.getId()){

                                case R.id.info_help_btn:
                                    intent = new Intent(this,ActivityInfoHelp.class);
                                    startActivity(intent);
                                    break;

                                case R.id.reportBtn:
                                    intent = new Intent(MainActivity.this,ReportActivity.class);
                                    startActivity(intent);
                                    break;

                                case R.id.main_btn:
                                    intent = new Intent(MainActivity.this,SearchTeacherActivity.class);
                                    startActivity(intent);

                                    break;



                            }






                        }








                    }
