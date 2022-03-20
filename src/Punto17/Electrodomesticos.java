package Punto17;

public class Electrodomesticos {

    int precio=100;
    private String color = "blanco";
    private char consumo = 'F';
    private int peso = 5;

    public Electrodomesticos(int precio, int peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomesticos(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public Electrodomesticos() {
    }
}
