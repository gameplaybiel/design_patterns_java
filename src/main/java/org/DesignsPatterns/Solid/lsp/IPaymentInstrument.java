package org.DesignsPatterns.Solid.lsp;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();
}
