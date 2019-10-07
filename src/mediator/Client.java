package mediator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Client extends Application  {

    @Override
    public void start(Stage primaryStage) {
        UIMediator mediator = new UIMediator();
        TextBox textBox = new TextBox(mediator);
        MySlider slider = new MySlider(mediator);
        MyLabel label = new MyLabel(mediator);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setPadding(new Insets(25, 25, 25, 25));

        grid.add(label, 0, 0);
        grid.add(slider, 0, 1);
        grid.add(textBox, 0, 2);

        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setTitle("Mediator pattern");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
