package CCMSDashBoard.Model;

/**
 * Created by Meave Dregonhive on 23/08/2019.
 */
public class Location
{
    private String address; //full address
    private double latitude;
    private double longitude;

    public Location(String address, double latitude, double longitude)
    {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAddress()
    {
        return address;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }
}
