package Punto18.Data;

public enum DataVideojuegos {
    Halo(10,"Shooter","Bungie"),
    Tomb_raider(20,"Accion","Core design"),
    Super_mario_bros(30,"plataformas","Nintendo"),
    Need_for_speed(40,"Carreras","EA Canada"),
    GTA(50,"Accion","Rockstar");

    private int horasEstimadas=10;


    private String genero="";
    private String compania="";
    private boolean entregado=false;

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    DataVideojuegos(int horasEstimadas, String genero,String compania) {
        this.horasEstimadas = horasEstimadas;
        this.genero=genero;
        this.compania=compania;
    }


    public int getHorasEstimadas() {
        return horasEstimadas;
    }
}
