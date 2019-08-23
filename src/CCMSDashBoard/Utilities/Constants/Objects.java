package CCMSDashBoard.Utilities.Constants;

import CCMSDashBoard.Model.Accident;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * Created by Meave Dregonhive on 18/04/2018.
 */
public class Objects
{



    //public static ArrayList<Accident> Accidents = new ArrayList<>(); //Liste des accidents en cours
    public static ObservableList<Accident> Accidents;

   /*




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
