package Punto18.Data;

public enum DataSeries {
    TITULO_SERIE_1(12, "The Big Bang Theory", "Chuck Lorre"),
    TITULO_SERIE_2(8, "Dr House", "David Shore"),
    TITULO_SERIE_3(6, "Peaky Blinders", "Steven Knight"),
    TITULO_SERIE_4(8, "Two and a Half Men", "Ashton Kutcher"),
    TITULO_SERIE_5(5, "Gotham", "Bruno Heller");

    private int numeroTemporadas;
    private String genero;
    private String creador;

    DataSeries(int numeroTemporadas, String genero, String creador) {
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public int getNumeroTemporadas() {
        return this.numeroTemporadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCreador() {
        return creador;
    }
}
