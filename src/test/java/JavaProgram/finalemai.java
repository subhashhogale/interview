package JavaProgram;

import java.io.File;
import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public class finalemai {

	public static void main(String[] args) {
		
		final String senderEmail="seleniumdemo21@gmail.com";
		final String appPassword="zjjgdzzbldtjnsev";
		final String receiverEmail="shailaja2595@gmail.com, subhashhogale5@gmail.com";
		
		//Smtp server properties
		Properties prop= new Properties();
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.starttls.enable", "true");
		
		prop.put("mail.smtp.port", "587");
		
		
		//create session with authentication 
		Session session=Session.getInstance(prop,new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(senderEmail,appPassword);
			}
		});
		
session.setDebug(true);

try {
	
	Message message=new MimeMessage(session);

	message.setFrom(new InternetAddress(senderEmail));
	
	message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiverEmail));
	
	message.setSubject("Test email From Automation");
	
	//message.setText("Hello \n This is a test email from java \n Regrads, \n QA team");
	
	
	//Email body part
	MimeBodyPart testPart=new MimeBodyPart();
	testPart.setText("Hello \n This is a test email from java \n Regrads, \n QA team");
	
	
	//attachementPart
	MimeBodyPart attachementPart=new MimeBodyPart();
	
	
	String filepath = System.getProperty("user.dir")+"/test-output/index.html";
	
	attachementPart.attachFile(new File(filepath ));
	
	//Combine body and attachement part
	
	MimeMultipart multipart=new MimeMultipart();
	multipart.addBodyPart(testPart);
	multipart.addBodyPart(attachementPart);
	message.setContent(multipart);
	
	Transport.send(message);
	
	System.out.println("email sent successfullyt ***");

}

catch (Exception e) {
	e.printStackTrace();
}





	}

}
