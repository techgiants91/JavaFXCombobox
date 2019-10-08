
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ComboBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Add fruits to combo box
        ComboBox cbFruits = new ComboBox();
        cbFruits.getItems().add("Apple");
        cbFruits.getItems().add("Orange");
        cbFruits.getItems().add("Banana");
        cbFruits.getItems().add("Apricots");
        cbFruits.getItems().add("Avocados");

        // Set defualt selected value from the list
        cbFruits.setValue("Banana");

        // Listener
        cbFruits.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue ov, String t, String t1) {
                System.out.println("Previous Value: "+t);
                System.out.println("Current Value: "+t1);
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(cbFruits);

        // Add GridPane to Scene
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX ComboBox Example");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
