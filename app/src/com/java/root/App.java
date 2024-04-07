package src.com.java.root;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import com.java.NativeInterface;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        NativeInterface obj = new NativeInterface();
        obj.nativeMethod();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
