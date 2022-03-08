package client;

import constants.Command;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RegController {
    @FXML
    public TextField loginField;
    @FXML
    public PasswordField passwordField;
    @FXML
    public TextField nicknameField;
    @FXML
    public javafx.scene.control.TextArea TextArea;

    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @FXML
    public void tryToReg(ActionEvent actionEvent) {
        String login = loginField.getText().trim();
        String password = passwordField.getText().trim();
        String nickname = nicknameField.getText().trim();

        controller.registration(login,password,nickname);
    }

    public void regResult(String command){
        if(command.equals(Command.REG_OK)){
            TextArea.appendText("Регистрация прошла успешно\n");
        }
        else{
            TextArea.appendText("Логин или никнейм заняты\n");
        }
    }
}
