package com.example.javafxdemo;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage primaryStage;
    private static Scene primaryScene;

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Store the primary stage object
        HelloApplication.primaryStage = primaryStage;

        // Create the navbar
        Navbar navbar = new Navbar();

        // Create the homepage UI
        BorderPane homepage = new BorderPane();
        homepage.setTop(navbar);
        homepage.setCenter(new Label("Welcome to My App!"));

        // Set the scene
        primaryScene = new Scene(homepage, 800, 600);
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public Scene createNavBar(Stage primaryStage) {

        // Create the navbar container
        VBox navbar = new VBox();
        navbar.setPadding(new Insets(10));
        navbar.setStyle("-fx-background-color: #333;");

        // Create the navbar content
        HBox navbarContent = new HBox();
        navbarContent.setSpacing(10);
        navbar.getChildren().add(navbarContent);

        // Create the navbar logo
        Region logo = new Region();
        HBox.setHgrow(logo, Priority.ALWAYS);
        navbarContent.getChildren().add(logo);

        // Create the navbar buttons
        Button studentButton = new Button("Student Dashboard");
//        studentButton.setGraphic(new FontAwesomeIconView(FontAwesomeIcon.USERS));
        studentButton.setOnAction(e -> {
            Scene studentScene = StudentDashboard.createScene();
            primaryStage.setScene(studentScene);
        });
        navbarContent.getChildren().add(studentButton);

        Button instructorButton = new Button("Instructor Dashboard");
//        instructorButton.setGraphic(new FontAwesomeIconView(FontAwesomeIcon.USER));
        instructorButton.setOnAction(e -> {
            Scene instructorScene = InstructorDashboard.createScene();
            primaryStage.setScene(instructorScene);
        });
        navbarContent.getChildren().add(instructorButton);

        Button courseButton = new Button("Course Details");
//        courseButton.setGraphic(new FontAwesomeIconView(FontAwesomeIcon.BOOK));
        courseButton.setOnAction(e -> {
            Scene courseScene = CourseDetails.createScene();
            primaryStage.setScene(courseScene);
        });
        navbarContent.getChildren().add(courseButton);

        Button loginButton = new Button("Login");
//        loginButton.setGraphic(new FontAwesomeIconView(FontAwesomeIcon.SIGN_IN));
        loginButton.setOnAction(e -> {
            Scene loginScene = Login.createScene();
            primaryStage.setScene(loginScene);
        });

        VBox mainContent = new VBox();
        mainContent.setPadding(new Insets(10));
        mainContent.getChildren().add(new Label("Welcome to my app!"));

        // Create the root container
        VBox root = new VBox();
        root.getChildren().addAll(navbar, mainContent);


        // Set the scene
        Scene scene = new Scene(root, 800, 600);


        return scene;
    }

    public static Stage getPrimaryStage() {
        return HelloApplication.primaryStage;
    }

    public static Scene getPrimaryScene() {
        return HelloApplication.primaryScene;
    }
}