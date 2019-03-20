package org.sid.dao;

import org.sid.Entities.CLient;
import org.sid.Entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
