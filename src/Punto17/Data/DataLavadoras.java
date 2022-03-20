package Punto17.Data;

public enum DataLavadoras {
    Lavadora1(1200000, "Azul", 'B',20,20),
    Lavadora2(2400000, "Blanco", 'F',5,5),
    Lavadora3(500000, "Rojo", 'E',30,30),
    Lavadora4(750000, "Gris", 'H',60,60),
    Lavadora5(1650000, "Negro", 'A',100,100);

    private int precio;
    private String color;
    private char consumo;
    private int peso;
    private int carga;



    DataLavadoras(int precio, String color, char consumo, int peso, int carga) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso=peso;
        this.carga=carga;
    }

    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public int getPeso() {
        return peso;
    }

    public int getCarga() {
        return carga;
    }
}
