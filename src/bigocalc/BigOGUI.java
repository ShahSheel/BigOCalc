/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigocalc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author shahs
 */
public class BigOGUI extends Application {
    
	  
      //Display Big O result 
      TextField result = new TextField();       
      
      Button _for = new Button("For(iter)"); 
      Button _while_b = new Button("While(Bool)");  
      Button _while_c = new Button("While(Cond)");  
      Button _while_i = new Button("While(iter)");  
      Button left_curly = new Button("{");  
      Button right_curly = new Button("}");  
      Button _if = new Button("if");  
      Button _run = new Button("Run");  
      
      final int buttonSize = 97;






    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();        
        Scene scene = new Scene(root, 300, 150);

        primaryStage.setTitle("Big O Calculator");
        root.getChildren().add(createResultBox());
        root.getChildren().add(createButtons());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public BorderPane createButtons(){
        BorderPane centerPanel = new BorderPane();
         
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(300,250);
        gridPane.setVgap(3);
        gridPane.setHgap(3);
        gridPane.setPadding(new Insets(100, 10, 10, 10)); 

     // gridPane.add(result, 0, 0); 
        left_curly.setPrefWidth(buttonSize);
        right_curly.setPrefWidth(buttonSize);
        _if.setPrefWidth(buttonSize);
        _run.setPrefWidth(buttonSize);
          _while_i.setPrefWidth(buttonSize);
        _while_c.setPrefWidth(buttonSize);
        _while_b.setPrefWidth(buttonSize);
        _for.setPrefWidth(buttonSize);
        

      gridPane.add(_for, 0, 0); 
      gridPane.add(_while_b, 1, 0); 
      gridPane.add(_while_c, 2, 0); 
      gridPane.add(_while_i, 2, 1);
      gridPane.add(left_curly, 1, 1); 
      gridPane.add(right_curly, 0, 1);   
      gridPane.add(_if, 0, 2);
      gridPane.add(_run, 2, 2);
      
      centerPanel.setCenter(gridPane);
      return centerPanel;
      //Creating a scene object 
    }
    
    public BorderPane createResultBox(){
        BorderPane resultBox = new BorderPane();
        result.setPrefHeight(45);
        result.disabledProperty();
        resultBox.setTop(result);
        return resultBox;
    }
    
    public void displayResult(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
