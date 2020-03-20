package candy.stuff;

import com.sun.xml.internal.bind.v2.TODO;

public class CandyBag {
    private final int maxSizeCandyBag;
    private CandyBox[] candyBoxes;
    private int indexCurent;
    public CandyBag(int maxSizeCandyBag){
        if(maxSizeCandyBag > 0){
            this.maxSizeCandyBag = maxSizeCandyBag;
            this.candyBoxes = new CandyBox[maxSizeCandyBag];
        }
        else{
            throw new RuntimeException("Introduceti un numar pozitiv");
        }
    }
    public void addCandy(CandyBox candy){
        if(indexCurent < maxSizeCandyBag){
            candyBoxes[indexCurent] = candy;
            System.out.println("Ati adaugat ciocolata " + candy.getClass().getSimpleName()+ " la pozitia " + indexCurent++);
        }
    }
    public int getCandyBoxSize(){
        return candyBoxes.length;
    }
    public CandyBox getCandyAtIndex(int index){
        CandyBox copy = new CandyBox(candyBoxes[index]);
        return copy;
        //TODO FIX THIS, SO THAT IT WORKS!!!
    }
}
