package org.DesignsPatterns.ChainOfResponsibility.middlewares;

import org.DesignsPatterns.ChainOfResponsibility.server.Server;

public class CheckUserMiddleweare extends Middleweare{
    private Server server;

    public CheckUserMiddleweare(Server server){
        this.server = server;
    }


    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("E-mail inválido");
            return false;
        }
        if(!server.isValidPassword(email, password)){
            System.out.println("E-mail ou Senha Inválidos");
            return false;
        }
        return checkNext(email, password);
    }
}
