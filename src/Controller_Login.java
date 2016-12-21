import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Controller_Login {

    @FXML
    private Label loginstatus_label;

    @FXML
    private TextField user_field;

    @FXML
    private PasswordField password_field;

    public void Login(ActionEvent event) throws Exception{
        if(user_field.getText().equals("123") && password_field.getText().equals("123")) {
            loginstatus_label.setText("Login Success");
            ((Node) event.getSource()).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Application.fxml"));

            // Set the window size to be based on the monitor's resolution
            Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
            primaryStage.setScene(new Scene(root, visualBounds.getWidth() / 1.25, visualBounds.getHeight() / 1.25));
            primaryStage.show();

        } else {
            System.out.println("Login Failed");
            loginstatus_label.setText("Incorrect login information.");
        }
    }
}

