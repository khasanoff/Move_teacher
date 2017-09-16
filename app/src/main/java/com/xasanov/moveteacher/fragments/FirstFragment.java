package com.xasanov.moveteacher.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xasanov.moveteacher.R;

/**
 * Created by root on 7/19/17.
 */

public class FirstFragment extends AbstractTabFragment   {





    private static FirstFragment ff;
    private Context context;

    public static FirstFragment getInstance(Context ctx) {


        if (ff == null) {


            Bundle args = new Bundle();
            ff = new FirstFragment();
            ff.setArguments(args);
            ff.setTitle("First");
            ff.setContext(ctx);

        }


        return ff;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_lessons_table,container,false);









        return view;
    }




    public void setContext(Context context) {
        this.context = context;
    }


}
