package cn.kgc.utils;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;

public class SendMailUtil  {
    private static String myEmailSMTPHost ="smtp.qq.com";
    //发件人邮箱
    private static String myEmailAccount="473203063@qq.com";

    //发件人邮箱授权码
    private static String myEmailPassword = "aquxxoyxhzkybgjj";

   /* toEmailAddress 收件箱地址
    emailTitle 邮件主题
    emailContent 邮件内容*/
   public static void sendEmail(String toEmailAddress,String emailTitle,String emailContent) throws Exception {
       Properties properties = new Properties();
       //开启debug
        properties.setProperty("mail.debug","true");
       //发送服务器需要身份验证
       properties.setProperty("mail.smtp.auth","true");
       //端口号
       properties.put("mail.smtp.port",465);
       // 设置邮件服务器主机名
       properties.setProperty("mail.smtp.host", myEmailSMTPHost);

       // 发送邮件协议名称
       properties.setProperty("mail.transport.protocol", "smtp");

       /**SSL认证，注意腾讯邮箱是基于SSL加密的，所以需要开启才可以使用**/
       MailSSLSocketFactory sf = new MailSSLSocketFactory();
       sf.setTrustAllHosts(true);

       //设置是否使用ssl安全连接（一般都使用）
       properties.put("mail.smtp.ssl.enable", "true");
       properties.put("mail.smtp.ssl.socketFactory", sf);

       //创建会话
       Session session = Session.getInstance(properties);

       //获取邮件对象
       //发送的消息，基于观察者模式进行设计的
       Message msg = new MimeMessage(session);

       //设置邮件标题
       msg.setSubject(emailTitle);

       //设置邮件内容
       //使用StringBuilder，因为StringBuilder加载速度会比String快，而且线程安全性也不错
       StringBuilder builder = new StringBuilder();

       //写入内容
       builder.append("\n" + emailContent);

       //设置显示的发件时间
       msg.setSentDate(new Date());

       //设置邮件内容
       msg.setText(builder.toString());

       //设置发件人邮箱
       // InternetAddress 的三个参数分别为: 发件人邮箱, 显示的昵称(只用于显示, 没有特别的要求), 昵称的字符集编码
       msg.setFrom(new InternetAddress(myEmailAccount,"租车之家", "UTF-8"));

       //得到邮差对象
       Transport transport = session.getTransport();

       //连接自己的邮箱账户
       //密码不是自己QQ邮箱的密码，而是在开启SMTP服务时所获取到的授权码
       //connect(host, user, password)
       transport.connect( myEmailSMTPHost, myEmailAccount, myEmailPassword);

       //发送邮件
       transport.sendMessage(msg, new Address[] { new InternetAddress(toEmailAddress) });

       //将该邮件保存到本地
       OutputStream out = new FileOutputStream("MyEmail.eml");
       msg.writeTo(out);
       out.flush();
       out.close();

       transport.close();
   }
}
