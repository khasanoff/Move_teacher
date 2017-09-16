package com.xasanov.moveteacher.fragments;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by root on 7/19/17.
 */

public class AbstractTabFragment extends Fragment {


    private String title;

    protected View view;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
