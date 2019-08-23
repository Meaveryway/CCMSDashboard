package CCMSDashBoard.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import CCMSDashBoard.Launch;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class UIController implements Initializable {

    private double xOffset = 0;
    private double yOffset = 0;
    @FXML
    private AnchorPane parent;
    @FXML
    private FontAwesomeIcon bellIcon;

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
}
