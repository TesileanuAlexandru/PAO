public class Test {

    public static void main(String[] args) {
        Duba d1 = new Duba("vito", 1997, false,4);
        Autobuz a1 = new Autobuz("Sprinter", 1998, false, 15);


        Flota flota = new Flota(2);
        flota.adaugaAututurism(d1);
        flota.adaugaAututurism(a1);

        int[] timp = new int[]{10, 5, 15, 18};
        int[] nr = new int[]{20, 20, 20, 20};

        Incarcatura inc = new Incarcatura("farmaceutice", timp, nr);
        inc.sorteazaItemIncarcatura();

        if (flota.vehicule[0] instanceof Duba){
            System.out.println("yes it is");
            Duba aux = (Duba)flota.vehicule[0];
            aux.incarca();

            aux.descarca();
        }

    }
}
