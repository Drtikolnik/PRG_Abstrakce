public class Main {
    public static void main(String[] args) {
        Pes pes = new Pes(525, "Arnošt");
        Had had = new Had(0, "Satan");
        SuchozemskaZelva sucha = new SuchozemskaZelva(458, "aaa");
        VodniZelva vlhka = new VodniZelva(874454, "aa");

        pes.vydejZvuk();
        pes.vypisJmenoADatum();

        System.out.println("");

        had.vydejZvuk();
        had.vypisJmenoADatum();

        System.out.println("");

        sucha.vydejZvuk();
        sucha.vypisJmenoADatum();

        System.out.println("");

        vlhka.vydejZvuk();
        vlhka.vypisJmenoADatum();
    }



}