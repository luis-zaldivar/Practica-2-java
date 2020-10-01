package practica.pkg2;

public class Gato1 extends Gato {

    public int vidas;
    public String trucos;

    public Gato1(String nombre, String pais, String trucos, int vidas) {
        super(nombre, pais);
        this.vidas = vidas;
        this.trucos = trucos;
    }

    public void AccionGato3() {
        System.out.println(nombre + " hace el tuco de " + trucos);
    }

    public void trucos() {
        AccionGato3();
        AccionGato1();
        AccionGato2();
    }

    public void DatosGato1() {
        System.out.print(trucos + "nombre: " + nombre + "\nvidas: " + vidas + "\nhace el truco: " + trucos + "\n viene de: " + pais);
    }
}
