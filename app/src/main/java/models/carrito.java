package models;


public class carrito {
    String nombre;
    String categoria;
    String resena;
    String calif;

    public carrito(String nombre, String categoria, String resena, String calif) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.resena = resena;
        this.calif = calif;
    }

    public carrito(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public String getCalif() {
        return calif;
    }

    public void setCalif(String calif) {
        this.calif = calif;
    }
}
