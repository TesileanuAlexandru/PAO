public class Test {

    public static void main(String[] args) {
        Duba d1 = new Duba("vito", 1997, false,4);
        Autobuz a1 = new Autobuz("Sprinter", 1998, false, 15);

        /*
        Flota flota = new Flota(2);
        flota.adaugaAututurism(d1);
        flota.adaugaAututurism(a1);

        if (flota.vehicule[0] instanceof Duba){
            System.out.println("yes it is");
            Duba aux = (Duba)flota.vehicule[0];
            aux.incarca();
        }

         */
        int[] timp = new int[]{5, 10, 15, 18}; //Sortarea nu merge, desi pare implementata bine
        int[] nr = new int[]{20, 20, 20, 20};

        Incarcatura inc = new Incarcatura("farmaceutice", timp, nr);

        System.out.println("inainte de sortare");
        System.out.println(inc);

        inc.sorteazaItemIncarcatura();

        System.out.println(inc);
    }
}
