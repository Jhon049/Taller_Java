package Punto18.Data;

public enum DataSeries {
    The_Big_Bang_Theory(12, "Comedia", "Chuck Lorre"),
    Dr_House(8, "Drama", "David Shore"),
    Peaky_Blinders(6, "Accion", "Steven Knight"),
    Two_and_a_Half_Men(8, "Comedia", "Ashton Kutcher"),
    Gotham(5, "Ficcion", "Bruno Heller");

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
