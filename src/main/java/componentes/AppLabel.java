package componentes;

import javafx.geometry.Insets;
import javafx.scene.control.Label;

public class AppLabel extends Label {

    public AppLabel(){
        super();
        iniciarComponentes();
    }
    public void iniciarComponentes(){

        setPadding(new Insets(10));
        setText("Libreria JavaFx");
    }
}

