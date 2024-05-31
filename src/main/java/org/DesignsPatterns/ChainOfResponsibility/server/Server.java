package org.DesignsPatterns.ChainOfResponsibility.server;

import org.DesignsPatterns.ChainOfResponsibility.middlewares.Middleweare;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleweare middleweare;

    public void setMiddleweare(Middleweare middleweare) {
        this.middleweare = middleweare;
    }

    public boolean logIn(String email, String password){
        if(middleweare.check(email, password)){
            System.out.println("Usuário autorizado com sucesso!");
            System.out.println("Seja Bem-vindo!");
            return true;
        }
        return false;
    }

    public void registerUser(String email, String password){
        users.put(email, password);
    }

    public boolean hasEmail(String email){
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password){
        return users.get(email).equals(password);
    }
}
