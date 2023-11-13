package ejercicio1;

public class Perro extends Animal implements Desplazable{
    protected boolean esPeligroso;
    protected String raza;

    public Perro(boolean esPeligroso, String raza) {
        this.esPeligroso = esPeligroso;
        this.raza = raza;
    }

    protected void comer() {
        System.out.println("el perro de raza "+ raza +" come con su hocico");
    }

    @Override
    public void desplazar() {
        System.out.println("un perro de raza "+ raza +" se desplaza con sus patas y "
        +(esPeligroso?"es peligroso":"no es peligroso"));
    }
}
