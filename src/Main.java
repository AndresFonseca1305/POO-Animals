import animalesDomesticos.Perro;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais", 10.5, 5, 0.5, "Cafe", "Canino", "Juan", true, "123456", true);
        System.out.println(perro.vacunar());
        System.out.println(perro.entrenar());
        System.out.println(perro.jugar());
        System.out.println(perro.respiracion());
        System.out.println(perro.alimentacion());
        System.out.println(perro.desplazamiento());
        System.out.println(perro.reproduccion());
    }
}
