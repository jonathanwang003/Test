import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        root.getStylesheets().add(Main.class.getResource("login_bg.css").toExternalForm());

        // Set the window size to be based on the monitor's resolution
        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setScene(new Scene(root, visualBounds.getWidth() / 1.25, visualBounds.getHeight() / 1.25));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
