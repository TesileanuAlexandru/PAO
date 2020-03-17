package polimorfism.zoo;

import java.util.Scanner;
import polimorfism.zoo.carnivor.Leu;
import polimorfism.zoo.carnivor.Pisica;
import polimorfism.zoo.ierbivor.Cal;
import polimorfism.zoo.ierbivor.Elefant;
import polimorfism.zoo.omnivor.Caine;
import polimorfism.zoo.omnivor.Urs;

public class ZooTest {
    public static void main(String[] args){
        Integer nrAnimaleZoo = Integer.valueOf(args[0]);

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Precizati nr max animale");
        //int nrAnimaleZoo = scanner.nextInt();
        //scanner.close();

        Zoo zooBucuresti = new Zoo(nrAnimaleZoo);

        adaugaAnimaleLaZoo(zooBucuresti);

        for (int i = 0; i < zooBucuresti.animaleZoo.length && (zooBucuresti.animaleZoo[i] != null); ++i){
            Animal animal = zooBucuresti.animaleZoo[i];
            animal.afiseazaDetalii();
            animal.seHraneste();
            animal.scoateSunet();
        }
    }

    public static void adaugaAnimaleLaZoo(Zoo zooBucuresti){
        Leu leu = new Leu("Simba", 7);
        zooBucuresti.adaugaAnimal(leu);
        Elefant elefant = new Elefant("Eli", 4);
        zooBucuresti.adaugaAnimal(elefant);
        Urs urs = new Urs("Fram", 10);
        zooBucuresti.adaugaAnimal(urs);
        Pisica pisica = new Pisica("Tom", 3);
        zooBucuresti.adaugaAnimal(pisica);
        Caine caine = new Caine("Toto", 1);
        zooBucuresti.adaugaAnimal(caine);
        Cal cal = new Cal("Thunder", 7);
        zooBucuresti.adaugaAnimal(cal);
    }
}
