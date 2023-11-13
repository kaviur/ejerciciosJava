package ejercicio1;

import ejercicio1.Animal;
import ejercicio1.Perro;

public class Main {
    public static void main(String[] args) {
        Animal animalito = new Animal();

        //Animal perro = (Perro)animalito;

        animalito.comer();

        Animal pincher = new Perro(false,"pincher");
        pincher.comer();
        //pincher.desplazar(); //esto da error porque Animal no implementa Desplazable sino Perro

        Desplazable perro = new Perro(true,"pitbull");
        //perro.comer(); //esto da error porque la interfaz Desplazable no tiene el método comer sino Animal y sus hijos
        perro.desplazar();

        Desplazable carro = new Carro();
        carro.desplazar();

        Animal aguilucho = new Aguila();
        aguilucho.comer();

        //Aguila aguila = (Aguila) new Animal(); //pendiente de solucionar casteo explícito
        //aguila.comer();

        Volable volador = new Aguila();
        volador.volar();
        //volador.comer(); // este da error porque es de tipo Volable y volable no tiene el método comer

        Volable avion = new Aeronave();
        //avion.volar();
        //avion.desplazar(); //adivina por qué no se desplaza

        Aeronave elicoptero = new Aeronave();
        elicoptero.volar();
        elicoptero.desplazar();
    }
}