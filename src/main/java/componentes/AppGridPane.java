package componentes;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class AppGridPane extends GridPane {

    public Label ltitulo, lautor, lprecio;
    public TextField ttitulo, tautor, tprecio;
    public AppButtonPane appButtonPane;

    public AppGridPane() {
       super();
       inicierComponentes();

    }

    public void inicierComponentes(){

        ltitulo = new Label("Titulo");
        ttitulo = new TextField();
        lautor = new Label("Autor");
        tautor = new TextField();
        lprecio = new Label("Precio");
        tprecio = new TextField();
        appButtonPane = new AppButtonPane();

        setHgap(5);
        setVgap(5);
        setPadding(new Insets(5,5,5,5));

        add(ltitulo,0,0);
        add(ttitulo,1,0);
        add(lautor,0,1);
        add(tautor,1,1);
        add(lprecio,0,2);
        add(tprecio,1,2);
        add(appButtonPane,0,3,3,3);


    }
    public void limpiar(){
        ttitulo.setText("");
        tautor.clear();
        tprecio.clear();
    }
}
