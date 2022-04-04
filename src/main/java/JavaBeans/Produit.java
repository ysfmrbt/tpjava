package JavaBeans;

public class Produit {
    private String label;
    private Float prix;
    private Boolean disponibilite;
    public Produit() {}

    public String getLabel() {
        return label;
    }

    public Float getPrix() {
        return prix;
    }

    public Boolean getDisponibilite() {
        return disponibilite;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public void setDisponibilite(Boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
    public static void main(String[] args) {

    }
}
