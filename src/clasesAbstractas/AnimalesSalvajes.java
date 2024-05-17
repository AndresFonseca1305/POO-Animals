package clasesAbstractas;

public abstract class AnimalesSalvajes extends Animal{

    public String habitat;

    public int nivelPeligro;

    public boolean proteccionEspecie;


    public AnimalesSalvajes(String nombre, double peso, int edad, double altura, String color, String especie, String habitat, int nivelPeligro, boolean proteccionEspecie) {
        super(nombre, peso, edad, altura, color, especie);
        this.habitat = habitat;
        this.nivelPeligro = nivelPeligro;
        this.proteccionEspecie = proteccionEspecie;
    }

    public abstract String cazar();

    public abstract String huir();

    public abstract String explorar();
}
