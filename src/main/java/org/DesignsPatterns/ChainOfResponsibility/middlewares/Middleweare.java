package org.DesignsPatterns.ChainOfResponsibility.middlewares;

public abstract class Middleweare {
    private Middleweare next;

    public Middleweare linkWith(Middleweare next){
        this.next = next;
        return next;
    }

    public abstract boolean check(String email, String password);

    public boolean checkNext(String email, String password){
        if(next == null){
            return true;
        }
        return next.check(email, password);
    }
}
