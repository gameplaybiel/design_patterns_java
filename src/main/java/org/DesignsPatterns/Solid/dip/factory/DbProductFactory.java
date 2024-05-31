package org.DesignsPatterns.Solid.dip.factory;

import org.DesignsPatterns.Solid.dip.model.Db;
import org.DesignsPatterns.Solid.dip.model.IDbProduct;
import org.DesignsPatterns.Solid.dip.model.MongoDBProduct;
import org.DesignsPatterns.Solid.dip.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type){
        if(type == Db.MYSQL){
            return new MySQLProduct();
        }else{
            return new MongoDBProduct();
        }
    }
}
