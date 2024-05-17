package clasesAbstractas;

public abstract class Animal {

    public String nombre;

    public double peso;

    public int edad;

    public double altura;

    public String color;

    public String especie;

    public Animal(String nombre, double peso, int edad, double altura, String color, String especie) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.altura = altura;
        this.color = color;
        this.especie = especie;
    }

    public abstract String respiracion();

    public abstract String alimentacion();

    public abstract String desplazamiento();

    public abstract String reproduccion();
}
