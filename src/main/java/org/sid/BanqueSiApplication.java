package org.sid;

import org.sid.Entities.CLient;
import org.sid.dao.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mysql.fabric.xmlrpc.Client;

@SpringBootApplication
public class BanqueSiApplication implements CommandLineRunner {
@Autowired
private ClientRepository clientRepository;
	public static void main(String[] args) {
		SpringApplication.run(BanqueSiApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
	clientRepository.save(new CLient("C1"));	
	}
}
