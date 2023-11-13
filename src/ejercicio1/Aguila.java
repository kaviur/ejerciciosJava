package ejercicio1;

public class Aguila extends Animal implements Volable{
    private boolean tieneAlas = true;

    protected void comer() {
        System.out.println("El aguila come con su pico");
    }

    @Override
    public void volar() {
        System.out.println("las aguilas vuelan con sus alitas");
    }
}
