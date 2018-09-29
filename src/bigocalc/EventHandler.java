/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigocalc;

import javafx.event.ActionEvent;

/**
 *
 * @author shahs
 */
public class EventHandler extends BigOGUI {
    
        BigOGUI object = new BigOGUI();
     
        public void _runEvent(){
            object._run.setOnAction(new javafx.event.EventHandler<ActionEvent> () {
            @Override public void handle(ActionEvent e) {
                System.out.println("Run");
            }
            });
        }
        
         public void clickedIf(){
            object._if.setOnAction(new javafx.event.EventHandler<ActionEvent> () {
            @Override public void handle(ActionEvent e) {
                System.out.println("If");
            }
            });
        }
         
          public void clickedWhile_B(){
            object._while_b.setOnAction(new javafx.event.EventHandler<ActionEvent> () {
            @Override public void handle(ActionEvent e) {
                System.out.println("While B");
            }
            });
        }
           public void clickedWhile_C(){
            object._while_c.setOnAction(new javafx.event.EventHandler<ActionEvent> () {
            @Override public void handle(ActionEvent e) {
                System.out.println("While C");
            }
            });
        }
            public void clickedWhile_I(){
            object._while_i.setOnAction(new javafx.event.EventHandler<ActionEvent> () {
            @Override public void handle(ActionEvent e) {
                System.out.println("While I");
            }
            });
        }
            public void clickedLeftCurlyBracket(){
            object.left_curly.setOnAction(new javafx.event.EventHandler<ActionEvent> () {
            @Override public void handle(ActionEvent e) {
                System.out.println("Left C");
            }
            });
        }
           public void clickedRightCurlyBracket(){
            object.right_curly.setOnAction(new javafx.event.EventHandler<ActionEvent> () {
            @Override public void handle(ActionEvent e) {
                System.out.println("Right C");
            }
            });
        }
            
}
