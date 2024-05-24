package entities;

import interfaces.RegolaLuminosita;

public class Video extends ElementoRiproducibile implements RegolaLuminosita {
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        if (volume <= 0 || luminosita <= 0) {
            throw new IllegalArgumentException("Volume e luminosità devono essere valori positivi");
        }
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Il volume deve essere un valore positivo");
        }
        this.volume = volume;
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

    @Override
    public void play() {
        for (int j = 0; j < getDurata(); j++) {
            StringBuilder videoVol = new StringBuilder();
            for (int i = 0; i < volume; i++) {
                videoVol.append("!");
            }
            StringBuilder videoLum = new StringBuilder();
            for (int i = 0; i < luminosita; i++) {
                videoLum.append("*");
            }
            System.out.println(getTitolo() + videoVol + videoLum );
        }
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

    public void alzaVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("Volume: " + volume);
    }
}
