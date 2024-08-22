import edu.misena.senaviewer.model.*;

import java.util.Scanner;

public class Main {
        public static void main(String[] arg) {
            inicio();
        }
        public static void inicio() {
            Scanner scanner = new Scanner(System.in);
            String msj;
            int resp, cont;
            do{
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
                switch (resp){
                    case 1:
                        msj = "Movies\n";
                        msj += "1. ejercicio 1 \n";
                        msj += "2. ejercicio 2\n";
                        System.out.println(msj);
                        resp = scanner.nextInt();
                        switch (resp){
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
                        msj+= "1. ejercicio 1 \n";
                        msj += "2. ejercicio 2\n";
                        System.out.println(msj);
                        resp = scanner.nextInt();
                        switch (resp){
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
                        msj+= "1. ejercicio 1 \n";
                        msj += "2. ejercicio 2\n";
                        msj += "3. ejercicio 3\n";
                        msj += "4. ejercicio 4\n";
                        msj += "5. ejercicio 5\n";
                        System.out.println(msj);
                        resp = scanner.nextInt();
                        switch (resp){
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
                        msj += "1. ejercicio 1 \n";
                        msj += "2. ejercicio 2\n";
                        msj += "3. ejercicio 3\n";
                        msj += "4. ejercicio 4\n";
                        msj += "5. ejercicio 5\n";
                        msj += "6. ejercicio 6\n";
                        msj += "7. ejercicio 7\n";
                        msj += "8. ejercicio 8\n";
                        msj += "9. ejercicio 9\n";
                        msj += "10. ejercicio 10\n";
                        System.out.println(msj);
                        resp = scanner.nextInt();
                        switch (resp){
                            case 1:
                                System.out.println();
                                break;
                            case 2:
                                System.out.println();
                                break;
                        }
                        break;
                }
                System.out.println("¿QUIERE CONTINUAR? si=1 no=2");
                cont = scanner.nextInt();
            } while(cont == 1);
        }
    }