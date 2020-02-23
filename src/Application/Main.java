package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private double x, y;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("UI/Login.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        //Mouse darahad bairlaliig n avna
        root.setOnMousePressed(event->{
            x = event.getSceneX();
            y = event.getScreenY();
        });
        //Mouse chirhed hemjeegee oorchlono
        root.setOnMouseDragged(event->{
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);
        });
    }
    public static void main(String[] args) {
        launch(args);
    }
}
