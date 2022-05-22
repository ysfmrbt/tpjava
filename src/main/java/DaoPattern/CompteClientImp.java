package DaoPattern;

import JavaBeans.CompteClient;

import java.sql.*;
import java.sql.Date;
import java.util.List;
import java.util.ArrayList;
public class CompteClientImp implements CompteClientsDao {
    private final DaoFactory daoFactory;
    public CompteClientImp(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
    @Override
    public void MiseAJour(CompteClient compteClient) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("Update compteclient SET numero = ?,dateCreation = ?,chiffreAffaire=? where idClient = ?;", ResultSet.CONCUR_UPDATABLE);
            preparedStatement.setInt(1, compteClient.getNumero());
            preparedStatement.setDate(2, (Date) compteClient.getDateCreation());
            preparedStatement.setDouble(3, compteClient.getChiffreAffaire());
            preparedStatement.setInt(4, compteClient.getIdClient());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void supprimer(Integer idClient) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("Delete from compteclient where idClient = ?;");
            preparedStatement.setInt(1, idClient);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void ajouter(CompteClient compteClient) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("Insert into compteclient(numero,dateCreation,chiffreAffaire) values (?,?,?);");
            preparedStatement.setInt(1, compteClient.getNumero());
            preparedStatement.setDate(2, (Date) compteClient.getDateCreation());
            preparedStatement.setDouble(3, compteClient.getChiffreAffaire());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List <CompteClient> lister() {
        List<CompteClient> compteClients = new ArrayList<CompteClient>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;
        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("Select numero,idClient,dateCreation,chiffreAffaire from compteclient order by idClient ASC;");
            while (resultat.next()) {
                int numero = resultat.getInt("numero");
                int idClient = resultat.getInt("idClient");
                Date dateCreation = resultat.getDate("dateCreation");
                Double chiffreAffaire = resultat.getDouble("chiffreAffaire");

                CompteClient compteClient = new CompteClient();
                compteClient.setNumero(numero);
                compteClient.setIdClient(idClient);
                compteClient.setDateCreation(dateCreation);
                compteClient.setChiffreAffaire(chiffreAffaire);


                compteClients.add(compteClient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return compteClients;
    }
}


