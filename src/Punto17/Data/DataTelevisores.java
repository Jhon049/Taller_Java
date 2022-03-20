package Punto17.Data;

public enum DataTelevisores {
    Televisor1(520000,"blanco",'F',5,20,true),
    Televisor2(1450000,"rojo",'A',25,38,false),
    Televisor3(2460000,"azul",'B',60,50,true),
    Televisor4(860000,"morado",'J',100,60,false),
    Televisor5(1950000,"gris",'D',35,40,true);


    private int precio;
    private String color;
    private char consumo;
    private int peso;
    private int resolucion;
    private boolean sintonizadorTdt;

    DataTelevisores(int precio, String color, char consumo, int peso, int resolucion, boolean sintonizadorTdt) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
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

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }
}
