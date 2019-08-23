package CCMSDashBoard.Utilities.Protocols;

import CCMSDashBoard.Utilities.Constants.Values;

import java.time.LocalDateTime;

/**
 * Created by Meave Dregonhive on 23/08/2019.
 */
public class Parsers
{
    public static String parseDateTime(LocalDateTime localDateTime)
    {
        return localDateTime.format(Values.DATETIMEFORMAT);
    }

    public static String parseDate(LocalDateTime localDateTime)
    {
        return localDateTime.format(Values.DATEFORMAT);
    }

    public static String parseTime(LocalDateTime localDateTime)
    {
        return localDateTime.format(Values.TIMEFORMAT);
    }
}
