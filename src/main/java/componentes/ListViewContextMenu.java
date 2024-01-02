package componentes;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;

public class ListViewContextMenu<T> extends ContextMenu {

    private ListView<T> listaView;



    public ListViewContextMenu(ListView<T> listaView) {
        super();
        this.listaView = listaView;
        iniciarComponentes();
    }
    public void iniciarComponentes(){

    }
}
