import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MainConcerto {
        public static void main(String[] args) {
            // creazione nuovo concerto
            Scanner scan = new Scanner(System.in);
        try{

            System.out.println("Inserisci il nome del concerto");
            String titolo = scan.nextLine();

            System.out.println("Inserisci la data del concerto (formato YYYY-MM-DD): ");
            LocalDate data = LocalDate.parse(scan.nextLine());

            System.out.println("Inserisci l'orario di inizio del concerto");
            LocalTime ora = LocalTime.parse(scan.nextLine());

            System.out.println("Inserisci il prezzo del biglietto per il concerto");
            double prezzo = Double.parseDouble(scan.nextLine());

            System.out.println("Inserisci il numero di posti disponibili per il concerto");
            int postiTotali = Integer.parseInt(scan.nextLine());

            Concerto concerto1 = new Concerto(titolo, data, postiTotali, ora, prezzo);
            System.out.println("Concerto creato: " + concerto1);
         // nuova prenotazione
        System.out.println("Quante prenotazioni vuoi effettuare?");
        int numPrenotazioni = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < numPrenotazioni; i++){
            try {
                concerto1.prenota();
            } catch (Exception e) {
                System.out.println("Errore prenotazione: " + e.getMessage());
            }
        }

        System.out.println("Posti prenotati: " + concerto1.getPostiPrenotati());
        System.out.println("Posti disponibili: " + (concerto1.getPostiTotali() - concerto1.getPostiPrenotati()));

        // nuova disdetta
        System.out.println("Quante prenotazioni vuoi disdire?");
        int numDisdette = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < numDisdette; i++) {
                try {
                    concerto1.disdici();
                } catch (Exception e) {
                    System.out.println("Errore disdetta: " + e.getMessage());
                }
            }

            System.out.println("Posti prenotati: " + concerto1.getPostiPrenotati());
            System.out.println("Posti disponibili: " + (concerto1.getPostiTotali() - concerto1.getPostiPrenotati()));
            scan.close();
    }catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

