package CCMSDashBoard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launch extends Application {

    public static Stage stage = null;

    @Override
    public void start(Stage stage) throws Exception { Parent root = FXMLLoader.load(getClass().getResource("View/UI.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //stage.initStyle(StageStyle.UNDECORATED); //To hide control buttons
        this.stage = stage;
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
