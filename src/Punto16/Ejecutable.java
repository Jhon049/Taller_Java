package Punto16;

import java.util.Scanner;

public class Ejecutable {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un nombre: ");
        String nombre = entrada.next();
        System.out.println("Digite una edad: ");
        int edad = entrada.nextInt();
        System.out.println("Digite un genero (H hombre, M mujer): ");
        char sexo = entrada.next().charAt(0);
        System.out.println("Digite el peso en Kg: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite la altura en metros: ");
        double altura = entrada.nextDouble();

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        persona1.calcularIMC();
        boolean mayor1= persona1.esMayorDeEdad();
        persona1.comprobarSexo();
        persona1.generaDNI();
        System.out.println(persona1.toString());
        if (mayor1=true){
            System.out.println("la persona es mayor de edad");
        }
        else {
            System.out.println("La persona es menor de edad");
        }

        Persona persona2 = new Persona("Juan",32,'M');
        persona2.calcularIMC();
        boolean mayor2= persona2.esMayorDeEdad();
        persona2.comprobarSexo();
        persona2.generaDNI();
        System.out.println(persona2.toString());
        if (mayor2=true){
            System.out.println("la persona es mayor de edad");
        }
        else {
            System.out.println("La persona es menor de edad");
        }

        Persona persona3 =new Persona("",0,'H');
        persona3.setNombre("Maria");
        persona3.setEdad(15);
        persona3.setSexo('M');
        persona3.setPeso(54);
        persona3.setAltura(1.50);

        persona3.calcularIMC();
        boolean mayor3=persona3.esMayorDeEdad();
        persona3.comprobarSexo();
        persona3.generaDNI();
        System.out.println(persona3.toString());
        if (mayor3=true){
            System.out.println("la persona es mayor de edad");
        }
        else {
            System.out.println("La persona es menor de edad");
        }

    }
}
