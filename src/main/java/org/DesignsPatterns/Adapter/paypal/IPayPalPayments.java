package org.DesignsPatterns.Adapter.paypal;

import org.DesignsPatterns.Adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalreceive();
}
