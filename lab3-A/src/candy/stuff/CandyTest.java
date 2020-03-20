package candy.stuff;

import candy.stuff.sweets.Heidi;
import candy.stuff.sweets.Lindt;
import candy.stuff.sweets.Milka;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class CandyTest {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduceti numarul de dulciuri: ");
        int candyBagSize = scanner.nextInt();
        scanner.close();

        CandyBag myCandyBag = new CandyBag(candyBagSize);

        //Creating some candy
        Milka milkaOreo = new Milka("Elvetia","Oreo",14,8);
        myCandyBag.addCandy(milkaOreo);
        Heidi heidiAmaruie = new Heidi("Belgia","Cacao Amaruie",12);
        myCandyBag.addCandy(heidiAmaruie);
        Lindt lindSmall = new Lindt("Belgia", "Lapte", 6,10,3);
        Lindt lindGrand = new Lindt("Belgia","lapte",15,20,3);
        myCandyBag.addCandy(lindGrand);
        myCandyBag.addCandy(lindSmall);

        for(int i = 0; i < myCandyBag.getCandyBoxSize(); ++i){
            System.out.println( myCandyBag.getCandyAtIndex(i).toString());
        }

        //Let's check if there are any lind type candyes that are equal (according to our method)
        Lindt typeTester = new Lindt("_","_",1,1,1);
        for(int i = 0; i < myCandyBag.getCandyBoxSize(); ++i) {
            System.out.println(myCandyBag.getCandyAtIndex(i).getClass() + " DEBUG 101");
            if (myCandyBag.getCandyAtIndex(i).getClass() == typeTester.getClass()) {
                for (int j = ++i; j < myCandyBag.getCandyBoxSize(); ++j){
                    if(myCandyBag.getCandyAtIndex(j).getClass() == typeTester.getClass()) {
                        if (myCandyBag.getCandyAtIndex(i).equals(myCandyBag.getCandyAtIndex(j))){
                            System.out.println("Am gasit ceva identic la index "+ i+ "si index"+ j);
                        }
                    }
                }
            }
        }



    }
}
