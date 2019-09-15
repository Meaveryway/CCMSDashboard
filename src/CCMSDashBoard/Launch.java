package CCMSDashBoard;

import CCMSDashBoard.Services.BackendManager;
import CCMSDashBoard.Utilities.Protocols.Parsers;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Launch extends Application {

    public static Stage stage = null;

    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("View/UI.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //stage.initStyle(StageStyle.UNDECORATED); //To hide control buttons
        this.stage = stage;
        stage.show();




        Task<Boolean> task = new Task<Boolean>() {
            @Override
            public Boolean call() {
                try {
                    System.out.println("launching Backend Manager");
                    BackendManager request = new BackendManager();
                    request.run();
                    System.out.println("terminated");
                } catch (Exception e) {
                    e.printStackTrace();

                }
                return true;
            }};

        new Thread(task).start();

        System.out.println(Parsers.parseTimeStamp(1613064590));
        Parsers.writeJSON();

    }


    public static void main(String[] args)
                {
        launch(args);
    }

}
