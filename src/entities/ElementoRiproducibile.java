package entities;

public abstract class ElementoRiproducibile extends ElementoMultimediale {
    private int durata;

    public ElementoRiproducibile(String titolo, int durata) {
        super(titolo);
        if (durata <= 0) {
            throw new IllegalArgumentException("La durata deve essere un valore positivo.");
        }
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        if (durata <= 0) {
            throw new IllegalArgumentException("La durata deve essere un valore positivo.");
        }
        this.durata = durata;
    }
    public abstract void play();
}

