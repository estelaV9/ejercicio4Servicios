import Modelo.RevisionAlarma;
import Modelo.TrabajoPintura;

import java.time.LocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        int tipoObra;
        int cantidad;
        try {
            //creo el objeto para crear una cuenta corriente

            do {
                //Try catch para evitar que el programa termine si hay un error
                System.out.println("ELIGE EL TIPO DE OBRA:" +
                        "\n1.- Pintura" +
                        "\n2.- Alarma");
                System.out.println("Enter la opcion elegida: ");
                tipoObra = sc.nextInt();



                System.out.println("MENU DE OPCIONES:" +
                        "\n1.- Coste total de la obra" +
                        "\n2.- Detalle de la obra" +
                        "\n0.- Salir");
                System.out.println("Enter la opcion elegida: ");
                opcion = sc.nextInt();


                //Ejemplo de switch case en Java
                //PONEMOS EL TIPO DE OBRA PARA CREAR SOLO 2 OBJETOS
                //DENTRO DEL SWITCH POR SI NO SE UTILIZA EL OBJETO
                switch (tipoObra) {
                    case 1:
                        TrabajoPintura t1 = new TrabajoPintura("Juan Pablo", LocalDate.now(),
                                "Pedro",100,10);
                        if(opcion == 1){
                            System.out.println("El precio total de la pintura es : " + t1.costeTotal());
                        }else{
                            System.out.println("Los detalles son : " + t1.detalleServicio());
                        }
                        break;
                    case 2:
                        RevisionAlarma r1 = new RevisionAlarma("Leopoldo",10);
                        if(opcion == 1){
                            System.out.println("El precio total de la pintura es : " + r1.costeTotal());
                        }else{
                            System.out.println("Los detalles son : " + r1.detalleServicio());
                        }
                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }//switch
                System.out.println("\n"); //Mostrar un salto de línea en Java

            } while (opcion != 0);//while
            System.out.println("Hasta pronto");
        } //try
        catch (Exception e) {
            System.out.println("Uoop! Error!");
        }//catch


    }//main
    }
