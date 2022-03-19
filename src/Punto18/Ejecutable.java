package Punto18;

import Punto18.Data.DataSeries;
import Punto18.Data.DataVideojuegos;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        int contador = 0;
        for (DataSeries data : DataSeries.values()) {
            series[contador] = new Serie(data.toString(), data.getNumeroTemporadas(), data.getGenero(), data.getCreador());
            contador++;
        }
        contador = 0;
        for (DataVideojuegos data : DataVideojuegos.values()) {
            videojuegos[contador] = new Videojuego(data.toString(), data.getHorasEstimadas());
            contador++;
        }

        for (int x=0; x<=(Math.random() * 6); x++) {
            series[x].entregar();
        }
        for (int x=0; x<=(Math.random() * 6); x++) {
            videojuegos[x].entregar();
        }

        int seriesEntregadas = 0;
        int vgEntregados = 0;

        Serie serieMasTemporadas = series[0];
        Videojuego vgMasLargo=videojuegos[0];

        for (Serie s : series) {
            if (s.isEntregado()) {
                seriesEntregadas++;
                s.devolver();
            }

            if (s.compareTo(serieMasTemporadas) > 0) {
                serieMasTemporadas = s;
            }
        }

        for(Videojuego v: videojuegos) {
            if(v.isEntregado()) {
                vgEntregados++;
                v.devolver();
            }

            if (v.compareTo(vgMasLargo)>0) {
                vgMasLargo=v;
            }
        }

        System.out.println("Cantidad de series entregadas: " + seriesEntregadas);
        System.out.println("Serie con mas temporadas: " + serieMasTemporadas.toString());
        System.out.println("");
        System.out.println("Cantidad de videojuegos entregados: " + vgEntregados);
        System.out.println("Videojuego con mas horas estimadas: " + vgMasLargo.toString());

    }
}
