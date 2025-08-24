import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    // variabili d'istanza
    private String titolo;
    private LocalDate data;
    private final int postiTotali;
    private int postiPrenotati;

    // costruttore
    Evento(String titolo, LocalDate data, int postiTotali){
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La data non può essere già passata");
        }
        if (postiTotali <= 0) {
            throw new IllegalArgumentException("Il numero di posti totali deve essere positivo");
        }

        this.titolo = titolo;
        this.data = data;
        this.postiTotali = postiTotali;
        this.postiPrenotati = 0;
    }
    
    // metodi getter & setter
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getPostiPrenotati() {
        return postiPrenotati;
    }

    public int getPostiTotali() {
        return postiTotali;
    }

    // metodo per prenotare
    public void prenota(){
        if(data.isBefore(LocalDate.now())){
            throw new IllegalStateException ("Impossibile prenotare un evento già passato");
        }
        else if (postiPrenotati >= postiTotali){
            throw new IllegalStateException ("L'evento è Sold Out");

        }
        postiPrenotati++;
    }

    // metodo per disdire
    public void disdici(){
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalStateException ("Impossibile disdire un evento già passato");
        }
        else if (postiPrenotati <= 0){
            throw new IllegalStateException ("Non ci sono prenotazioni da disdire");
        }
        postiPrenotati--;
    }

    // override metodo toString
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        return data.format(formatter) + " - " + titolo;
    }
} 
