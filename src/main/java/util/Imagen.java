package util;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Imagen {
    public static ImageView getImagen(String nombre){
        var classLoader = Thread.currentThread().getContextClassLoader();
        return new ImageView(new Image(classLoader.getResourceAsStream("imagenes/" + nombre + ".png" )));
    }
}
