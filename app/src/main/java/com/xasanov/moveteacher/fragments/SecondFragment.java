package com.xasanov.moveteacher.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xasanov.moveteacher.R;
import com.xasanov.moveteacher.adapter.PaymentsAdapter;
import com.xasanov.moveteacher.datas.PaymentDatas;

import java.util.ArrayList;

public class SecondFragment extends AbstractTabFragment    {



    private PaymentsAdapter adapter;
    private RecyclerView recyclerView;


    private ArrayList<PaymentDatas> list;
    private static SecondFragment sf;
    private Context context;



    public static SecondFragment getInstance(Context ctx) {


        if (sf == null) {
            Bundle args = new Bundle();
            sf = new SecondFragment();
            sf.setContext(ctx);
            sf.setArguments(args);
            sf.setTitle("Second");

        }


        return sf;

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_payment_table,container,false);





        getList();
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);


        recyclerView.setLayoutManager(new GridLayoutManager(context,2));
        adapter = new PaymentsAdapter(list,context);


        recyclerView.setAdapter(adapter);

        return view;
    }

    private void getList() {

        list  = new ArrayList();

        list.add(new PaymentDatas("September","Yes"));
        list.add(new PaymentDatas("October","Yes"));
        list.add(new PaymentDatas("November","Yes"));
        list.add(new PaymentDatas("December","Yes"));
        list.add(new PaymentDatas("January","Yes"));
        list.add(new PaymentDatas("February","No"));


    }



    public void setContext(Context context) {
        this.context = context;
    }



}
