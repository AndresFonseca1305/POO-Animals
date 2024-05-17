package animalesSalvajes;

import clasesAbstractas.AnimalesSalvajes;
import interfaces.Aereos;

public class Aguila extends AnimalesSalvajes implements Aereos {

    public Aguila(String nombre, double peso, int edad, double altura, String color, String especie, String habitat, int nivelPeligro, boolean proteccionEspecie) {
        super(nombre, peso, edad, altura, color, especie, habitat, nivelPeligro, proteccionEspecie);
    }

    @Override
    public String cazar() {
        return "El águila caza a su presa desde las alturas";
    }

    @Override
    public String huir() {
        return "El águila huye de los depredadores terrestres";
    }

    @Override
    public String explorar() {
        return "El águila explora su territorio en busca de presas";
    }

    @Override
    public String respiracion() {
        return "Inhalando y exhalando aire";
    }

    @Override
    public String alimentacion() {
        return "Comiendo animales pequeños";
    }

    @Override
    public String desplazamiento() {
        return "";
    }

    @Override
    public String reproduccion() {
        return "";
    }

    @Override
    public String volar() {
        return "";
    }

    @Override
    public String aterrizar() {
        return "";
    }
}
