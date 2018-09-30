package org.dsi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.dsi.Entity.Contacts;
import org.dsi.dao.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
contactRepository.save(new Contacts("Aymen","Hadhri",df.parse("07/06/1982"),"aymen@gmail.com",12345587,"Aymen.jpg"));		
contactRepository.findAll().forEach(c->{
	System.out.println(c.getNom());
});
	}
}
