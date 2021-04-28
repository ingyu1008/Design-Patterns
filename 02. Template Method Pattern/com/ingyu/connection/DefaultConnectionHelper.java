package com.ingyu.connection;
public class DefaultConnectionHelper extends AbstConnectionHelper {

    @Override
    protected String doSecurity(String string) {
        System.out.println("Decoding Info");
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("Authentication");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("Authorization");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("Connect!");
        return info;
    }

}
