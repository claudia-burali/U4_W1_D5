import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ElementoMultimediale[] arrayElementi = new ElementoMultimediale[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayElementi.length; i++) {
            System.out.println("Tipo di media (1- Immagine, 2- Video, 3- Audio): ");
            int media = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Titolo: ");
            String titolo = scanner.nextLine();

            switch (media) {
                case 1:
                    System.out.println("Luminosità: ");
                    int luminositaImg = scanner.nextInt();
                    arrayElementi[i] = new Immagine(titolo, luminositaImg);
                    break;
                case 2:
                    System.out.println("Durata: ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Luminosità: ");
                    int luminositaVideo = scanner.nextInt();
                    arrayElementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                case 3:
                    System.out.println("Durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Volume: ");
                    int volumeAudio = scanner.nextInt();
                    arrayElementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;
                default:
                    System.out.println("Errore!");
                    i--;
                    break;
            }
        }

        System.out.println("Media:");
        for (int i = 0; i < arrayElementi.length; i++) {
            System.out.println((i + 1) + ": " + arrayElementi[i].getTitolo());
        }

        while (true) {
            System.out.println("Scegli un media (1-5) o esci (0): ");
            int media = scanner.nextInt();
            if (media == 0) {
                System.out.println("Ciao");
                break;
            }
            if (media < 1 || media > 5) {
                System.out.println("Errore!");
                continue;
            }
            ElementoMultimediale elemento = arrayElementi[media - 1];
            if (elemento instanceof Immagine) {
                ((Immagine) elemento).show();
            } else if (elemento instanceof Video) {
                ((Video) elemento).play();
            } else if (elemento instanceof Audio) {
                ((Audio) elemento).play();
            }
        }

        scanner.close();
    }
}
