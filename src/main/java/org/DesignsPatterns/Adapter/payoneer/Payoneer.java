package org.DesignsPatterns.Adapter.payoneer;

import org.DesignsPatterns.Adapter.utils.Token;

public class Payoneer implements  IPayonnerPayment{

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando Pagamentos via Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Payonner");
    }
}
