import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento{
    // variabili d'istanza
    private LocalTime ora;
    private double prezzo;

    // costruttore
    Concerto(String titolo, LocalDate data, int postiTotali, LocalTime ora, double prezzo) {
        super(titolo, data, postiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
    }

    // metodi getter & setter
    public LocalTime getOra() {
        return ora;
    }
    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    
}
