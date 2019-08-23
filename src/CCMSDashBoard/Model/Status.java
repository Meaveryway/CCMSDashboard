package CCMSDashBoard.Model;

/**
 * Created by Meave Dregonhive on 23/08/2019.
 */
public enum Status
{

    //General status
    NOTTREATED("Non traité"),
    INPROGRESS("En cours"),
    FINISHED("Terminé"),
    UNKNOWN("Inconnu"),

    //Status related to a service: Police, Civil Security, Medics and Towing.

    NOTNECESSARY("Non nécessaires"),
    NOTNOTIFIED("Non Notifiés"),
    NOTIFIED("Notifiés"),
    ONWAY("En Route"),
    ONPLACE("Déployés"),
    HAVINGISSUES("Problèmes"),
    MOVINGVICTIMS("Repatriement des blessés"),
    MOVINGVEHICLES("Deplassement des véhicules");

    private String statusText;

    Status(String statusText)
    {
        this.statusText = statusText;
    }

    public String StatusText()
    {
        return statusText;
    }
}
