package com_java_events;

public class Event {
    private String titolo;
    private int data;
    private int numPostiTotale;
    private int numPostiRiservati = 0;

    public Event(String titolo, int data, int numPostiTotale){
        this.titolo = titolo;
        this.data = data;
        this.numPostiTotale = numPostiTotale;
    }

    public void posti (){
        if (numPostiTotale >= 0) {    
        }
        else {
            System.out.println("inserire un numero valido");
        }
    }
    

}


    




