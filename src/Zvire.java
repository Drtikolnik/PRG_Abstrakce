public abstract class Zvire {

    private int rokNarozeni;
    private String jmeno;

    public Zvire(int rokNarozeni, String jmeno) {
        this.rokNarozeni = rokNarozeni;
        this.jmeno = jmeno;
    }

    public void vypisJmenoADatum(){
        System.out.println(jmeno);
        System.out.println(rokNarozeni);
    }

    public abstract void vydejZvuk();




















}
