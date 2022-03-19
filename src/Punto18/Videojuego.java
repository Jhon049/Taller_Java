package Punto18;

public class Videojuego implements Entregable {

    private int horasEstimadas = 10;
    private String titulo;
    private String genero;
    private String compania;
    private boolean entregado = false;

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas( int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public void entregar() {
        this.entregado = true;
    }

    public void devolver() {
        this.entregado = false;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    public int compareTo(Object a) {
        Videojuego videojuego = (Videojuego) a;
        if (videojuego.horasEstimadas < this.horasEstimadas) {
            return 1;
        } else if (videojuego.horasEstimadas == this.horasEstimadas) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
                + ", genero=" + genero + ", compania=" + compania + "]";
    }
}
