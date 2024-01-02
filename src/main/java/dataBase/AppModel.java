package dataBase;

import com.tokioBiblioteca.AppView;
import domain.Libros;

import java.util.ArrayList;
import java.util.List;

public class AppModel {

    public AppView appView;
    public ArrayList<Libros> libros;
    public AppModel() {

    }


    public List<Libros> getLibros(){

        libros = new ArrayList<>();
        libros.add(new Libros("El quijote de la mancha", "Cervantes", 11.50));
        libros.add(new Libros("El medico" , "Rob j", 12.80));

        return libros;
    }

    public void addLibros(Libros libro){
        libros.add(libro);

    }


    }

