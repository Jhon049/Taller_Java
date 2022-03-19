package Punto18.Data;

public enum DataVideojuegos {
    TITULO_JUEGO_1(10),
    TITULO_JUEGO_2(20),
    TITULO_JUEGO_3(30),
    TITULO_JUEGO_4(40),
    TITULO_JUEGO_5(50);

    private int horasEstimadas;

    DataVideojuegos(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }
}
