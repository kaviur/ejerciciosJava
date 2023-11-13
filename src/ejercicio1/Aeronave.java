package ejercicio1;

public class Aeronave implements Volable, Desplazable{

    @Override
    public void volar() {
        System.out.println("los aviones vuelan con combustible");
    }

    @Override
    public void desplazar() {
        System.out.println("todas las aeronave de desplazan por el aire");
    }
}
