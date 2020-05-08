/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.cpp.cs.cs2450.redesign;

import com.edu.cpp.cs.cs2450.redesign.config.Configuration;
import com.edu.cpp.cs.cs2450.redesign.util.FXMLFileLoader;
import javafx.application.Application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author plain
 */
public final class UserInterfaceRedesign extends Application {


    @Override
    public void start(final Stage stage) {
        final Parent root = FXMLFileLoader.load(getClass().getResource(Configuration.FXML_DOCUMENT_PATH));

        final Scene scene = new Scene(root);

        stage.setTitle(Configuration.TITLE);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String ...args) {
        launch(args);
    }
    
}
