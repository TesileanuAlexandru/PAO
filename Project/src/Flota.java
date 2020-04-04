public class Flota {
    private int capacitateFlota;
    private int index;
    Autoturism[] vehicule;
    //TODO tipul de autoturism il stiu numai la rulare, deci nu pot aplica metode din Duba sau Autobuz, FIX THAT somehow

    public Flota(int capacitateFlota) {
        if (capacitateFlota > 0) {
            this.capacitateFlota = capacitateFlota;
            vehicule = new Autoturism[capacitateFlota];
        }else{
            throw new RuntimeException("Nu ati introdus un numar pozitiv!");
        }
    }

    public boolean adaugaAututurism(Autoturism autoturism){
        if(index < capacitateFlota){
            vehicule[index] = autoturism;
            System.out.println("Ati adaugat un autoturism de tip " + autoturism.getClass().getSimpleName() + " la pozitia " + index++);
            return true;
        }else {
            return false;
        }
    }
}
