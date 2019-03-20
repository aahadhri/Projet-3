package org.sid.metier;

import java.util.List;

import org.sid.Entities.Employe;

public interface EmployeMetier {
	public Employe saveEmploye(Employe e);
	public List<Employe> employes();
	

}
