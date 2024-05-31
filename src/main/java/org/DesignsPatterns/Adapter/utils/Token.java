package org.DesignsPatterns.Adapter.utils;

public class Token {
    private String token;

    public Token(){
        this.token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkRlc2lnbiBQYXR0ZXJucyIsImlhdCI6MTUxNjIzOTAyMn0.F1N--HzdSvSnHDqRQ-3ZIplgGaIgdF5C3i9ctQusjtM";
    }

    public String getToken(){
        return token;
    }
}
