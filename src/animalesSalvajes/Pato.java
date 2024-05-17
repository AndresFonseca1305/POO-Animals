package animalesSalvajes;

import clasesAbstractas.AnimalesSalvajes;
import interfaces.Acuaticos;
import interfaces.Aereos;
import interfaces.Terrestres;

public class Pato extends AnimalesSalvajes implements Acuaticos, Terrestres, Aereos {

    public Pato(String nombre, double peso, int edad, double altura, String color, String especie, String habitat, int nivelPeligro, boolean proteccionEspecie) {
        super(nombre, peso, edad, altura, color, especie, habitat, nivelPeligro, proteccionEspecie);
    }

    @Override
    public String cazar() {
        return "El pato caza en el agua";
    }

    @Override
    public String huir() {
        return "El pato huye volando o se hunde en el agua";
    }

    @Override
    public String explorar() {
        return "El pato explora el agua o volando";
    }

    @Override
    public String respiracion() {
        return "el pato respira por los pulmones";
    }

    @Override
    public String alimentacion() {
        return "el pato se alimenta de peces y plantas acuaticas";
    }

    @Override
    public String desplazamiento() {
        return "El pato es todo terreno porque " + caminar() + ", " + correr() + ", " + nadar() + ", " + bucear() + ", " + volar() + " y " + aterrizar();
    }

    @Override
    public String reproduccion() {
        return "";
    }

    @Override
    public String nadar() {
        return "el pato nada en el agua";
    }

    @Override
    public String bucear() {
        return "el pato bucea en el agua";
    }

    @Override
    public String volar() {
        return "el pato vuela en el aire";
    }

    @Override
    public String aterrizar() {
        return "el pato aterriza en el agua o en tierra";
    }

    @Override
    public String caminar() {
        return "el pato camina en tierra";
    }

    @Override
    public String correr() {
        return "el pato corre en tierra";
    }
}
