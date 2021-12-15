package com.bilgiadam.boost.java.course01.lesson067;

import com.bilgiadam.boost.java.course01.lesson067.controller.PersonControllerImpl;
import com.bilgiadam.boost.java.course01.lesson067.entity.PersonEntity;
import com.bilgiadam.boost.java.course01.lesson067.model.Person;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		Person p1 = new Person(1, "AAAA", "BBBB");
		PersonEntity pE = new PersonEntity(p1);
		
		PersonControllerImpl controller = new PersonControllerImpl();
		controller.create(pE);
		
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("Person.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
