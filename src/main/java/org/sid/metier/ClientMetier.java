package org.sid.metier;

import java.util.List;

import org.sid.Entities.CLient;

public interface ClientMetier {
public CLient saveClient (CLient c);
public List<CLient> listClients ();
}
