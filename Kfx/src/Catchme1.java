import java.util.Random;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Catchme1 extends Application
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	public void start(Stage stage)
	
	{
		final Random ra = new Random();
			
		Label lab = new Label("KYA JAINISH INSHAAN HAI?");
		
		lab.setLayoutX(100);
		lab.setLayoutY(100);
		lab.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD,30 ));
		
		Button by = new Button("YES");
		by.setLayoutX(200);
		by.setLayoutY(200);
		by.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD,30));
		
		final Button by1 = new Button("NO");
		by1.setLayoutX(400);
		by1.setLayoutY(200);
		by1.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD,30));
		
		by1.setOnMouseEntered(new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent me) {
				// TODO Auto-generated method stub
				//by1.setVisible(false);	
				//by1.setText("YES");
				
				int c = ra.nextInt(1100);
				int r = ra.nextInt(600);
				
				by1.setLayoutX(c);
				by1.setLayoutY(r);
				}	
		});
		
		
		
			by1.setOnMouseExited(new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent me) {
				// TODO Auto-generated method stub
				
			}
			
		});
		Group root = new Group(lab,by,by1);
		Scene scene = new Scene(root, 1200, 700); 
		//this 4 lines are mandatory
		scene.setFill(Color.CHOCOLATE);
		
		stage.setScene(scene);
		
		stage.show();
	}

}
