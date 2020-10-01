package practica.pkg2;

public class Corral2 extends Corral{
    public String color;
    public String temperamento;

    public Corral2(String sexo, int edad,String color,String temperamento) {
        super(sexo, edad);
        this.color=color;
        this.temperamento=temperamento;
    }
    public void animal3(){
        System.out.println("el caballo de color "+color+" patea");
    }
    public void datos(){
        System.out.print("sexo: "+sexo+"\nedad: "+edad+"\ncolor: "+color+"\temperamento: "+temperamento);
    }
    public void acciones(){
        animal3();
        animal1();
        animal2();
    }
}
