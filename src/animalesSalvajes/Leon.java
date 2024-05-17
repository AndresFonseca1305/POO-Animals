package animalesSalvajes;

import clasesAbstractas.AnimalesSalvajes;
import interfaces.Terrestres;

public class Leon extends AnimalesSalvajes implements Terrestres {
    public Leon(String nombre, double peso, int edad, double altura, String color, String especie, String habitat, int nivelPeligro, boolean proteccionEspecie) {
        super(nombre, peso, edad, altura, color, especie, habitat, nivelPeligro, proteccionEspecie);
    }

    @Override
    public String cazar() {
        return "El leon caza en la selva y en la llanura";
    }

    @Override
    public String huir() {
        return "el leon huye corriendo";
    }

    @Override
    public String explorar() {
        return "el leon explora la selva y la llanura y es amigo de timon y pumba";
    }

    @Override
    public String respiracion() {
        return "el leon respira por los pulmones";
    }

    @Override
    public String alimentacion() {
        return "el leon se alimenta de mamiferos, aves y negritos en la selva y en la llanura";
    }

    @Override
    public String desplazamiento() {
        return "el leon es peligroso porque puede "
                + caminar() + ", "
                + correr()
                + " en la selva y en la llanura";
    }

    @Override
    public String reproduccion() {
        return "el leon se reproduce con otra leona";
    }

    @Override
    public String caminar() {
        return "el leon camina en la selva y en la llanura";
    }

    @Override
    public String correr() {
        return "el leon corre en la selva y en la llanura";
    }
}
