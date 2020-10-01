package practica.pkg2;

public class Gato2 extends Gato {

    public String sonido;
    public String color;

    public Gato2(String nombre, String pais, String sondio, String color) {
        super(nombre, pais);
        this.color = color;
        this.sonido = sonido;
    }

    public void DatosGato2() {
        System.out.print("nombre: " + nombre + "\ncolor: " + color + "hace el sonido: " + sonido + "viende de: " + pais);
    }

    public void AccionesGato3() {
        System.out.println("el gato en las noches ase " + sonido);
    }

    public void AccionesTotales() {
        AccionesGato3();
        AccionGato1();
        AccionGato2();
    }
}
