import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.List;

public class DBTesting {
    public static void main(String[] args) {

        System.out.println(DBAccess.getInstance().getMaxAutoturisme() + " - MAX AUTOTURISME"); //WORKS
        System.out.println(DBAccess.getInstance().getMaxFlote() + " - MAX FLOTE"); //WORKS
        System.out.println(DBAccess.getInstance().getMaxIncarcatura() + " - MAX INCARCATURA"); //WORKS
        System.out.println(DBAccess.getInstance().getMaxItemIncarcatura() + " - MAX ITEMEINCARCATURA"); //WORKS

        /* TODO WORKS :D
        Duba d1 = new Duba("Vaneo",2020,false, 6);
        Duba d2 = new Duba("Transporter", 2018, true, 4);
        DBAccess.getInstance().insertDuba(d1);
        DBAccess.getInstance().insertDuba(d2);
        */

        /* TODO WORKS :D
        Autobuz a1 = new Autobuz("Tourer",2020,false,64);
        Autobuz a2 = new Autobuz("Transporter", 2018, false, 32);
        DBAccess.getInstance().insertAutobuz(a1);
        DBAccess.getInstance().insertAutobuz(a2);
        */

        /* TODO WORKS :D
        Flota f1 = new Flota(20);
        Flota f2 = new Flota(40);
        DBAccess.getInstance().adaugaFlota(f1);
        DBAccess.getInstance().adaugaFlota(f2);
        */

        /* TODO WORKS :D
        ItemIncarcatura ii1 = new ItemIncarcatura(10, 10);
        ItemIncarcatura ii2 = new ItemIncarcatura(15,15);
        ItemIncarcatura ii3 = new ItemIncarcatura(20,20);
        ItemIncarcatura ii4 = new ItemIncarcatura( 25, 25);
        DBAccess.getInstance().adaugaItemIncarcatura(ii1);
        DBAccess.getInstance().adaugaItemIncarcatura(ii2);
        DBAccess.getInstance().adaugaItemIncarcatura(ii3);
        DBAccess.getInstance().adaugaItemIncarcatura(ii4);
        */

        /* TODO WORKS :D
        Incarcatura i1 = new Incarcatura("Camioane", 20);
        Incarcatura i2 = new Incarcatura("Ciucas", 40);
        DBAccess.getInstance().adaugaIncarcatura(i1);
        DBAccess.getInstance().adaugaIncarcatura(i2);
        */

        /*TODO JOIN WORKS :D
        Duba d1 = new Duba("Vaneo",2020,false, 6);
        Duba d2 = new Duba("Transporter", 2018, true, 4);
        DBAccess.getInstance().insertDuba(d1);
        DBAccess.getInstance().insertDuba(d2);

        Autobuz a1 = new Autobuz("Tourer",2020,false,64);
        Autobuz a2 = new Autobuz("Transporter", 2018, false, 32);
        DBAccess.getInstance().insertAutobuz(a1);
        DBAccess.getInstance().insertAutobuz(a2);

        Flota f1 = new Flota(20);
        Flota f2 = new Flota(40);
        DBAccess.getInstance().adaugaFlota(f1);
        DBAccess.getInstance().adaugaFlota(f2);

        f1.adaugaAututurism(d1);
        f1.adaugaAututurism(a1);
        f2.adaugaAututurism(d2);
        f2.adaugaAututurism(a2);

        DBAccess.getInstance().updateFlota(f1);
        DBAccess.getInstance().updateFlota(f2);
        */

        /* TODO JOIN WORKS :D
        ItemIncarcatura ii1 = new ItemIncarcatura(10, 10);
        ItemIncarcatura ii2 = new ItemIncarcatura(15,15);
        ItemIncarcatura ii3 = new ItemIncarcatura(20,20);
        ItemIncarcatura ii4 = new ItemIncarcatura( 25, 25);
        DBAccess.getInstance().adaugaItemIncarcatura(ii1);
        DBAccess.getInstance().adaugaItemIncarcatura(ii2);
        DBAccess.getInstance().adaugaItemIncarcatura(ii3);
        DBAccess.getInstance().adaugaItemIncarcatura(ii4);


        Incarcatura i1 = new Incarcatura("Camioane", 20);
        Incarcatura i2 = new Incarcatura("Ciucas", 40);
        DBAccess.getInstance().adaugaIncarcatura(i1);
        DBAccess.getInstance().adaugaIncarcatura(i2);

        i1.add(ii1);
        i1.add(ii2);
        i2.add(ii3);
        i2.add(ii4);

        DBAccess.getInstance().updateIncarcatura(i1);
        DBAccess.getInstance().updateIncarcatura(i2);
        */


        /* TODO GET WORKS :D
        Duba d1 = new Duba("Vaneo",2020,false, 6);
        Duba d2 = new Duba("Transporter", 2018, true, 4);
        DBAccess.getInstance().insertDuba(d1);
        DBAccess.getInstance().insertDuba(d2);

        List <Duba> dube =DBAccess.getInstance().getDube();
        System.out.println(dube.size());
        System.out.println(dube.get(0).getModel());
        System.out.println(dube.get(1).getModel());
         */


        /* TODO GET WORKS :D
        Autobuz a1 = new Autobuz("Tourer",2020,false,64);
        Autobuz a2 = new Autobuz("Transporter", 2018, false, 32);
        DBAccess.getInstance().insertAutobuz(a1);
        DBAccess.getInstance().insertAutobuz(a2);

        List <Autobuz> autobuze =  DBAccess.getInstance().getAutobuze();
        System.out.println(autobuze.size());
        System.out.println(autobuze.get(0).getModel());
         */

        /* TODO GET WORKS :D
        Duba d1 = new Duba("Vaneo",2020,false, 6);
        Duba d2 = new Duba("Transporter", 2018, true, 4);
        DBAccess.getInstance().insertDuba(d1);
        DBAccess.getInstance().insertDuba(d2);

        Autobuz a1 = new Autobuz("Tourer",2020,false,64);
        Autobuz a2 = new Autobuz("Transporter", 2018, false, 32);
        DBAccess.getInstance().insertAutobuz(a1);
        DBAccess.getInstance().insertAutobuz(a2);

        Flota f1 = new Flota(20);
        Flota f2 = new Flota(40);
        DBAccess.getInstance().adaugaFlota(f1);
        DBAccess.getInstance().adaugaFlota(f2);

        f1.adaugaAututurism(d1);
        f1.adaugaAututurism(a1);
        f2.adaugaAututurism(d2);
        f2.adaugaAututurism(a2);

        DBAccess.getInstance().updateFlota(f1);
        DBAccess.getInstance().updateFlota(f2);

        List <Flota> flote = DBAccess.getInstance().getFlote();
        System.out.println(flote.size());
        System.out.println(flote.get(0).getCapacitateFlota());
        */

        /* TODO GET WORKS :D
        ItemIncarcatura ii1 = new ItemIncarcatura(10, 10);
        ItemIncarcatura ii2 = new ItemIncarcatura(15,15);
        ItemIncarcatura ii3 = new ItemIncarcatura(20,20);
        ItemIncarcatura ii4 = new ItemIncarcatura( 25, 25);
        DBAccess.getInstance().adaugaItemIncarcatura(ii1);
        DBAccess.getInstance().adaugaItemIncarcatura(ii2);
        DBAccess.getInstance().adaugaItemIncarcatura(ii3);
        DBAccess.getInstance().adaugaItemIncarcatura(ii4);

        List <ItemIncarcatura> items = DBAccess.getInstance().getItemeIncarcatura();
        System.out.println(items.size());
        System.out.println(items.get(0).getTimpRamasExpediere());
        */

        /* TODO GET WORKS :D
        ItemIncarcatura ii1 = new ItemIncarcatura(10, 10);
        ItemIncarcatura ii2 = new ItemIncarcatura(15,15);
        ItemIncarcatura ii3 = new ItemIncarcatura(20,20);
        ItemIncarcatura ii4 = new ItemIncarcatura( 25, 25);
        DBAccess.getInstance().adaugaItemIncarcatura(ii1);
        DBAccess.getInstance().adaugaItemIncarcatura(ii2);
        DBAccess.getInstance().adaugaItemIncarcatura(ii3);
        DBAccess.getInstance().adaugaItemIncarcatura(ii4);


        Incarcatura i1 = new Incarcatura("Camioane", 120);
        Incarcatura i2 = new Incarcatura("Ciucas", 140);
        DBAccess.getInstance().adaugaIncarcatura(i1);
        DBAccess.getInstance().adaugaIncarcatura(i2);

        i1.add(ii1);
        i1.add(ii2);
        i2.add(ii3);
        i2.add(ii4);

        DBAccess.getInstance().updateIncarcatura(i1);
        DBAccess.getInstance().updateIncarcatura(i2);

        List <Incarcatura> loads = DBAccess.getInstance().getIncarcatura();
        System.out.println(loads.size());
        System.out.println(loads.get(0).getDenumireIncarcatura());
         */

        /* TODO DELETE WORKS :D
        Duba d1 = new Duba("Vaneo",2020,false, 6);
        Duba d2 = new Duba("Transporter", 2018, true, 4);
        DBAccess.getInstance().insertDuba(d1);
        DBAccess.getInstance().insertDuba(d2);
        DBAccess.getInstance().deleteDuba(d2);
        */

        /* TODO DELETE WORKS :D
        Autobuz a1 = new Autobuz("Tourer",2020,false,64);
        Autobuz a2 = new Autobuz("Transporter", 2018, false, 32);
        DBAccess.getInstance().insertAutobuz(a1);
        DBAccess.getInstance().insertAutobuz(a2);
        DBAccess.getInstance().deleteAutobuz(a2);
        */

        MainEntry mainEntryform = new MainEntry();

    }
}
