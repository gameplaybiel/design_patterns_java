package org.DesignsPatterns.Adapter;

import org.DesignsPatterns.Adapter.adapters.PayoneerAdapter;
import org.DesignsPatterns.Adapter.payoneer.Payoneer;
import org.DesignsPatterns.Adapter.paypal.IPayPalPayments;

public class Main {

    public static void main(String[] args) {

       //IPayonnerPayment payment = new Payoneer();

       IPayPalPayments payment = new PayoneerAdapter(new Payoneer());

       payment.paypalPayment();
       payment.paypalreceive();


    }
}
