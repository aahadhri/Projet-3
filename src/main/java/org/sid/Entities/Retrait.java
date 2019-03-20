package org.sid.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RT")
public class Retrait extends Operation{

}
