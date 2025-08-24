import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
    // data e ora formattata
    public String getDataOraFormattata() {
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterOra = DateTimeFormatter.ofPattern("HH:mm");
        return getData().format(formatterData) + " " + ora.format(formatterOra);
    }

    // prezzo formattato
    public String getPrezzoFormattato() {
        DecimalFormat df = new DecimalFormat("##.##€");
        return df.format(prezzo);
    }

    // override metodo toString
    @Override
    public String toString() {
        return getDataOraFormattata() + " - " + getTitolo() + " - " + getPrezzoFormattato();
    }
}
