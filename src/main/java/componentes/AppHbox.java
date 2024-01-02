package componentes;

import javafx.geometry.Insets;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class AppHbox extends HBox {
    private Button boton;

    public AppHbox() {
        super();
        iniciarComponentes();

    }

    public void iniciarComponentes() {

        boton= new Button("Exportar");
        boton.setUserData("export");
        setPadding(new Insets(5,5,5,5));
        setSpacing(10);
        getChildren().add(boton);
    }
}
