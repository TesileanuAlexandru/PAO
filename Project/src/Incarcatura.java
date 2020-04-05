import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Incarcatura {

    private String denumireIncarcatura;
    private int dimensiuneIncarcatura;
    ItemIncarcatura[] itemIncarcatura;

    public Incarcatura(String denumireIncarcatura, ItemIncarcatura[] itemIncatura) {
        this.denumireIncarcatura = denumireIncarcatura;
        this.dimensiuneIncarcatura = itemIncarcatura.length;
        this.itemIncarcatura = new ItemIncarcatura[this.dimensiuneIncarcatura];

        for(int i = 0; i < itemIncatura.length; ++i){
            this.itemIncarcatura[i] = new ItemIncarcatura(itemIncatura[i]);
        }
    }

    public Incarcatura(String denumireIncarcatura , int[] timp, int[] nr) {
        this.denumireIncarcatura = denumireIncarcatura;
        this.dimensiuneIncarcatura = timp.length;

        this.itemIncarcatura = new ItemIncarcatura[this.dimensiuneIncarcatura];
        for(int i = 0; i < this.dimensiuneIncarcatura; ++ i) {
            this.itemIncarcatura[i] = new ItemIncarcatura(timp[i], nr[i]);
        }
    }

    public void sorteazaItemIncarcatura(){
        Arrays.sort(this.itemIncarcatura );

    }

    @Override
    public String toString() {
        return "Incarcatura{" +
                "denumireIncarcatura='" + denumireIncarcatura + '\'' +
                ", dimensiuneIncarcatura=" + dimensiuneIncarcatura +
                ", itemIncarcatura=" + Arrays.toString(itemIncarcatura) +
                '}';
    }
}

