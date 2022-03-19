package Punto15;

import java.util.Scanner;

public class punto15 {
    public static void main (String [] args){
        int opc=0;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("****** GESTION CINEMATOGRÁFICA ********\n1-NUEVO ACTOR\n2-BUSCAR ACTOR\n3-ELIMINAR ACTOR\n4-MODIFICAR ACTOR" +
                    "\n5-VER TODOS LOS ACTORES\n6- VER PELICULAS DE LOS ACTORES\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR");
            opc=entrada.nextInt();
            switch (opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (opc!=8);
    }

}
