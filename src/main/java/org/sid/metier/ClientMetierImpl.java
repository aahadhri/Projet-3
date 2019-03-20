package org.sid.metier;

import java.util.List;

import org.sid.Entities.CLient;
import org.sid.dao.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClientMetierImpl implements ClientMetier {
	@Autowired
private ClientRepository clientRepository;
	@Override
	public CLient saveClient(CLient c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public List<CLient> listClients() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

}
