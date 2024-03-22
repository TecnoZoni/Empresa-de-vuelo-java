package com.mycompany.empresavuelos;

import java.util.Scanner;

public class EmpresaVuelos {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Declaracion
        int matriz[][] = new int[6][3];
        String aprobado, denegado, detener;
        int numDest, numVue, cantAsien;

        //Asignacion de centinela, mensajes y matriz
        detener = "";
        aprobado = "Su reserva fue realizada con exito.";
        denegado = "Disculpe, no se pudo completar su operacion dado que no hay asientos disponibles.";
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 300);
            }
        }
        
        while (!detener.equalsIgnoreCase("finish")) {
            //Recorrer Matriz(Mostrar asientos)
            for (int i = 0; i < 6; i++) {
                System.out.print("Numero de destino: " + i + " asientos: ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println();
            }

            //Seleccion de viaje
            System.out.println("Ingrese el numero de destino (0 a 5)");
            numDest = leer.nextInt();
            leer.nextLine();
            while (!(numDest >= 0 && numDest <= 5)) {
                System.out.println("Por favor ingrese un numero de destino valido (0 a 5): ");
                numDest = leer.nextInt();
                leer.nextLine();
            }
            //Seleccion de vuelo
            System.out.println("Ingrese el numero de vuelo (mañana = 0, tarde = 1, noche = 2): ");
            numVue = leer.nextInt();
            leer.nextLine();
            while (!(numVue >= 0 && numVue <= 2)) {
                System.out.println("Por favor ingrese un numero de vuelo valido (mañana = 0, tarde = 1, noche = 2): ");
                numVue = leer.nextInt();
                leer.nextLine();
            }

            //Seleccion de asientos
            System.out.println("Ingrese la cantidad de asiento que desea reservar: ");
            cantAsien = leer.nextInt();
            leer.nextLine();
            if (cantAsien > matriz[numDest][numVue]) {
                System.out.println(denegado);
            } else {
                System.out.println(aprobado);
            }
            System.out.println("Preciona enter para continuar, de lo contrario escriba 'finish'");
            detener = leer.nextLine();
        }
        
    }
}
