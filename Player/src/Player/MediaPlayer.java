package Player;

import java.util.Scanner;

public class MediaPlayer {
    private Playable[] mediaArray = new Playable[5];

    public void addMedia() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < mediaArray.length; i++) {
            System.out.print("Inserisci il tipo di media (1 = Video, 2 = Audio, 3 = Immagine): ");
            int mediaType = input.nextInt();
            input.nextLine(); 

            switch (mediaType) {
                case 1:
                    System.out.print("Inserisci il titolo del video: ");
                    String videoTitle = input.nextLine();
                    System.out.print("Inserisci il volume del video: ");
                    int videoVolume = input.nextInt();
                    System.out.print("Inserisci la luminosità del video: ");
                    int videoLuminosita = input.nextInt();
                    System.out.print("Inserisci la durata del video: ");
                    int videoDurata = input.nextInt();
                    mediaArray[i] = new Video(videoTitle, videoVolume, videoLuminosita, videoDurata);
                    break;
                case 2:
                    System.out.print("Inserisci il titolo dell'audio: ");
                    String audioTitle = input.nextLine();
                    System.out.print("Inserisci la durata dell'audio: ");
                    int audioDurata = input.nextInt();
                    System.out.print("Inserisci il volume dell'audio: ");
                    int audioVolume = input.nextInt();
                    mediaArray[i] = new Audio(audioTitle, audioDurata, audioVolume);
                    break;
                case 3:
                    System.out.print("Inserisci il titolo dell'immagine: ");
                    String imageTitle = input.nextLine();
                    System.out.print("Inserisci la luminosità dell'immagine: ");
                    int imageLuminosita = input.nextInt();
                    mediaArray[i] = new Immagine(imageLuminosita, imageTitle);
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    i--;
            }
           ;
   }
    }

    public void playMedia() {
        Scanner input = new Scanner(System.in);

        int choice = -1;

        while (choice != 0) {
            System.out.print("Inserisci il numero del media da riprodurre (1-5) o 0 per uscire: ");
            choice = input.nextInt();

            if (choice < 0 || choice > 5) {
                System.out.println("Scelta non valida. Riprova.");
                continue;
            }

            if (choice == 0) {
                System.out.println("Arrivederci!");
                break;
            }

            mediaArray[choice - 1].play();
        }
       ;
 }
}
