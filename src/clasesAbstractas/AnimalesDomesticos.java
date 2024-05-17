package clasesAbstractas;

public abstract class AnimalesDomesticos extends Animal{

    public String duenho;

    public boolean vacunado;

    public String chipID;

    public boolean entrenado;

    public AnimalesDomesticos(String nombre, double peso, int edad, double altura, String color, String especie, String duenho, boolean vacunado, String chipID, boolean entrenado) {
        super(nombre, peso, edad, altura, color, especie);
        this.duenho = duenho;
        this.vacunado = vacunado;
        this.chipID = chipID;
        this.entrenado = entrenado;
    }

    public abstract String vacunar();

    public abstract String entrenar();

    public abstract String jugar();
}
