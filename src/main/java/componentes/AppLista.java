package componentes;

import domain.Libros;
import javafx.scene.layout.VBox;
import javafx.scene.control.ListView;


public class AppLista extends VBox {

    public ListView <Libros> listaView;
    public ListViewContextMenu<Libros> contextLibros;

    public AppLista(){
        super();
        iniciarComponentes();
    }
    public void iniciarComponentes(){

        listaView = new ListView<>();
        contextLibros = new ListViewContextMenu<>(listaView);
        listaView.setContextMenu(contextLibros);

        getChildren().add(listaView);

    }
}

