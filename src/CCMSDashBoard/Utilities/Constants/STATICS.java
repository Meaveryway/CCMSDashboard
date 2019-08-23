package CCMSDashBoard.Utilities.Constants;

import CCMSDashBoard.Model.ProduitRestitution;

import java.io.File;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by Meave Dregonhive on 18/04/2018.
 */
public class STATICS {

    public final static File BDD = new File ("/Users/macsamir/Desktop/BDD.txt");
    public final static File BDDPharmacies = new File ("/Users/macsamir/Desktop/BDDPharmacies.txt");



    public static DateTimeFormatter DATEFORMAT = DateTimeFormatter.ofPattern("dd-MM-yy");
    public static DateTimeFormatter DATETIMEFORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy    HH:mm");
    public static ArrayList<ProduitRestitution> Restitues = new ArrayList<>(); //BDD des medocs

    public static int posRestitue(int ID)
    {
        ProduitRestitution moment = new ProduitRestitution();
        moment.setID(ID);
        System.out.println("Found it " + Restitues.contains(moment));
        return Restitues.indexOf(moment);
    }

   /* public static ArrayList<ProduitRestitution> RestituesEnAttente = new ArrayList<>(); //BDD des medocs en attende de confirmation


    public static ArrayList<Pharmacie> PHARMACIES = new ArrayList<>(); //BDD des pharmacies


    public static ArrayList<Pharmacie> UTILISATEURSCONNECTES = new ArrayList<>();

    public static void sortUTILISATEURSCONNECTES()
    {
        Collections.sort(UTILISATEURSCONNECTES);
    }

    public static int NbUsersValue = 0;
    public static Text NbUsers = new Text("0"); //nb d'en ligne

    public static String logValue = LocalDateTime.now().format(DATETIMEFORMAT) + " ---------> Serveur lancé...\n";
    public static Text LOG = new Text(LocalDateTime.now().format(DATETIMEFORMAT) + " ---------> Serveur lancé...\n");
    public static void UpdateDisplayData()
    {
        NbUsers.setText(""+UTILISATEURSCONNECTES.size());
        LOG.setText(logValue);
    }

    //==================================================================================================
    public static ArrayList<Request> REQUESTS = new ArrayList<>();




    //==================================================================================================

    public static void sortPHARMACIES()
    {
        Collections.sort(PHARMACIES);
    }



    public static Pharmacie RecherchePharm(int ID)
    {
        sortPHARMACIES();
        Comparator<Pharmacie> c = new Comparator<Pharmacie>()
        {
            public int compare(Pharmacie u1, Pharmacie u2)
            {
                Integer ID1 = new Integer(u1.getID());
                Integer ID2 = new Integer(u2.getID());
                return ID1.compareTo(ID2);
            }
        };

        int pos = Collections.binarySearch(PHARMACIES, new Pharmacie(ID), c);
        if(pos >= 0) {
            System.out.println("Pharmacie " + PHARMACIES.get(pos).getNomPharma() + " connectée.");
            return PHARMACIES.get(pos);
        }
        else
        {
            System.out.println("Pharmacie non identifiée.");
            return null;
        }
    }

    public static Pharmacie RecherchePharmacieConnecté(int ID)
    {
        sortUTILISATEURSCONNECTES();
        Comparator<Pharmacie> c = new Comparator<Pharmacie>()
        {
            public int compare(Pharmacie u1, Pharmacie u2)
            {
                Integer ID1 = new Integer(u1.getID());
                Integer ID2 = new Integer(u2.getID());
                return ID1.compareTo(ID2);
            }
        };

        int pos = Collections.binarySearch(UTILISATEURSCONNECTES, new Pharmacie(ID), c);
        if(pos >= 0) {
            System.out.println("Pharmacie " + PHARMACIES.get(pos).getNomPharma() + " est active");
            return PHARMACIES.get(pos);
        }
        else
        {
            System.out.println("Pharmacie non connecté.");
            return null;
        }
    }
*/
}
