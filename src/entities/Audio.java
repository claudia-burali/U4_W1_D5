package entities;

public class Audio extends ElementoRiproducibile {
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        if (volume <= 0) {
            throw new IllegalArgumentException("Il volume deve essere un valore positivo");
        }
        this.volume = volume;
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

    @Override
    public void play() {
        for (int j = 0; j < getDurata(); j++) {
            StringBuilder audioVol = new StringBuilder();
            for (int i = 0; i < volume; i++) {
                audioVol.append("!");
            }
            System.out.println(getTitolo() + audioVol );
        }
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