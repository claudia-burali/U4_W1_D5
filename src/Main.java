import entities.Audio;
import entities.Immagine;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("fotoGattini", 10);
        img.diminuisciLuminosita();
        img.show();

        Audio audio = new Audio("canzoncina", 3, 5);
        audio.abbassaVolume();
        audio.play();

        Video video = new Video("videoCagnolini", 5, 7, 8);
        video.aumentaLuminosita();
        video.alzaVolume();
        video.play();
    }
}