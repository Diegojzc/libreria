package com.tokioBiblioteca;

import dataBase.AppModel;
import domain.Libros;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Alert;

public class AppControlador implements EventHandler<ActionEvent> {

    public AppView appView;
    public AppModel appModel;
    public enum Action{
        ADD,EDIT
    }
    private Action action;

    public AppControlador(AppView appView, AppModel appModel) throws Exception {
        this.appView = appView;
        this.appModel = appModel;
        addAction();
      //  cargarLibros();

    }

    public void cargarLibros() {
        try {

            appView.appSplitPane.appLista.listaView.getItems().addAll(appModel.getLibros());

        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR, "Error");
            alerta.show();
        }
    }


    private void addAction() {
        appView.appSplitPane.appGridPane.appButtonPane.anadir.setOnAction(this);
        appView.appSplitPane.appGridPane.appButtonPane.editar.setOnAction(this);
        appView.appSplitPane.appGridPane.appButtonPane.borrar.setOnAction(this);
        appView.appSplitPane.appGridPane.appButtonPane.guardar.setOnAction(this);
        appView.appSplitPane.appGridPane.appButtonPane.cancelar.setOnAction(this);

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Node node = (Node) actionEvent.getSource();
        String userData = node.getUserData().toString();
        switch (userData) {
            case "añadir":
             appView.appSplitPane.appGridPane.limpiar();

                break;
            case "editar":


                break;
            case "borrar":

                break;
            case "guardar":

                String nombre = appView.appSplitPane.appGridPane.ttitulo.getText();
                String autor = appView.appSplitPane.appGridPane.tautor.getText();
                float precio = Float.parseFloat(appView.appSplitPane.appGridPane.tprecio.getText());

                Libros libros = new Libros(nombre, autor, precio);
                appModel.addLibros(libros);
                appView.appSplitPane.appLista.listaView.getItems().add(libros);
                cargarLibros();
                break;
            case "cancelar":

                break;

        }
    }
}
