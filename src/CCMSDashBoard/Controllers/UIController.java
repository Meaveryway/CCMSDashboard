package CCMSDashBoard.Controllers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

import CCMSDashBoard.Launch;
import CCMSDashBoard.Model.Accident;
import CCMSDashBoard.Model.Location;
import CCMSDashBoard.Utilities.Constants.Objects;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.animation.RotateTransition;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.text.TabableView;

import static CCMSDashBoard.Utilities.Protocols.InstanceData.loadInstanceAccidents;

public class UIController implements Initializable
{
    private double xOffset = 0;
    private double yOffset = 0;
    @FXML private AnchorPane parent;

    @FXML private FontAwesomeIcon bellIcon;

    @FXML private TableView<Accident> tableView;

    @FXML private TableColumn<Accident, String> code;
    @FXML private TableColumn<Accident, String> location;
    @FXML private TableColumn<Accident, String> dateTime;
    @FXML private TableColumn<Accident, String> status;

    @FXML private TableColumn<Accident, String> policeStatus;
    @FXML private TableColumn<Accident, String> medicsStatus;
    @FXML private TableColumn<Accident, String> civilSecurityStatus;
    @FXML private TableColumn<Accident, String> towingStatus;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        makeStageDrageable();

        bellIcon.setFill(Color.valueOf("#C05931"));
        RotateTransition transition = new RotateTransition(Duration.seconds(0.3), bellIcon);
        transition.setFromAngle(45);
        transition.setToAngle(-45);
        transition.setCycleCount(20);
        transition.setAutoReverse(true);
        transition.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                RotateTransition backToOriginTransition = new RotateTransition(Duration.seconds(0.3), bellIcon);
                backToOriginTransition.setByAngle(-45);
                backToOriginTransition.play();
                bellIcon.setFill(Color.valueOf("#7b8184"));

            }
        });
        transition.play();
        //bellIcon.setDisable(true);

        code.setCellValueFactory(new PropertyValueFactory<Accident, String>("code"));
        location.setCellValueFactory(new PropertyValueFactory<Accident, String>("location"));
        dateTime.setCellValueFactory(new PropertyValueFactory<Accident, String>("dateTime"));
        status.setCellValueFactory(new PropertyValueFactory<Accident, String>("generalStatus"));

        policeStatus.setCellValueFactory(new PropertyValueFactory<Accident, String>("policeStatus"));
        civilSecurityStatus.setCellValueFactory(new PropertyValueFactory<Accident, String>("civilSecurityStatus"));
        medicsStatus.setCellValueFactory(new PropertyValueFactory<Accident, String>("medicsStatus"));
        towingStatus.setCellValueFactory(new PropertyValueFactory<Accident, String>("towingStatus"));

        loadInstanceAccidents();
        tableView.setItems(Objects.Accidents);

        Location momentLocation = new Location("Cité 5 Juillet, Bab Ezzouar", 45.765, 67.232);
        LocalDateTime momentDateTime = LocalDateTime.now();
        Accident momentAccident = new Accident("2019GH", momentLocation, momentDateTime,"Accidents grave avec 3 blessés", false, true);
        tableView.getItems().add(momentAccident);


    }


    private void makeStageDrageable() {
        parent.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        parent.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Launch.stage.setX(event.getScreenX() - xOffset);
                Launch.stage.setY(event.getScreenY() - yOffset);
                Launch.stage.setOpacity(0.7f);
            }
        });
        parent.setOnDragDone((e) -> {
            Launch.stage.setOpacity(1.0f);
        });
        parent.setOnMouseReleased((e) -> {
            Launch.stage.setOpacity(1.0f);
        });

    }

    public void openAccidentDetail(ActionEvent event) throws IOException
    {
        Objects.FocusedAccident = tableView.getItems().get(0);
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("CCMSDashBoard/View/DetailPopup.fxml"));
            Stage stage = new Stage();
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root, 600, 800));
            stage.setResizable(false);
            stage.show();
            // Hide this current window (if this is what you want)
            //((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
