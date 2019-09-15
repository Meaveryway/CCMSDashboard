package CCMSDashBoard.Controllers;

import CCMSDashBoard.Model.Accident;
import CCMSDashBoard.Services.BackendAlertManager;
import CCMSDashBoard.Services.BackendManager;
import CCMSDashBoard.Utilities.Constants.Objects;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
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

    @FXML
    private JFXCheckBox checkbox;

    @FXML
    private JFXButton alertButton;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        System.out.println("Code = " + Objects.FocusedAccident.getCode());
        code.setText(Objects.FocusedAccident.getCode());
        datetime.setText(Objects.FocusedAccident.getDateTime());
        this.location.setText(Objects.FocusedAccident.getLocation());
        description.setText(Objects.FocusedAccident.getDescription());
        System.out.println("test  = "+ Objects.FocusedAccident.getJsonObject().toString());

    }

    @FXML
    void Alert(ActionEvent event)
    {
        if (checkbox.isSelected())
        {
            System.out.println("will send alert");
            Task<Boolean> task = new Task<Boolean>() {
                @Override
                public Boolean call() {
                    try {
                        System.out.println("launching Backend Manager");
                        BackendAlertManager request = new BackendAlertManager();
                        request.run();
                        System.out.println("terminated");
                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                    return true;
                }};

            new Thread(task).start();
        }
    }

}
