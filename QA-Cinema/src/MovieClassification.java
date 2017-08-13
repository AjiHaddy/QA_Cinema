import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;



public class MovieClassification extends Application{

	Stage window;
	Scene scene;
	Button button;
	ComboBox<String> box;
/*
	String[] movieClass = { "U", "PG", "12A", "12", "15", "18"};

  JTextField text = new JTextField(26);

  JComboBox<String> box;

*/
 
 public MovieClassification()
 {

	 
	 }
 
 
 public static void main(String [] args)
 {
	 launch(args);
 }
 

@Override
public void start(Stage primaryStage) throws Exception {
		window= primaryStage;
		window.setTitle("This is superstition");
		button = new Button("Submit");
		
		box = new ComboBox<>();
		box.getItems().addAll("U",
				"PG", 
				"12A",
				"12", 
				"15", 
				"18");
		
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(box,button);
		
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
}
}