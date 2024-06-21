import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RadioCheck extends Application{

    public static void main(String [] xx)
    {
        launch(xx);
    }

    public void start(Stage stage)  {

        final CheckBox cir=new CheckBox("Circle");
        cir.setLayoutX(100);
        cir.setLayoutY(100);

        final CheckBox rec=new CheckBox("Rectangle");
        rec.setLayoutX(200);
        rec.setLayoutY(100);
        
        final CheckBox squ=new CheckBox("Square");
        squ.setLayoutX(300);
        squ.setLayoutY(100);

        final RadioButton red = new RadioButton("Red");
        red.setLayoutX(100);
        red.setLayoutY(150);

         final RadioButton blue = new RadioButton("Blue");
        blue.setLayoutX(200);
        blue.setLayoutY(150);

        final RadioButton green = new RadioButton("Green");
        green.setLayoutX(300);
        green.setLayoutY(150);

        final ToggleGroup tg = new ToggleGroup();
        red.setToggleGroup(tg);
        blue.setToggleGroup(tg);
        green.setToggleGroup(tg);
        
        final Circle c1 = new Circle(200,400,100);
        final Rectangle r1 = new Rectangle(500,300,300,200);
        final Rectangle s1 = new Rectangle(900,300,200,200);
        c1.setVisible(false);
        r1.setVisible(false);
        s1.setVisible(false);

        cir.setOnMouseClicked(new EventHandler<Event>() {

            public void handle(Event arg0) {
                if(cir.isSelected())
                {
                    c1.setVisible(true);
                }
                else
                {
                    c1.setVisible(false);
                }
            }
            
        });
        rec.setOnMouseClicked(new EventHandler<Event>() {

            public void handle(Event arg0) {
                if(rec.isSelected())
                {
                r1.setVisible(true);
                }
                else
                {
                    r1.setVisible(false);
                }
            }
            
        });
        squ.setOnMouseClicked(new EventHandler<Event>() {

            public void handle(Event arg0) {
                if(squ.isSelected())
                {
                    s1.setVisible(true);
                }
                else
                {
                    s1.setVisible(false);
                }
            }
            
        });



        red.setOnMouseClicked(new EventHandler<Event>() {

            public void handle(Event arg0) {
                if(red.isSelected())
                {
                    c1.setFill(Color.RED);
                    r1.setFill(Color.RED);
                    s1.setFill(Color.RED);
                }
                
            }
        });

        blue.setOnMouseClicked(new EventHandler<Event>() {

            
            public void handle(Event arg0) {
                if(blue.isSelected())
                {                    
                    c1.setFill(Color.BLUE);
                    r1.setFill(Color.BLUE);
                    s1.setFill(Color.BLUE);
                }
                
            }
        });


        green.setOnMouseClicked(new EventHandler<Event>() {

            public void handle(Event arg0) {
                if(green.isSelected())
                {
                    c1.setFill(Color.GREEN);
                    r1.setFill(Color.GREEN);
                    s1.setFill(Color.GREEN);
                }
                
            }
        });
        Group root = new Group(cir,rec,squ,c1,r1,s1,red,blue,green);
        Scene scene = new Scene(root, 1200, 600);
        stage.setScene(scene);
        stage.setTitle("Change color");
        stage.show();


    }

}