package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	  public void start(Stage stage) {
	    GridPane grid = new GridPane();
	    VBox V = new VBox();
	    Button OK = new Button("OK");
	    Button Help = new Button("Help");
	    V.getChildren().add(OK);
	    V.getChildren().add(Help);
	    

	    grid.add(new Label("Enter the password"),0,0);
	    grid.add(new PasswordField(),0,1);
	    grid.add(V, 1, 2);
	    
	
	 stage.setScene(new Scene(grid,350,150));
	    stage.show();
	}
}
	

