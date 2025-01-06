package com_java_events;

public class Event {
    private String titolo;
    private int data;
    private int numPostiTotale = 0;
    private int numPostiRiservati;

    public Event(String titolo, int data, int numPostiRiservati){
        this.titolo = titolo;
        this.data = data;
        this.numPostiRiservati = numPostiRiservati;
    }


}
