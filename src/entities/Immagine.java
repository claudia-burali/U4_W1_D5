package entities;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.println("Img: " + getTitolo());
    }

    public void aumentaLuminosita() {
        luminosita++;
        System.out.println("Luminosità: " + luminosita);
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
        System.out.println("Luminosità: " + luminosita);
    }
}


