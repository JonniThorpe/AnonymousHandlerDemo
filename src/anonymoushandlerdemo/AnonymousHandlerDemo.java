/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymoushandlerdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class AnonymousHandlerDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();
        Button btNew = new Button();
        btNew.setTranslateX(1);
        btNew.setText("New");
        
        btNew.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        Button btOpen = new Button();
        btOpen.setText("Open");
        btOpen.setTranslateX(31);
        btOpen.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        Button btSave = new Button();
        btSave.setText("Save");
        btSave.setTranslateX(61);
        btSave.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        Button btPrint = new Button();
        btPrint.setText("Print");
        btPrint.setTranslateX(91);
        btPrint.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        /*Hbox es el padre de los hijos por lo tanto 
        se guarda dentro del root*/
        StackPane root = new StackPane(hBox);
        hBox.getChildren().add(btNew);
        hBox.getChildren().add(btOpen);
        hBox.getChildren().add(btSave);
        hBox.getChildren().add(btPrint);
        
        Scene scene = new Scene(root, 300, 100);
        
        primaryStage.setTitle("AnonymouesHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
