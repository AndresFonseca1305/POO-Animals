package animalesDomesticos;

import clasesAbstractas.AnimalesDomesticos;
import interfaces.Aereos;

public class Loro extends AnimalesDomesticos implements Aereos {

    public Loro(String nombre, double peso, int edad, double altura, String color, String especie, String duenho, boolean vacunado, String chipID, boolean entrenado) {
        super(nombre, peso, edad, altura, color, especie, duenho, vacunado, chipID, entrenado);
    }

    @Override
    public String vacunar() {
        return "Vacunando al loro contra la gripe aviar";
    }

    @Override
    public String entrenar() {
        return "Entrenando al loro para que repita palabras";
    }

    @Override
    public String jugar() {
        return "Jugando con el loro";
    }

    @Override
    public String respiracion() {
        return "Inhalando y exhalando aire";
    }

    @Override
    public String alimentacion() {
        return "Comiendo semillas y frutas";
    }

    @Override
    public String desplazamiento() {
        return "El loro puede " + volar() + " y tambien " + aterrizar();
    }

    @Override
    public String reproduccion() {
        return "El loro se reproduce con otro loro";
    }

    @Override
    public String volar() {
        return "Volar por el aire";
    }

    @Override
    public String aterrizar() {
        return "Aterrizar en el suelo";
    }
}
