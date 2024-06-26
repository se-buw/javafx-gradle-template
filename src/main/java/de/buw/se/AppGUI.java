/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package de.buw.se;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppGUI extends Application {

    @Override
    public void start(Stage stage) {
        // one text field to display authors and to add a new author
        TextField textField = new TextField();
        
        // button to load authors will call the printAuthors method
        Button loadBtn = new Button("Load Authors");
        loadBtn.setOnAction(e -> printAuthors(textField));

        // button to add a new author will call the addBook method
        Button addBtn = new Button("Add Author");
        addBtn.setOnAction(e -> addBook(textField.getText()));
        
        // add button and text field to the layout
        Pane layout = new VBox(2);
        layout.getChildren().addAll(loadBtn, textField, addBtn);
        Scene scene = new Scene(layout, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Add a new book to the DB using the DataStoreSql class
     * @param author
     */
    private void addBook(String author) {
        DataStoreSql.addBook(author, "New Book");
    }

    /**
     * Print authors to the text field using the DataStoreSql class
     * @param textField
     */
    private void printAuthors(TextField textField) {
        String authors = DataStoreSql.readAuthors().toString();
        textField.setText(authors);
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * 
     * Don't modify this method.
     * 
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }

}