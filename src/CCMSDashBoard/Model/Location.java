package CCMSDashBoard.Model;

/**
 * Created by Meave Dregonhive on 23/08/2019.
 */
public class Location
{
    private String name; //just the big name of the address
    private String address; //full address
    private double latitude;
    private double longitude;

    public Location(String name, String address, double latitude, double longitude)
    {
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
