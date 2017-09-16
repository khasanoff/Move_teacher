package com.xasanov.moveteacher;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


import com.jmavarez.materialcalendar.CalendarView;

import com.jmavarez.materialcalendar.Util.CalendarDay;
import com.xasanov.moveteacher.adapter.TabsPagerFragmentAdapter;

import java.util.Calendar;


public class ReportActivity extends AppCompatActivity {



    private TabLayout tabLayout;
    private ViewPager pager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_report);


        init();

    }

    private void init() {

        pager = (ViewPager) findViewById(R.id.pager);
        TabsPagerFragmentAdapter adapter  = new TabsPagerFragmentAdapter(this,getSupportFragmentManager());
        pager.setAdapter(adapter);


        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(pager);





    }


}
