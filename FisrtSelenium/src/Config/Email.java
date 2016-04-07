package Config;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {

	public void envioEmail(String msg) {

	
	final String username = "seleniumMailTests@gmail.com";
	final String password = "selenium2016";
	Data data = new Data();
	final String dataAtual = data.dataAtual();

	Properties props = new Properties();
	props.put("mail.smtp.auth",true);
	props.put("mail.smtp.starttls.enable",true);
	props.put("mail.smtp.host","smtp.gmail.com");
	props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	props.put("mail.smtp.port","587");

	Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

    try {

	Message message = new MimeMessage(
			session);message.setFrom(new InternetAddress("fabianobarroco@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("fabianobarroco@gmail.com"));
			message.setSubject("Selenium Tests Cases ");message.setText("Resultado da execução dos casos de testes"
			+"\n"
			+"Em " + dataAtual + " Foram executados os seguintes casos de testes:"
			+"\n\n"
			+msg
			+"\n\n Email automático, não responder!!!");
			
					
	Transport.send(message);

	System.out.println("Email enviado com sucesso!!!!");

	}catch(
	MessagingException e)
	{
		throw new RuntimeException(e);
	}
}
    //https://www.google.com/settings/security/lesssecureapps
	// http://www.devmedia.com.br/utilizando-a-api-commons-email-para-enviar-e-mails/3306#ixzz44uOwH9Z5
	// http://www.devmedia.com.br/enviando-email-com-javamail-utilizando-gmail/18034
}
