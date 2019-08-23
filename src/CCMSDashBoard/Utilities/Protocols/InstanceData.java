package CCMSDashBoard.Utilities.Protocols;

import CCMSDashBoard.Model.Accident;
import CCMSDashBoard.Model.Location;
import CCMSDashBoard.Utilities.Constants.Objects;

import java.time.LocalDateTime;

/**
 * Created by Meave Dregonhive on 23/08/2019.
 */
public class InstanceData
{
    public static void loadInstanceAccidents()
    {
        Location momentLocation = new Location("ESI Alger", "École Supérieure d'Informatique, Oued Smar", 45.765, 67.232);
        LocalDateTime momentDateTime = LocalDateTime.now();
        Accident momentAccident = new Accident("EF513", momentLocation, momentDateTime,"Accidents grave avec 3 blessés", false, true);
        Objects.Accidents.add(momentAccident);
    }
}
