package practica.pkg2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2 {

    public static enum posicion {
        Perro1, Perro2;
    }

    public static posicion raza;
    public static Perro1 caso1;
    public static Perro2 caso2=null;

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;
        int opcion; //Guardaremos la opcion del usuario
        posicion lugar = raza.Perro1;
        inicio();
        while (!salir) {

            System.out.println("1. Seleccionar mascota ");
            System.out.println("2. Mostrar acciones  ");
            System.out.println("3. Mostrar datos de la mascota  ");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    salir1 = false;
                    while (!salir1) {

                        System.out.println("1. Perro");
                        System.out.println("2. Gato");
                        System.out.println("3. Ave");
                        System.out.println("4. Corral");

                        System.out.println("Escribe una de las opciones");
                        opcion = sn.nextInt();

                        switch (opcion) {
                            case 1:
                                menuperro();
                                salir1 = true;
                                break;
                            case 2:
                                menugato();
                                salir1 = true;
                                break;
                            case 3:
                                menuaves();
                                salir1 = true;
                                break;
                            case 4:
                                menucorral();
                                salir1 = true;
                                break;

                        }

                    }

                    break;

                case 2:
                    switch(raza){
                        case Perro1:
                            caso1.Acciones();
                            break;
                        case Perro2:
                            caso2.acciones();
                            break;
                        
                    }
                        
                    
                    

                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
    }
public static void inicio(){
    caso1=new Perro1(10," Furby "," se hace el muerto "," Temascalcingo");
    raza=posicion.Perro1;
}
    public static void menuperro() {
        int opcion;
        Scanner sn = new Scanner(System.in);
        String name = "";
        int edad;
        String truco = "";
        String lugar = "";
        String alimento;
        String año;
        System.out.println("1. Schnauzer");
        System.out.println("2. Husky");

        try {

            System.out.println("Selecciona una opcion");
            opcion = sn.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("inserte los siguientes datos\nedad: ");
                    edad = sn.nextInt();
                    System.out.print("nombre:");
                    name = sn.next();
                    System.out.print("truco: ");
                    truco = sn.next();
                    System.out.print("del lugar: ");
                    lugar = sn.next();
                    caso1 = new Perro1(edad, name, truco, lugar);
                    raza = posicion.Perro1;
                    return;
                case 2:
                    System.out.print("inserte los siguientes datos\nedad: ");
                    edad = sn.nextInt();
                    System.out.print("nombre:");
                    name = sn.next();
                    System.out.print("que come: ");
                    alimento = sn.next();
                    System.out.print("fecha de nacimiento en el formato dd/mm/aaaa");
                    año = sn.next();
                    caso2 = new Perro2(edad, name, alimento, año);
                    raza = posicion.Perro2;
                    return;
                default:
                    System.out.println("Solo números entre 1 y 2");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
        }

    }

    public static void menugato() {
        int opcion;
        Scanner sn = new Scanner(System.in);

        System.out.println("1. Korat");
        System.out.println("2. tonkinés");

        try {

            System.out.println("Selecciona una opcion");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    return;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    return;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
        }

    }

    public static void menuaves() {
        int opcion;
        Scanner sn = new Scanner(System.in);

        System.out.println("1. criolla");
        System.out.println("2. Pedresa cántabra");

        try {

            System.out.println("Selecciona una opcion");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    return;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    return;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
        }

    }

    public static void menucorral() {
        int opcion;
        Scanner sn = new Scanner(System.in);

        System.out.println("1. Vaca");
        System.out.println("2. Caballo");

        try {

            System.out.println("Selecciona una opcion");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    return;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    return;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
        }

    }
}
