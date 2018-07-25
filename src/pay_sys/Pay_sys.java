/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay_sys;

/**
 *
 * @author dave
 */
public class Pay_sys {

    private static final int PAYMENT_TYPE_INDEX = 0;

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addLineItem(new LineItem("Mayank", 22000));
        bill.addLineItem(new LineItem("Sahaj", 16000));
        bill.pay(PaymentMode.getPaymentMethod(args[PAYMENT_TYPE_INDEX]));
    }
}
