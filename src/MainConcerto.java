import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MainConcerto {
    public static void main(String[] args) {
        // creazione nuovo concerto
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il nome del concerto");
        String titolo = scan.nextLine();

        System.out.println("Inserisci la data del concerto");
        LocalDate data = LocalDate.parse(scan.nextLine());

        System.out.println("Inserisci l'orario di inizio del concerto");
        LocalTime ora = LocalTime.parse(scan.nextLine());

        System.out.println("Inserisci il prezzo del biglietto per il concerto");
        double prezzo = Double.parseDouble(scan.nextLine());

        System.out.println("Inserisci il numero di posti disponibili per il concerto");
        int postiTotali = Integer.parseInt(scan.nextLine());

        Concerto concerto1 = new Concerto(titolo, data, postiTotali, ora, prezzo);
        System.out.println("Concerto creato: " + concerto1);
        
        

        

    }
}
