package Application.UI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField lgnUName;
    @FXML
    private PasswordField lgnPField;
    @FXML
    private Label lgnError;
    @FXML
    private void signupClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        rootPane.getScene().getWindow().setHeight(500);
        rootPane.getChildren().setAll(root);
    }
    @FXML
    private void loginClick() {
        this.checker();
    }
    @FXML
    private void lgnCloseLgn(){
        ((Stage)rootPane.getScene().getWindow()).close();
    }
    @FXML
    private void clickKey(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER){
            checker();
        }
    }
    private void checker() {
        if (lgnUName.getText().isEmpty() || lgnPField.getText().isEmpty()){
            lgnError.setText("Мэдээлэлээ бүрэн оруулна уу");
            lgnError.setTextFill(Color.RED);
        }
        else{
            if (true){
                lgnError.setText("Амжилттай");
                lgnError.setTextFill(Color.GREEN);
            } else {
                lgnError.setText("Нэвтрэх нэр эсвэл нууц үг буруу байна");
                lgnError.setTextFill(Color.RED);
            }
        }
    }
}
