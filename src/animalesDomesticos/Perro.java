package animalesDomesticos;

import clasesAbstractas.AnimalesDomesticos;
import interfaces.Terrestres;

public class Perro extends AnimalesDomesticos implements Terrestres {

    public Perro(String nombre, double peso, int edad, double altura, String color, String especie, String duenho, boolean vacunado, String chipID, boolean entrenado) {
        super(nombre, peso, edad, altura, color, especie, duenho, vacunado, chipID, entrenado);
    }

    @Override
    public String vacunar() {
        if (vacunado)
            return "Ya esta vacunado contra la rabia";
        else {
            return "Hay que vacunar al perro contra la rabia";
        }
    }

    @Override
    public String entrenar() {
        return "Entrenando para que haga sus necesidades en el patio trasero";
    }

    @Override
    public String jugar() {
        return "Jugando con la pelota";
    }

    @Override
    public String respiracion() {
        return "Inhalando y exhalando aire";
    }

    @Override
    public String alimentacion() {
        return "Comiendo croquetas";
    }

    @Override
    public String desplazamiento() {
        return caminar() + " y tambien " + correr();
    }

    @Override
    public String reproduccion() {
        return "Reproduciendose con otro perro";
    }

    @Override
    public String caminar() {
        return "El perro camina en 4 patas";
    }

    @Override
    public String correr() {
        return "El perro corre en 4 patas";
    }
}
