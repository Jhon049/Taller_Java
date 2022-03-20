package Punto16;

import java.util.Random;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private char sexo= 'H';
    private double peso = 0;
    private double altura = 0;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        int imc;
        double pesoCalculado=this.peso/(this.altura*this.altura);
        if (pesoCalculado<20){
            System.out.println("La persona esta en su peso ideal");
            return imc=-1;
        }
        else if(pesoCalculado<=25){
            System.out.println("La persona esta por debajo de su peso ideal");
            return imc=0;
        }
        else {
            System.out.println("La persona se encuentra en sobrepeso");
            return imc=1;
        }
    }

    public boolean esMayorDeEdad (){
        boolean mayor;
        if (this.edad <18){
            return mayor=false;
        }
        else{
            return mayor = true;
        }
    }

    public char comprobarSexo (){
        char genero;
        if (String.valueOf(this.sexo).equalsIgnoreCase("M")){
            sexo='M';
            return genero='M';
        }
        else {
            sexo='H';
            return genero = 'H';
        }
    }

    public void generaDNI(){
        Random rnd;
        int numDNI;
        char letraDni = 'T';
        numDNI=(int)(Math.random()*((99999999-10000000+1)+10000000));
        int resto=numDNI%23;
        switch (resto){
            case 0:
                letraDni='T';
                break;
            case 1:
                letraDni='R';
                break;
            case 2:
                letraDni='W';
                break;
            case 3:
                letraDni='A';
                break;
            case 4:
                letraDni='G';
                break;
            case 5:
                letraDni='M';
                break;
            case 6:
                letraDni='Y';
                break;
            case 7:
                letraDni='F';
                break;
            case 8:
                letraDni='P';
                break;
            case 9:
                letraDni='D';
                break;
            case 10:
                letraDni='X';
                break;
            case 11:
                letraDni='B';
                break;
            case 12:
                letraDni='N';
                break;
            case 13:
                letraDni='J';
                break;
            case 14:
                letraDni='Z';
                break;
            case 15:
                letraDni='S';
                break;
            case 16:
                letraDni='Q';
                break;
            case 17:
                letraDni='V';
                break;
            case 18:
                letraDni='H';
                break;
            case 19:
                letraDni='L';
                break;
            case 20:
                letraDni='C';
                break;
            case 21:
                letraDni='K';
                break;
            case 22:
                letraDni='E';
                break;
        }
        this.DNI= String.valueOf(numDNI) +letraDni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "\n\nNombre: "+nombre+"\nEdad: "+edad+"\nDNI: "+DNI+"\nSexo: "+sexo+"\nPeso: "+peso+"\nAltura: "+altura+"\n";
    }
}
