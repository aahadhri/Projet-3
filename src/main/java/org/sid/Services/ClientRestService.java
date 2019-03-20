package org.sid.Services;

import java.util.List;

import org.sid.Entities.CLient;
import org.sid.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestService {
	@Autowired
	private ClientMetier clientMetier;
@RequestMapping(value="/Clients",method=RequestMethod.POST)
	public CLient saveClient(@RequestBody CLient c) {
		return clientMetier.saveClient(c);
	}
@RequestMapping(value="/ListClients",method=RequestMethod.GET)

	public List<CLient> listClients() {
		return clientMetier.listClients();
	}
	

}
