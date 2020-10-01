package practica.pkg2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2 {

    public static enum posicion {
        Perro1, Perro2,Gato1,Gato2,Ave1,Ave2,Corral1,Corral2;
    }

    public static posicion raza;
    public static Perro1 caso1;
    public static Perro2 caso2;
    public static Gato1 caso3;
    public static Gato2 caso4;
    public static Ave1 caso5;
    public static Ave2 caso6;
    public static Corral1 caso7;
    public static Corral2 caso8;

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
                    switch (raza) {
                        case Perro1:
                            caso1.Acciones();
                            break;
                        case Perro2:
                            caso2.acciones();
                            break;
                        case Gato1:
                            caso3.trucos();
                            break;
                        case Gato2:
                            caso4.AccionesTotales();
                            break;
                        case Ave1:
                            caso5.acciones();
                            break;
                        case Ave2:
                            caso6.acciones();
                            break;
                        case Corral1:
                            caso7.AccionesVaca();
                            break;
                        case Corral2:
                            caso8.acciones();
                            break;
                    }

                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    salir = true;
                    System.out.println("Proceso finalizado");
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
    }

    public static void inicio() {
        caso1 = new Perro1(10, "Furby ", " se hace el muerto ", " Temascalcingo");
        raza = posicion.Perro1;
    }

    public static void menuperro() {
        int opcion;
        Scanner sn = new Scanner(System.in);
        
        System.out.println("1. Schnauzer");
        System.out.println("2. Husky");

        try {

            System.out.println("Selecciona una opcion");
            opcion = sn.nextInt();

            switch (opcion) {

                case 1:

                    
                    caso1 = new Perro1(4, "bruno", "centarce", "toluca");
                    raza = posicion.Perro1;
                    return;
                case 2:
                    caso2 = new Perro2(2, "popi", "croquetas", "24/12/2018");
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
                    caso3=new Gato1("bola de nieve","Rusia","andar en 2 patas",7);
                    raza = posicion.Gato1;
                    return;
                    
                case 2:
                    caso4=new Gato2("copito","Egipto","miau","cafe");
                    raza = posicion.Gato2;
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
                    caso5=new Ave1("granos", (float) 4.5,"cafe",4);
                    raza = posicion.Ave1;
                    return;
                case 2:
                    caso6=new Ave2(" alpiste", (float)2.6,"cocoroco","1 mes");
                    raza = posicion.Ave2;
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
                    caso7=new Corral1("masculino",5,"lola", (float) 123.21);
                    raza = posicion.Corral1;
                    return;
                case 2:
                    caso8=new Corral2("femenino",8,"pinta","brusca");
                    raza = posicion.Corral2;
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
