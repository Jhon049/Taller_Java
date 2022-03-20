package Punto17;

public class Televisor extends Electrodomesticos{
    private int resolucion=20;
    private boolean sintonizadorTdt=false;

    public Televisor(int precio, int peso) {
        super(precio, peso);
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void comprobarConsumoEnergetico(char consumoRef) {
        String[] consumo =  {"a","b","c","d","e","f"};
        int contador=0;
        for (int i=0; i<consumo.length;i++) {
            if (String.valueOf(consumoRef).equalsIgnoreCase(consumo[i])){
                contador=1;
            }
        }
        if (contador==0){
            this.setConsumo('A');
        }
    }

    public void comprobarColor(String colorRef){
        String[] color = {"blanco","negro","rojo","azul","gris"};
        int contador=0;
        for (int i=0;i< color.length;i++) {
            if (colorRef.equalsIgnoreCase(color[i])) {
                contador=1;
            }
        }
        if (contador ==0){
            this.setColor("Blanco");
        }

    }

    public Televisor (int precio, String color, char consumo, int peso, int resolucion, boolean sintonizadorTdt){
        super (precio,color, consumo,peso);
        this.resolucion =resolucion;
        this.sintonizadorTdt= sintonizadorTdt;
    }

    public int precioFinal(){
        switch (this.getConsumo()){
            case 'a':
                this.precio+=100;
                break;
            case 'b':
                this.precio+=80;
                break;
            case 'c':
                this.precio+=60;
                break;
            case 'd':
                this.precio+=50;
                break;
            case 'e':
                this.precio+=30;
                break;
            case 'f':
                this.precio+=10;
                break;
        }
        if (this.getPeso() <=19){
            this.precio+=10;
        }
        else if(this.getPeso() <=49){
            this.precio+=50;
        }
        else if(this.getPeso() <=79){
            this.precio+=80;
        }
        else {
            this.precio+=100;
        }
        if (this.resolucion>40){
            this.precio+=(this.precio*0.3);
        }
        if(this.sintonizadorTdt){
            this.precio+=50;
        }
        return this.precio;
    }





}
