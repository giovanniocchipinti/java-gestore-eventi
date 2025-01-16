package com_java_events;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il nome dell'evento");
        String titolo = input.nextLine();
        System.out.println("Inserisi la data dell'evento in formato gg-mm-aaaa");
        String data = input.nextLine();

        Event evento = new Event(titolo, data, 100);

       





    }

    

}
