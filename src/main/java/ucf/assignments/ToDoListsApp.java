/*
 *  UCF COP3330 fall 2021 Application Assignment 1, Part 1
 *  Copyright 2021 Palmer Ilnisky
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDoListsApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ToDoLists.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("To Do List");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
