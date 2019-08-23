package CCMSDashBoard.Model;

import java.time.LocalDate;

/**
 * Created by Meave Dregonhive on 30/03/2018.
 */
public class ProduitRestitution
{
    private int ID;

    private String nom_commercial;

    private String forme;

    private String dosage;

    private int quantite;

    private LocalDate datePeremption;

    private int idPharmacie;

    private String remarque;

    public ProduitRestitution() {
    }

    public ProduitRestitution(int ID, String nom_commercial, String forme, String dosage, int quantite, java.sql.Date datePeremption, int idPharmacie, String remarque) {
        this.ID = ID;
        this.nom_commercial = nom_commercial;
        this.forme = forme;
        this.dosage = dosage;
        this.quantite = quantite;
        this.datePeremption = datePeremption.toLocalDate();
        this.idPharmacie = idPharmacie;
        this.remarque = remarque;
    }

    public int getID() {
        return ID;
    }

    public String getNom_commercial() {
        return nom_commercial;
    }

    public String getForme() {
        return forme;
    }

    public String getDosage() {
        return dosage;
    }

    public int getQuantite() {
        return quantite;
    }

    public LocalDate getDatePeremption() {
        return datePeremption;
    }

    public int getIdPharmacie() {
        return idPharmacie;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setNom_commercial(String nom_commercial) {
        this.nom_commercial = nom_commercial;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setDatePeremption(LocalDate datePeremption) {
        this.datePeremption = datePeremption;
    }

    public void setIdPharmacie(int idPharmacie) {
        this.idPharmacie = idPharmacie;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "ProduitRestitution{" +
                "ID=" + ID +
                ", nom_commercial='" + nom_commercial + '\'' +
                ", forme='" + forme + '\'' +
                ", dosage='" + dosage + '\'' +
                ", quantite=" + quantite +
                ", datePeremption=" + datePeremption +
                ", idPharmacie=" + idPharmacie +
                ", remarque='" + remarque + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProduitRestitution that = (ProduitRestitution) o;

        return ID == that.ID;
    }

    @Override
    public int hashCode() {
        return ID;
    }

    public void ajoutProduit()
    {
        /*//Connection conn = ConnectionManager.getConnection();
        try
        {
            *//*System.out.println("///Connection established.");
            String query = "INSERT INTO RESTITUTION VALUES (?,?,?,?,?,?,?,?)";
            int id = 0;
           // PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, nom_commercial.toUpperCase());
            statement.setString(2, forme.toUpperCase());
            statement.setString(3, dosage.toUpperCase());
            statement.setInt(4, quantite);
            statement.setDate(5, java.sql.Date.valueOf(datePeremption));
            statement.setInt(6, idPharmacie);
            statement.setString(7, remarque);
            statement.setInt(8, 0);
            statement.executeUpdate();

            System.out.println("ID request = " + id);
            statement.close();*//*

        }
        catch (SQLException exc)
        {
            System.out.println(exc);
            exc.getStackTrace();
            System.out.println("Connection failed !");
        }*/
    }

}
