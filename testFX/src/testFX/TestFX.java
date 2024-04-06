package testFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestFX extends Application{
	Button button;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World!");
		
		button = new Button();
		//bruh
		button.setText("Click me");
		button.setOnAction(e -> System.out.println("what up"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		
		
		Label label = new Label("Egg Sandwich");
		
		
		VBox vbox = new VBox(20); ///
		vbox.setAlignment(Pos.TOP_CENTER);
		vbox.getChildren().add(createFoodItem("Egg sandwich"));
		vbox.getChildren().add(createFoodItem("Chicken sandwich"));
		vbox.getChildren().add(createFoodItem("Bagel"));
		vbox.getChildren().add(createFoodItem("Potato salad"));
		
		layout.getChildren().add(vbox);
		
		
		ToggleGroup toggleGroup = new ToggleGroup();
		RadioButton blackTeaButton = new RadioButton("Black Tea");
		blackTeaButton.setToggleGroup(toggleGroup);
		
		RadioButton greenTeaButton = new RadioButton("Green Tea");
		greenTeaButton.setToggleGroup(toggleGroup);
		
		RadioButton coffeeButton = new RadioButton("Coffee");
		coffeeButton.setToggleGroup(toggleGroup);
		
		
		Scene scene = new Scene(layout, 800, 800);
		primaryStage.setScene(scene); 
		
		primaryStage.show();

	}
	
	private HBox createFoodItem(String labelText) {
		HBox hbox = new HBox(20);
		
		Spinner<Integer> mySpinner = new Spinner<>(0, Integer.MAX_VALUE, 0);
		Label label = new Label(labelText);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(mySpinner, label);
		
		
		return hbox;
	}
	
	
	
	public static void main(String[] args) {
		launch();

	}

}
