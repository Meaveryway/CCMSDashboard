package CCMSDashBoard.Utilities.Protocols;

import CCMSDashBoard.Model.Accident;
import CCMSDashBoard.Model.Location;
import CCMSDashBoard.Utilities.Constants.Values;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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

    public static LocalDateTime parseTimeStamp(long timestamp)
    {
        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp), TimeZone.getDefault().toZoneId());
        return date;
    }

    public static void writeJSON()
    {
        JSONObject location = new JSONObject();
        location.put("name","Bab Ezzouar");
        location.put("longitude","1423452432");
        location.put("latitude","312413113");

        JSONObject locationObject = new JSONObject();
        locationObject.put("location", location);

        //Write JSON file
        try (FileWriter file = new FileWriter("accident.json")) {

            file.write(locationObject.toJSONString());
            file.flush();
            System.out.println("accident = " + locationObject);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static Accident parseAccidentObject(JSONObject jsonAccident)
    {
        //Get employee object within list
        JSONObject accidentObject = (JSONObject) jsonAccident.get("accident");
        JSONObject locationObject = (JSONObject) jsonAccident.get("location");

        //Get employee first name
        String description = (String) accidentObject.get("description");
        System.out.println(description);

        //Get employee last name
        Double dateheure = (Double) accidentObject.get("dateheure");
        System.out.println(dateheure);

        //Get employee website name
        Double latitude =  (Double) locationObject.get("latitude");
        Double longitude = (Double) locationObject.get("longitude");
        String name = (String) locationObject.get("name");
        System.out.println(latitude);
        System.out.println(longitude);
        System.out.println(name);

        return new Accident("5253BG", new Location(name, latitude,longitude), LocalDateTime.now(), description, false, false);
    }


}
