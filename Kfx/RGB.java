import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class RGB extends Application
{
	public static void main(String args[])
	{
		launch(args);
	}
	
	public void start(Stage stage)
	{
		Button br = new Button("RED");
		br.setLayoutX(100);
		br.setLayoutY(100);
		
		Button bg = new Button("GREEN");
		bg.setLayoutX(400);
		bg.setLayoutY(100);
		
		Button bb = new Button("BLUE");
		bb.setLayoutX(700);
		bb.setLayoutY(100);
		
		Button bl = new Button("LEFT");
		bl.setLayoutX(100);
		bl.setLayoutY(150);
		
		Button bc = new Button("CENTER");
		bc.setLayoutX(400);
		bc.setLayoutY(150);
		
		Button brr = new Button("RIGHT");
		brr.setLayoutX(700);
		brr.setLayoutY(150);
		
		
		final Circle c1 = new Circle(500, 400, 100);
		br.setOnMouseClicked(new EventHandler<MouseEvent>()
				{
					
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						c1.setFill(Color.RED);
					}}
		);
		
		
		bg.setOnMouseClicked(new EventHandler<MouseEvent>()
				{
					
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						c1.setFill(Color.GREEN);
					}}
		);
		
		
		bb.setOnMouseClicked(new EventHandler<MouseEvent>()
				{
					
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						c1.setFill(Color.BLUE);
					}}
		);
		
		bl.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				c1.setLayoutX(-350);
				c1.setLayoutY(0);
			}}
);
		
		bc.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				c1.setLayoutX(0);
				c1.setLayoutY(0);
			}}
);
		brr.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				c1.setLayoutX(350);
				c1.setLayoutY(0);
			}}
);
		
		Group root = new Group(br , bg, bb,bl, bc, brr , c1);
		Scene scene = new Scene(root, 1200,600);
		stage.setScene(scene);
		stage.setTitle("CHANGE COLOR");
		stage.show();
	}
}