package entities;

import interfaces.RegolaLuminosita;

public class Immagine extends ElementoMultimediale implements RegolaLuminosita {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        if (luminosita <= 0) {
            throw new IllegalArgumentException("La luminosità deve essere un valore positivo");
        }
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        if (luminosita <= 0) {
            throw new IllegalArgumentException("La luminosità deve essere un valore positivo");
        }
        this.luminosita = luminosita;
    }

    public void show() {
        StringBuilder imgLum = new StringBuilder();
        for (int i = 0; i < luminosita; i++) {
            imgLum.append("*");
        }
        System.out.println(getTitolo() + imgLum );
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
        System.out.println("Luminosità: " + luminosita);
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
        System.out.println("Luminosità: " + luminosita);
    }
}


