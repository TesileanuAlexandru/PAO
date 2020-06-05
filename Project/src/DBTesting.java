public class DBTesting {
    public static void main(String[] args) {
        Duba d1 = new Duba("Vaneo",2020,false, 6);
        Duba d2 = new Duba("Transporter", 2018, true, 4);
        //DBAccess.getInstance().insertDuba(d1);
        //DBAccess.getInstance().insertDuba(d2); TESTED AND WORKS


        Autobuz a1 = new Autobuz("Tourer",2020,false,64);
        Autobuz a2 = new Autobuz("Transporter", 2018, false, 32);
        //DBAccess.getInstance().insertAutobuz(a1);
        //DBAccess.getInstance().insertAutobuz(a2); TESTED AND WORKS

        Flota f1 = new Flota(20); //TODO vezi de ce se busesc cheile
        Flota f2 = new Flota(40);
        //DBAccess.getInstance().adaugaFlota(f1);
        //DBAccess.getInstance().adaugaFlota(f2);

    }
}
