package componentes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import util.Imagen;

import java.awt.*;

public class AppButtonPane extends HBox {
    public Button anadir, editar, borrar,guardar, cancelar;

    public AppButtonPane() {
        super();
        iniciarComponentes();

    }

    public void iniciarComponentes() {

        setPadding(new Insets(5,5,5,5));
        setSpacing(10);
        setAlignment(Pos.CENTER);

        anadir = new Button();
        anadir.setUserData("anadir");
        anadir.setGraphic(Imagen.getImagen("anadir"));
        editar = new Button();
        editar.setUserData("editar");
        editar.setGraphic(Imagen.getImagen("editar"));
        borrar= new Button();
        borrar.setUserData("borrar");
        borrar.setGraphic(Imagen.getImagen("borrar"));
        guardar = new Button();
        guardar.setUserData("guardar");
        guardar.setGraphic(Imagen.getImagen("salvado"));
        cancelar = new Button();
        cancelar.setUserData("cancelar");
        cancelar.setGraphic(Imagen.getImagen("error"));

        getChildren().addAll(anadir,editar,borrar,guardar,cancelar);

    }
}
