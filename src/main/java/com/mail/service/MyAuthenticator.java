package com.mail.service;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Created by FantasticPan on 2018/3/12.
 */
public class MyAuthenticator extends Authenticator {

    private String username = null;
    private String password = null;

    public MyAuthenticator() {
    }

    public MyAuthenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }
}
