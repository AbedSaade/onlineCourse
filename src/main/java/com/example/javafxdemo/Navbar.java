package com.example.javafxdemo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class Navbar extends HBox {

    public Navbar() {
        super();
        this.getChildren().addAll(createNavbar());
    }

    private VBox createNavbar() {
        // Create the navbar container
        VBox navbar = new VBox();
        navbar.setStyle("-fx-background-color: navy;");

        // Create the navbar content
        HBox navbarContent = new HBox();
        navbarContent.setSpacing(10);
        navbar.getChildren().add(navbarContent);

        // Create the navbar logo
        Region logo = new Region();
        HBox.setHgrow(logo, Priority.ALWAYS);
        navbarContent.getChildren().add(logo);

        // Create the navbar buttons
        Button homeButton = new Button("Home");
        homeButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.5), 10, 0, 0, 1); -fx-font-size: 16px; -fx-text-fill: white; -fx-padding: 10px 20px;");
        homeButton.setOnAction(e -> {
//            Scene homeScene = HelloApplication.createScene();
            HelloApplication.getPrimaryStage().setScene(HelloApplication.getPrimaryScene());
        });
        navbarContent.getChildren().add(homeButton);


        Button studentButton = new Button("Student Dashboard");
        studentButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.5), 10, 0, 0, 1); -fx-font-size: 16px; -fx-text-fill: white; -fx-padding: 10px 20px;");
        studentButton.setOnAction(e -> {
            Scene studentScene = StudentDashboard.createScene();
            HelloApplication.getPrimaryStage().setScene(studentScene);
        });
        navbarContent.getChildren().add(studentButton);

        Button instructorButton = new Button("Instructor Dashboard");
        instructorButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.5), 10, 0, 0, 1); -fx-font-size: 16px; -fx-text-fill: white; -fx-padding: 10px 20px;");
        instructorButton.setOnAction(e -> {
            Scene instructorScene = InstructorDashboard.createScene();
            HelloApplication.getPrimaryStage().setScene(instructorScene);
        });
        navbarContent.getChildren().add(instructorButton);

        Button courseButton = new Button("Course Details");
        courseButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.5), 10, 0, 0, 1); -fx-font-size: 16px; -fx-text-fill: white; -fx-padding: 10px 20px;");
        courseButton.setOnAction(e -> {
            Scene courseScene = CourseDetails.createScene();
            HelloApplication.getPrimaryStage().setScene(courseScene);
        });
        navbarContent.getChildren().add(courseButton);

        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.5), 10, 0, 0, 1); -fx-font-size: 16px; -fx-text-fill: white; -fx-padding: 10px 20px;");
        loginButton.setOnAction(e -> {
            Scene loginScene = Login.createScene();
            HelloApplication.getPrimaryStage().setScene(loginScene);
        });
        navbarContent.getChildren().add(loginButton);

        return navbar;
    }
}
