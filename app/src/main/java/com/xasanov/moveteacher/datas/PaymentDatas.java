package com.xasanov.moveteacher.datas;

/**
 * Created by root on 7/27/17.
 */

public class PaymentDatas {

    private String month,payment;

    public PaymentDatas(String month, String payment) {
        this.month = month;
        this.payment = payment;
    }

    public String getMonth() {
        return month;
    }


    public String getPayment() {
        return payment;
    }
}
