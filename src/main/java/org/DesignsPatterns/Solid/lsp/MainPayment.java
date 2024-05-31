package org.DesignsPatterns.Solid.lsp;

// L - Liskov Substitution Principle - Princípio da Substituição de Liskov
public class MainPayment {

    public static void main(String[] args) throws Exception {
        //CreditCard card = new CreditCard();
        //DebitCard card1 = new DebitCard();
        NubankRewards card = new NubankRewards();

        card.validate();
        card.collectPayment();
    }
}
