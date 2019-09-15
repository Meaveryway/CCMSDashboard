package CCMSDashBoard.Services;

import CCMSDashBoard.Model.Accident;
import CCMSDashBoard.Utilities.Constants.Objects;
import CCMSDashBoard.Utilities.Protocols.Parsers;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Meave Dregonhive on 22/08/2019.
 */
public class BackendAlertManager implements Runnable
{

    private JSONObject accident;

    @Override
    public void run()
    {
        try
        {
            AlertToBackend();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }

    public void setAccident(JSONObject accident)
    {
        this.accident = accident;
    }

    private void AlertToBackend() throws Exception
    {
        String USER_AGENT = "Mozilla/5.0";

        String url = "https://geniustraffic.herokuapp.com/notifying"; //URL to send request to
        URL objurl = new URL(url);

        HttpURLConnection connection = (HttpURLConnection) objurl.openConnection();
        //connection.setConnectTimeout(4000);
        connection.setRequestMethod("POST"); //request type = GET, POST, DELETE, ...
        connection.setRequestProperty("User-Agent", USER_AGENT);
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("Content-Type", "application/json; utf-8");

        connection.setDoOutput(true);
        int responseCode = 0;
        try
        {
            try(OutputStream os = connection.getOutputStream()) {
                byte[] input = Objects.FocusedAccident.getJsonObject().toJSONString().getBytes("utf-8");
                System.out.println("Test ========"+Objects.FocusedAccident.getJsonObject().toJSONString());
                os.write(input, 0, input.length);
            }

            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response.toString());
            }
        }
        catch(Exception exception)
        {
            if (responseCode < 503)
                exception.printStackTrace();
        }
        finally
        {

        }

    }

}
