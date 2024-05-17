package animalesDomesticos;

import clasesAbstractas.AnimalesDomesticos;
import interfaces.Terrestres;

public class Gato extends AnimalesDomesticos implements Terrestres {

    public Gato(String nombre, double peso, int edad, double altura, String color, String especie, String duenho, boolean vacunado, String chipID, boolean entrenado) {
        super(nombre, peso, edad, altura, color, especie, duenho, vacunado, chipID, entrenado);
    }

    @Override
    public String vacunar() {
        if (vacunado)
            return "Ya esta vacunado contra la rabia";
        else {
            return "Hay que vacunar al gato contra la rabia";
        }
    }

    @Override
    public String entrenar() {
        return "Entrenando para que haga sus necesidades en la caja de arena";
    }

    @Override
    public String jugar() {
        return "Jugando con una bola de estambre";
    }

    @Override
    public String respiracion() {
        return "Inhalando y exhalando aire";
    }

    @Override
    public String alimentacion() {
        return "Comiendo croquetas y pescado";
    }

    @Override
    public String desplazamiento() {
        return caminar() + " y tambien " + correr();
    }

    @Override
    public String reproduccion() {
        return "Reproduciendose con otro gato";
    }

    @Override
    public String caminar() {
        return "El gato camina en 4 patas";
    }

    @Override
    public String correr() {
        return "El gato corre en 4 patas";
    }
}
