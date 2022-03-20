package Punto17;

import Punto17.Data.DataLavadoras;
import Punto17.Data.DataTelevisores;
import Punto18.Data.DataSeries;
import Punto18.Data.DataVideojuegos;
import Punto18.Serie;
import Punto18.Videojuego;

public class Ejecutable<getConsumo> {
    public static void main(String[] args) {

        Electrodomesticos[] electrodomesticos = new Electrodomesticos[10];
        int contador = 0;
        int precioL =0;
        int precioTv=0;

        for (DataLavadoras data : DataLavadoras.values()) {
            Lavadora l=new Lavadora(data.getPrecio(), data.getColor(),data.getConsumo(),data.getPeso(), data.getCarga());
            l.comprobarColor(data.getColor());
            l.comprobarConsumoEnergetico(data.getConsumo());
            electrodomesticos[contador] = l;
            precioL+=l.precioFinal();
            contador++;
        }

        for (DataTelevisores data : DataTelevisores.values()) {
            Televisor tv = new Televisor(data.getPrecio(), data.getColor(),data.getConsumo(),data.getPeso(), data.getResolucion(),data.isSintonizadorTdt());
            tv.comprobarColor(data.getColor());
            tv.comprobarConsumoEnergetico(data.getConsumo());
            electrodomesticos[contador] = tv;
            precioTv+=tv.precioFinal();
            contador++;
        }

        System.out.println("Precio final lavadoras: "+precioL+"\nPrecio final televisores: "+precioTv+"\nPrecio Electrodomesticos: "+(precioL+precioTv));
    }
}

