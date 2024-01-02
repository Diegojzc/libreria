package componentes;

import javafx.scene.control.SplitPane;

public class AppSplitPane extends SplitPane {

    public AppGridPane appGridPane;
    public AppLista appLista;

    public AppSplitPane(){
        super();

        iniciarComponentes();
    }

    public void iniciarComponentes(){
        appGridPane = new AppGridPane();
        appLista = new AppLista();

        getItems().addAll(appLista,appGridPane);
    }
}
