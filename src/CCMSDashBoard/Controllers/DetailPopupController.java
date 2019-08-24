package CCMSDashBoard.Controllers;

import CCMSDashBoard.Utilities.Constants.Objects;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Meave Dregonhive on 24/08/2019.
 */
public class DetailPopupController implements Initializable
{
    @FXML private Text code;

    @FXML private Text datetime;

    @FXML private Text location;

    @FXML private TextArea description;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        System.out.println("Code = " + Objects.FocusedAccident.getCode());
        code.setText(Objects.FocusedAccident.getCode());
        datetime.setText(Objects.FocusedAccident.getDateTime());
        this.location.setText(Objects.FocusedAccident.getLocation());
        description.setText(Objects.FocusedAccident.getDescription());
    }
}
