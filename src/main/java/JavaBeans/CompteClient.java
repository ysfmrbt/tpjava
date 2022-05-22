package JavaBeans;

import java.util.Date;

public class CompteClient {
    private int numero;
    private int idProp;
    private Date dateCreation;
    private Double chiffreAffaire;
    private int idClient;


    public CompteClient(int numero, int idProp, Date dateCreation, Double chiffreAffaire, int idClient) {
        super();
        this.numero = numero;
        this.idProp = idProp;
        this.dateCreation = dateCreation;
        this.chiffreAffaire = chiffreAffaire;
        this.idClient = idClient;
    }

    public CompteClient() {
        super();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdProp() {
        return idProp;
    }

    public void setIdProp(int idProp) {
        this.idProp = idProp;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(Double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

}
