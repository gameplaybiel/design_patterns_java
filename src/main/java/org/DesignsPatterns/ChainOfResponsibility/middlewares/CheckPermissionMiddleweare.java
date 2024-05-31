package org.DesignsPatterns.ChainOfResponsibility.middlewares;

public class CheckPermissionMiddleweare extends Middleweare{

    @Override
    public boolean check(String email, String password) {
        if(email.equals("master@hcode.com.br")){
            System.out.println("Bem-vindo Administrador!");
            return true;
        }
        System.out.println("Bem-vindo!");
        return checkNext(email, password);
    }
}
