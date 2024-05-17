package animalesSalvajes;

import clasesAbstractas.AnimalesSalvajes;
import interfaces.Acuaticos;
import interfaces.Terrestres;

public class Cocodrilo extends AnimalesSalvajes implements Acuaticos, Terrestres {
    public Cocodrilo(String nombre, double peso, int edad, double altura, String color, String especie, String habitat, int nivelPeligro, boolean proteccionEspecie) {
        super(nombre, peso, edad, altura, color, especie, habitat, nivelPeligro, proteccionEspecie);
    }

    @Override
    public String cazar() {
        return "El cocodrilo caza en el agua y en la tierra";
    }

    @Override
    public String huir() {
        return "el cocodrilo huye nadando o corriendo";
    }

    @Override
    public String explorar() {
        return "el cocodrilo explora el agua y la tierra";
    }

    @Override
    public String respiracion() {
        return "el cocodrilo respira por los pulmones";
    }

    @Override
    public String alimentacion() {
        return "el cocodrilo se alimenta de peces, aves y mamiferos";
    }

    @Override
    public String desplazamiento() {
        return "el cocodrilo es peligroso porque puede "
                + caminar() + ", "
                + correr() + ", "
                + nadar() + " y "
                + bucear()
                + " en el agua y en la tierra";
    }

    @Override
    public String reproduccion() {
        return "el cocodrilo se reproduce con otro cocodrilo";
    }

    @Override
    public String nadar() {
        return "el cocodrilo nada en el agua";
    }

    @Override
    public String bucear() {
        return "el cocodrilo bucea en el agua y se impulsa con la cola";
    }

    @Override
    public String caminar() {
        return "el cocodrilo camina en 4 patas";
    }

    @Override
    public String correr() {
        return "el cocodrilo corre en 4 patas";
    }
}
