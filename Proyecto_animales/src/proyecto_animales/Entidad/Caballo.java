package proyecto_animales.Entidad;

public class Caballo {
    public int peso;
    public String color,genero;

    public Caballo() {
    }

    public Caballo(int peso, String color, String genero) {
        this.peso = peso;
        this.color = color;
        this.genero = genero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
