package org.DesignsPatterns.Solid.dip;

import org.DesignsPatterns.Solid.dip.payment.Payment;

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.pay("250");
    }
}
