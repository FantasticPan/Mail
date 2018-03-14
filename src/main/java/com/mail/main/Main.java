package com.mail.main;

import com.mail.model.MailInfo;
import com.mail.service.SimpleMailSender;

/**
 * Created by FantasticPan on 2018/3/13.
 */
public class Main {

    /**
     * 邮件发送测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
        // 设置邮件
        MailInfo mailInfo = new MailInfo();
        mailInfo.setMailServerHost("smtp.qq.com");
        mailInfo.setMailServerPort("587"); // 端口号，QQ邮箱给出了两个端口，但是另一个一直使用不了，所以使用这一个587
        mailInfo.setValidate(true);
        mailInfo.setUserName("706390664@qq.com");
        mailInfo.setPassword("efftxcxvpkoebcji"); // 密码
        mailInfo.setFromAddress("706390664@qq.com");
        mailInfo.setToAddress("1376575177@qq.com");
        mailInfo.setSubject("设置邮箱标题 Java Mail Test");
        mailInfo.setContent("设置邮箱内容 这是一个<a href='href://www.baidu.com'>javax Mail</a>测试");
        //这个类主要来发送邮件
        SimpleMailSender sms = new SimpleMailSender();
        sms.sendTextMail(mailInfo);//发送文体格式
        //SimpleMailSender.sendHtmlMail(mailInfo);//发送html格式
        System.out.println("success");
    }
}
