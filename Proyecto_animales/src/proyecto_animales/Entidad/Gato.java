package proyecto_animales.Entidad;

import java.util.ArrayList;

public class Gato extends Animal {
    
    private String raza;
    private ArrayList<String> colores;

    public Gato() {
    }

    public Gato(String raza, ArrayList<String> colores) {
        this.raza = raza;
        this.colores = colores;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public ArrayList<String> getColores() {
        return colores;
    }

    public void setColores(ArrayList<String> colores) {
        this.colores = colores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
