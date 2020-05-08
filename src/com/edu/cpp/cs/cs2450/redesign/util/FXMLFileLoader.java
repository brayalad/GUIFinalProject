package com.edu.cpp.cs.cs2450.redesign.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public final class FXMLFileLoader {
    private static final FXMLLoader loader = new FXMLLoader();


    private FXMLFileLoader(){
        throw new UnsupportedOperationException();
    }


    public static Parent load(final String file){
        return load(new File(file));
    }

    public static Parent load(final File file){
        try {
            return load(new FileInputStream(file));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static Parent load(final InputStream is){
        try {
            return loader.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static Parent load(final URL url){
        try {
            return FXMLLoader.load(url);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
