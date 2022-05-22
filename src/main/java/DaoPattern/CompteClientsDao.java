package DaoPattern;

import JavaBeans.CompteClient;

import java.util.List;

public interface CompteClientsDao {
    void ajouter( CompteClient compteClient );
    void MiseAJour(CompteClient compteClient);
    void supprimer(Integer idClient);
    List<CompteClient> lister();
    //ajouter les autres méthodes CRUD
}
