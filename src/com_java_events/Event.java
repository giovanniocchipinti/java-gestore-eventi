package com_java_events;

public class Event {

    // variabili d'istanza
    private String titolo;
    private String data;
    private int numPostiTotale;
    private int numPostiRiservati = 0;

    // costruttore
    public Event(String titolo, String data, int numPostiTotale){
        this.titolo = titolo;
        this.data = data;
        this.numPostiTotale = numPostiTotale;
    }

    // controllo posti totali positivi
    public void posti (){
        if (numPostiTotale >= 0) {    
        }
        else {
            System.out.println("inserire un numero valido");
        }
    }
    
    // metodi getter
    public String getTitle(){
        return titolo;
    }

    public String getDate(){
        return data;
    }

    public int getTotalPlaces(){
        return numPostiTotale;
    }

    public int getReservedPlaces(){
        return numPostiRiservati;
    }

    // metodi setter
    public void setTitle(String titolo){
        this.titolo = titolo;
    }

    public void setDate(String data){
        this.data = data;
    }

    public void prenota(){
        numPostiRiservati = numPostiRiservati + 1;
    }

    public void disdici(){
        numPostiRiservati = numPostiRiservati - 1;
    }


}


    




