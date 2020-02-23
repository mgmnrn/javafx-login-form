package Application.UI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
                                      
public class SignupController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField newFName;
    @FXML
    private TextField newLName;
    @FXML
    private TextField newUName;
    @FXML
    private DatePicker newDate;
    @FXML
    private ToggleGroup gender;
    @FXML
    private PasswordField newPassword;
    @FXML
    private Label sgnError;

    @FXML
    private void loginClick() throws IOException {
        callLogin();
    }

    @FXML
    private void signupClick() {
        boolean status = true;
        if (newFName.getText().isEmpty()) {
            newFName.setStyle(newFName.getStyle() + "-fx-border-color: red;");
            status = false;
        } else {
            newFName.setStyle(newFName.getStyle() + "-fx-border-color: #9643A9;");
        }
        if (newLName.getText().isEmpty()) {
            newLName.setStyle(newLName.getStyle() + "-fx-border-color: red;");
            status = false;
        } else {
            newLName.setStyle(newLName.getStyle() + "-fx-border-color: #9643A9;");
        }
        if (newUName.getText().isEmpty()) {
            newUName.setStyle(newUName.getStyle() + "-fx-border-color: red;");
            status = false;
        } else {
            newUName.setStyle(newUName.getStyle() + "-fx-border-color: #9643A9;");
        }
        if (newPassword.getText().isEmpty()) {
            newPassword.setStyle(newPassword.getStyle() + "-fx-border-color: red;");
            status = false;
        } else {
            if (newPassword.getText().length() < 20 && newPassword.getText().length() > 7) {
                newPassword.setStyle(newPassword.getStyle() + "-fx-border-color: #9643A9;");
            } else {
                newPassword.setStyle(newPassword.getStyle() + "-fx-border-color: red;");
                status = false;
            }
        }
        if (newDate.getValue() != null) {
            newDate.setStyle("-fx-background-color: #9643A9;");
        } else {
            newDate.setStyle("-fx-background-color: red;");
            status = false;
        }
        RadioButton rb = (RadioButton) gender.getSelectedToggle();
        if (rb == null) {
            status = false;
        }

        if (status) {
            if (true) {
                sgnError.setText("Бүртгэгдлээ");
                sgnError.setTextFill(Color.GREEN);
            }
        } else {
            sgnError.setText("Та мэдээлэлээ бүрэн оруулна уу");
            sgnError.setTextFill(Color.RED);
        }
    }

    @FXML
    private void clickKey(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            signupClick();
        }
    }

    private void callLogin() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
        rootPane.getScene().getWindow().setHeight(300);
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    private void lgnCloseSgn() {
        ((Stage)rootPane.getScene().getWindow()).close();
    }
}
