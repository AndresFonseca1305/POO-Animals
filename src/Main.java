import animalesDomesticos.Gato;
import animalesDomesticos.Loro;
import animalesDomesticos.Perro;
import animalesSalvajes.Cocodrilo;
import animalesSalvajes.Leon;
import animalesSalvajes.Pato;

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
        for(int i =0; i<=50; i++){
            System.out.print("-");
        }

        System.out.println("");

        Gato gato = new Gato("Michi", 5, 3, 0.3, "Negro", "Felino", "Oscar", true, "123df", true);
        System.out.println(gato.vacunar());
        System.out.println(gato.entrenar());
        System.out.println(gato.jugar());
        System.out.println(gato.respiracion());
        System.out.println(gato.alimentacion());
        System.out.println(gato.desplazamiento());
        System.out.println(gato.reproduccion());
        for(int i =0; i<=50; i++){
            System.out.print("-");
        }

        System.out.println("");

        Loro loro = new Loro("Paco", 1, 2, 0.1, "Verde", "Ave", "Pedro", true, "123s2rddf", false);
        System.out.println(loro.vacunar());
        System.out.println(loro.entrenar());
        System.out.println(loro.jugar());
        System.out.println(loro.respiracion());
        System.out.println(loro.alimentacion());
        System.out.println(loro.desplazamiento());
        System.out.println(loro.reproduccion());
        for(int i =0; i<=50; i++){
            System.out.print("-");
        }

        System.out.println("");

        Pato lucas = new Pato("Lucas", 2.5, 3, 0.3, "Blanco", "Ave", "Lagos", 3, true);
        System.out.println(lucas.cazar());
        System.out.println(lucas.huir());
        System.out.println(lucas.explorar());
        System.out.println(lucas.respiracion());
        System.out.println(lucas.alimentacion());
        System.out.println(lucas.desplazamiento());
        System.out.println(lucas.reproduccion());
        for(int i =0; i<=50; i++){
            System.out.print("-");
        }        for(int i =0; i<=50; i++){
            System.out.print("-");
        }
        System.out.println("");
        Cocodrilo Pedro = new Cocodrilo("Pedro", 150.5, 10, 2.5, "Verde", "Reptil", "Rios", 5, true);
        System.out.println(Pedro.cazar());
        System.out.println(Pedro.huir());
        System.out.println(Pedro.explorar());
        System.out.println(Pedro.respiracion());
        System.out.println(Pedro.alimentacion());
        System.out.println(Pedro.desplazamiento());
        System.out.println(Pedro.reproduccion());
        for(int i =0; i<=50; i++){
            System.out.print("-");
        }
        System.out.println("");
        Leon Simba = new Leon("Simba", 100.5, 8, 1.5, "Amarillo", "Felino", "Selva", 4, true);
        System.out.println(Simba.cazar());
        System.out.println(Simba.huir());
        System.out.println(Simba.explorar());
        System.out.println(Simba.respiracion());
        System.out.println(Simba.alimentacion());
        System.out.println(Simba.desplazamiento());
        System.out.println(Simba.reproduccion());


    }
}
