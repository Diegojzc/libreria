package com.tokioBiblioteca;

import dataBase.AppModel;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {



    @Override
    public void init() throws  Exception{
        super.init();
    }
    @Override
    public void start(Stage stage) throws Exception {
        AppView appView = new AppView(stage);
        AppModel appModel = new AppModel();
        AppControlador appControlador = new AppControlador(appView,appModel);
    }
    @Override
    public void stop()throws Exception{
        super.stop();
    }

    public static void main(String []args){
        launch();

    }


}
