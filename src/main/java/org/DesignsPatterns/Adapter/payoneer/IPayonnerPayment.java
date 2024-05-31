package org.DesignsPatterns.Adapter.payoneer;

import org.DesignsPatterns.Adapter.utils.Token;

public interface IPayonnerPayment {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
