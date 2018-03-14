# Mail
说明：一个邮件发送小demo，follwing别人学习到的，可用在项目中，可用性强，上传记录

使用方法：
1. 使用需要开启邮箱的第三方服务，本demo使用QQ邮件
邮箱-设置-账户，下拉找到POP3/IMAP/SMTP/Exchange/CardDAV/CalDAV服务栏，开启SMTP服务，可得到一个秘钥
2. 找到main/java/com/mail/main/Main.class，更改mailInfo.setUserName(*你的QQ邮箱*); mailInfo.setPassword(*开启SMTP服务得到的秘钥*);
3. mailInfo.setFromAddress(*发送者邮箱*); mailInfo.setToAddress(*接受者邮箱*);
4. 运行即可
