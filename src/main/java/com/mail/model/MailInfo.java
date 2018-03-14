package com.mail.model;

import lombok.Getter;
import lombok.Setter;

import java.security.GeneralSecurityException;
import java.util.Properties;

/**
 * 要发送邮件的基本信息
 * Created by FantasticPan on 2018/3/12.
 */
@Getter
@Setter
public class MailInfo {

    // 发送邮件的服务器的IP和端口
    private String mailServerHost;
    private String mailServerPort;

    // 邮件发送者的地址
    private String fromAddress;

    // 邮件接收者的地址
    private String toAddress;

    // 登陆邮件发送服务器的用户名和密码
    private String userName;
    private String password;

    // 是否需要身份验证
    private boolean validate;

    // 邮件主题
    private String subject;

    // 邮件的文本内容
    private String content;

    // 邮件附件的文件名
    private String[] attachFileNames;

    /**
     * 获得邮件会话属性
     *
     * @return
     */
    public Properties getProperties() throws GeneralSecurityException {
        Properties p = new Properties();
        p.put("mail.smtp.host", this.mailServerHost);
        p.put("mail.smtp.port", this.mailServerPort);
        p.put("mail.smtp.auth", validate ? "true" : "false");

        // 开启SSL加密
        //MailSSLSocketFactory sf = new MailSSLSocketFactory();
        //sf.setTrustAllHosts(true);
        //p.put("mail.smtp.ssl.enable", "true");
        //p.put("mail.smtp.ssl.socketFactory", sf);
        return p;
    }


}
