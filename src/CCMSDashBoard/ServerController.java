package CCMSDashBoard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ServerController implements Initializable {

    @FXML
    Text NombreEnLigne = new Text();

    @FXML
    Text log = new Text();


    @FXML
    void send(ActionEvent event)
    {
        //SMSContacter.SendSMSRequest("+213781340767", "shut up");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //NombreEnLigne.textProperty().bind(STATICS.NbUsers.textProperty());
        //log.textProperty().bind(STATICS.LOG.textProperty());


    }


}