package com.sda.kolekcje;

public class Main {

    public static void main(String[] args) {


        //implementujemy swoja liste zeby zobaczyc jak to dziala


        CustomList <String> lista = new CustomList<>();

        lista.add("Jan");
        lista.add("Maciej");
        lista.add("3");
        lista.add("4");
        lista.add("5");
        lista.add("6");
        lista.add("7");
        lista.add("8");
        lista.add("9");
        lista.add("10");
        lista.add("11");
        lista.add("ada");




        for (int i = 0; i< lista.size(); i++ ){
            System.out.println(lista.get(i));
        }
    }
}
