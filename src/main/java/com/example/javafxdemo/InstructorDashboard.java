package com.example.javafxdemo;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class InstructorDashboard {

    public static Scene createScene() {
        // Create the instructor dashboard UI here
        Navbar navbar = new Navbar();

        // Create the homepage UI
        BorderPane homepage = new BorderPane();
        homepage.setTop(navbar);
        homepage.setCenter(new Label("Instructor Dashboard"));

        // Set the scene
        Scene scene = new Scene(homepage, 800, 600);
        return scene;
    }
}

