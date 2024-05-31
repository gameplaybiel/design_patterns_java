package org.DesignsPatterns.Solid.dip.payment;

import org.DesignsPatterns.Solid.dip.factory.DbProductFactory;
import org.DesignsPatterns.Solid.dip.model.Db;
import org.DesignsPatterns.Solid.dip.model.IDbProduct;

public class Payment {

    public void pay(String productID){
        IDbProduct dbProduct = DbProductFactory.create(Db.MYSQL);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
