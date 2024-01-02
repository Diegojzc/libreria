package com.tokioBiblioteca;

import componentes.*;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppView {

    public BorderPane borderPane;
    public AppLabel appLabel;
    public AppHbox appHbox;
    public  AppSplitPane appSplitPane;
    public AppView appView;

    public AppView(Stage stage){
        super();
        iniciarComponenetes();
        Scene scene = new Scene(borderPane,750,450);
        stage.setScene(scene);
        stage.show();
    }
    public void iniciarComponenetes(){

        borderPane = new BorderPane();

        appLabel = new AppLabel();
        appSplitPane = new AppSplitPane();
        appHbox = new AppHbox();

        borderPane.setTop(appHbox);
        borderPane.setBottom(appLabel);
        borderPane.setCenter(appSplitPane);

    }
}
