package org.sid.dao;

import org.sid.Entities.CLient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<CLient, Long> {

}
