public class Test {

    public static void main(String[] args) {
        Duba d1 = new Duba("vito", 1997, false,2.4F,2F,2F);
        Autobuz a1 = new Autobuz("Sprinter", 1998, false, 15);

        Flota flota = new Flota(2);
        flota.adaugaAututurism(d1);
        flota.adaugaAututurism(a1);

        flota.vehicule[0].showStatus("sout");

}
}
