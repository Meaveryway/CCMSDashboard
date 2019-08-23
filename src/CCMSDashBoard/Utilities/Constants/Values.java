package CCMSDashBoard.Utilities.Constants;

import java.io.File;
import java.time.format.DateTimeFormatter;

/**
 * Created by Meave Dregonhive on 23/08/2019.
 */
public class Values
{
    public final static File BDD = new File ("/Users/macsamir/Desktop/BDD.txt");
    public final static File ACCIDENTSLOG = new File ("/Users/macsamir/Desktop/Accidents_Log.txt");

    public static DateTimeFormatter DATEFORMAT = DateTimeFormatter.ofPattern("dd-MM-yy");
    public static DateTimeFormatter TIMEFORMAT = DateTimeFormatter.ofPattern("HH:mm");
    public static DateTimeFormatter DATETIMEFORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy    HH:mm");


}
