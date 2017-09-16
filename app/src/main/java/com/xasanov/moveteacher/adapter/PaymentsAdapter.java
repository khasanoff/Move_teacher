package com.xasanov.moveteacher.adapter;


import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.xasanov.moveteacher.R;

import com.xasanov.moveteacher.datas.PaymentDatas;

import java.util.ArrayList;


public class PaymentsAdapter extends RecyclerView.Adapter<PaymentsAdapter.Holder>{

    private Context context;
    private ArrayList<PaymentDatas> list;
    private LayoutInflater inflater;
    private   View view;

    public PaymentsAdapter(ArrayList<PaymentDatas> list, Context ctx) {
        this.list = list;

        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        context = ctx;



    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

       view = inflater.inflate(R.layout.pay_element,parent,false);


        return new Holder(view);

    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

        PaymentDatas datas = list.get(position);





        if (position == list.size()-1) {
            holder.paymentTextView.setBackgroundColor(view.getResources().getColor(R.color.clouds));
            holder.paymentTextView.setTextColor(Color.WHITE);

            holder.monthTextView.setBackgroundColor(view.getResources().getColor(R.color.clouds));
            holder.monthTextView.setTextColor(Color.WHITE);
        }

        holder.monthTextView.setText(datas.getMonth());
        holder.paymentTextView.setText(datas.getPayment());




    }

    @Override
    public int getItemCount() {


        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {



        TextView monthTextView,paymentTextView;

        public Holder(final View itemView) {
            super(itemView);


            monthTextView = (TextView) itemView.findViewById(R.id.month_textView);
            paymentTextView = (TextView) itemView.findViewById(R.id.pay_textView);






        }


    }


}
