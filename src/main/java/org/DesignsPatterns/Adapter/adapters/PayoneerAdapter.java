package org.DesignsPatterns.Adapter.adapters;

import org.DesignsPatterns.Adapter.payoneer.Payoneer;
import org.DesignsPatterns.Adapter.paypal.IPayPalPayments;
import org.DesignsPatterns.Adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer){
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrões");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalreceive() {
        this.payoneer.receivePayment();
    }
}
