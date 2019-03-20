package org.sid.Services;

import java.util.List;

import org.sid.Entities.Employe;
import org.sid.metier.EmployeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeRestService {
@Autowired
private EmployeMetier metier;
@RequestMapping(value="/Employe",method=RequestMethod.POST)
public Employe saveEmploye(@RequestBody Employe e) {
	return metier.saveEmploye(e);
}
@RequestMapping(value="/ListEmploye",method=RequestMethod.GET)
public List<Employe> employes() {
	return metier.employes();
}



}
