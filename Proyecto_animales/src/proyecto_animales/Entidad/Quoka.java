/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_animales.Entidad;

/**
 *
 * @author Agus
 */
public class Quoka extends Animal {

    private int altura;
    private boolean sonrisa;
    private String pelaje;

    public Quoka(int altura, boolean sonrisa, String pelaje) {
        this.altura = altura;
        this.sonrisa = sonrisa;
        this.pelaje = pelaje;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isSonrisa() {
        return sonrisa;
    }

    public void setSonrisa(boolean sonrisa) {
        this.sonrisa = sonrisa;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
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

    @Override
    public String toString() {
        return super.nombre + super.edad +"Quoka{" + "altura=" + altura + ", sonrisa=" + sonrisa + ", pelaje=" + pelaje + '}';
    }
    
    
    
    
    
}
