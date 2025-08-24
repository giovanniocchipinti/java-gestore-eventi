import java.time.LocalDate;
import java.util.Scanner;

public class MainEvento {public static void main(String[] args) {
    try {
        Scanner scan = new Scanner(System.in);

        // creazione nuovo evento

        System.out.print("Inserisci il titolo dell'evento: ");
        String titolo = scan.nextLine();

        System.out.print("Inserisci la data dell'evento (formato YYYY-MM-DD): ");
        LocalDate data = LocalDate.parse(scan.nextLine());

        System.out.print("Inserisci il numero di posti totali disponibili per l'evento: ");
        int postiTotali = Integer.parseInt(scan.nextLine());

        Evento evento = new Evento(titolo, data, postiTotali);
        System.out.println("Evento creato: " + evento);

        // nuova prenotazione
        System.out.println("Quante prenotazioni vuoi effettuare?");
        int numPrenotazioni = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < numPrenotazioni; i++){
            try {
                evento.prenota();
            } catch (Exception e) {
                System.out.println("Errore prenotazione: " + e.getMessage());
            }
        }

        System.out.println("Posti prenotati: " + evento.getPostiPrenotati());
        System.out.println("Posti disponibili: " + (evento.getPostiTotali() - evento.getPostiPrenotati()));

        // nuova disdetta
        System.out.println("Quante prenotazioni vuoi disdire?");
        int numDisdette = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < numDisdette; i++) {
                try {
                    evento.disdici();
                } catch (Exception e) {
                    System.out.println("Errore disdetta: " + e.getMessage());
                }
            }

            System.out.println("Posti prenotati: " + evento.getPostiPrenotati());
            System.out.println("Posti disponibili: " + (evento.getPostiTotali() - evento.getPostiPrenotati()));
            scan.close();
    }catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}



    
    


