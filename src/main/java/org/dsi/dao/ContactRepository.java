package org.dsi.dao;

import org.dsi.Entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contacts,Long>{

}
