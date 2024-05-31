package org.DesignsPatterns.Adapter.paypal;

import org.DesignsPatterns.Adapter.utils.Token;

public class PayPal implements IPayPalPayments {
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos com PayPal");
    }

    @Override
    public void paypalreceive() {
        System.out.println("Recebendo pagamentos via PayPal");
    }
}
