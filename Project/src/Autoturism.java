public abstract class Autoturism {

    private String model;
    private int anFab;
    protected boolean isLoaded;
    public int idflota = -1;


    public Autoturism(String model, int anFab, boolean isLoaded) {
        this.model = model;
        this.anFab = anFab;
        this.isLoaded = isLoaded;
    }

    public String getModel() {
        return model;
    }

    public int getAnFab() {
        return anFab;
    }

    public boolean getisLoaded() {
        return isLoaded;
    }


    public Object showStatus(String output){
        /**
         Aceasta metoda returneaza statusul autoturismului in diferite moduri. !Pentru int necesita conversie: (int).
         @param output Modul in care se doreste returnat statusul ( "int", "boolean", "sout")
         @return Depinzand de output returneaza int(0/1), boolean sau afiseaza la ecran.
         */
        if (output.toLowerCase() == "int"){
            if (this.isLoaded == true){
                return (Integer)1;
            }else{
                return (Integer)0;
            }
        }else if(output.toLowerCase() == "boolean"){
            return this.isLoaded;
        }
        else{
            System.out.println(this.isLoaded);
            return this.isLoaded;
        }
    }
}
