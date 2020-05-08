/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.cpp.cs.cs2450.redesign.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import com.edu.cpp.cs.cs2450.redesign.animation.CarSlideShow;
import com.edu.cpp.cs.cs2450.redesign.config.CarModels;

import static com.edu.cpp.cs.cs2450.redesign.config.CarMakes.getCarMakeDisplayRoot;

/**
 *
 * @author plain
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Pane slider;

    @FXML
    private Label label;

    @FXML
    private ComboBox<String> makeCombo;
    
    @FXML
    private ComboBox<String> modelCombo;

    @FXML
    private VBox cars;

    @FXML
    private ScrollPane scroll;


    @Override
    public void initialize(URL url, ResourceBundle rb)  {
        cars.getChildren().addAll(getCarMakeDisplayRoot().getChildren());
        cars.minWidthProperty().bind(
                Bindings.createDoubleBinding(
                        () -> scroll.getViewportBounds().getDepth(),
                        scroll.viewportBoundsProperty()
                )
        );

        slider.getChildren().addAll(CarSlideShow.get().getChildren());

        makeCombo.setItems(CarModels.getMakes());

        makeCombo.setOnAction(e -> modelCombo.setItems(CarModels.getModels(makeCombo.getSelectionModel().getSelectedItem())));
    }    
    
}
