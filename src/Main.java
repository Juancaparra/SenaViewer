import edu.misena.senaviewer.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        inicio();
    }

    public static void inicio() {
        Scanner scanner = new Scanner(System.in);
        String msj;
        int resp, cont = 1;
        do {
            msj = "MENU DE OPCIONES\n";
            msj += "1. Movies \n";
            msj += "2. Series\n";
            msj += "3. Books\n";
            msj += "4. Magazines\n";
            msj += "5. Report\n";
            msj += "6. Report Today\n";
            msj += "0. Exit\n";
            System.out.println(msj);
            resp = scanner.nextInt();
            if (resp < 0 || resp > 6){
                System.out.println("-----NUMERO INVALIDO-----\n");
                inicio();
            }
            switch (resp) {
                case 1:
                    msj = "Movies\n";
                    msj += "1. Agregar pelicula \n";
                    msj += "2. Mostrar peliculas\n";
                    System.out.println(msj);
                    resp = scanner.nextInt();
                    switch (resp) {
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            break;
                    }
                    break;
                case 2:
                    msj = "Series\n";
                    msj += "1. Agregar serie \n";
                    msj += "2. Mostrar series\n";
                    System.out.println(msj);
                    resp = scanner.nextInt();
                    switch (resp) {
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            break;
                    }
                    break;
                case 3:
                    msj = "Books\n";
                    msj += "1. Agregar libro \n";
                    msj += "2. Mostrar libros\n";
                    System.out.println(msj);
                    resp = scanner.nextInt();
                    switch (resp) {
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            break;
                    }
                    break;
                case 4:
                    msj = "Magazines\n";
                    msj += "1. Agregar revista \n";
                    msj += "2. Mostrar revistas\n";
                    System.out.println(msj);
                    resp = scanner.nextInt();
                    switch (resp) {
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            break;
                    }
                    break;

                case 5:
                    msj = "Report\n";
                    System.out.println(msj);
                    resp = scanner.nextInt();
                    break;

                case 6:
                    msj = "Report Today\n";
                    System.out.println(msj);
                    resp = scanner.nextInt();
                    break;

                case 0:
                    cont = 2;
                    System.out.println("-----SALIENDO-----");

                    break;
            }
            if (cont == 1) {
                System.out.println("¿QUIERE CONTINUAR? si=1 no=2");
                cont = scanner.nextInt();}
        } while (cont == 1);}}






