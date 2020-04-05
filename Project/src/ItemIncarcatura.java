public class ItemIncarcatura implements Comparable<ItemIncarcatura>{

    private int timpRamasExpediere;
    private int nrPaletiIncarcat;

    public ItemIncarcatura(int timpRamasExpediere, int nrPaletiIncarcat) {
        this.timpRamasExpediere = timpRamasExpediere;
        this.nrPaletiIncarcat = nrPaletiIncarcat;
    }

    public ItemIncarcatura(ItemIncarcatura other) {
        this.nrPaletiIncarcat = other.nrPaletiIncarcat;
        this.timpRamasExpediere = other.timpRamasExpediere;
    }

    @Override
    public int compareTo(ItemIncarcatura o) {

        float calcul1 = (1F / (float) this.timpRamasExpediere) / (float) this.nrPaletiIncarcat;
        float calcul2 = (1F / (float) o.timpRamasExpediere) / (float) o.nrPaletiIncarcat;

        if(calcul1 < calcul2){
            return 1;
        }else if(calcul1 == calcul2){
            return  0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "ItemIncarcatura{" +
                "timpRamasExpediere=" + timpRamasExpediere +
                ", nrPaletiIncarcat=" + nrPaletiIncarcat +
                '}';
    }
}
