package com.sda.kolekcje;

import java.util.Arrays;

public class CustomList<E> {

// lista jest generyczna- przechowujemy dowolne obiekty typu np. string, int  itp.
// okreslamy parametry listy. Implementacja naszej arrayListy

    private int size = 0;
    private final int DEFAULT_CAPACITY = 10; // domyslna pojemnosc listy
    private Object elements[];       // tworze tablice typu Object bo korzystamy z tego co wpisze uzytkownik np. inty lub Stringi. Object przyjmuje wszystko bo wszystko dziedziczy po objekcie

    // konstruktor
    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // dodajemy metode, ktora pozwala na dodanie elementow do listy
    public void add(E e) {
        if (size == elements.length) {
            resize();
        }

        // dajemy to po to zeby nowy przychodzacy element nie nadpisywal istniejacy
        elements[size++] = e;
    }

    public void resize() {
        int newSize = elements.length * 2;

        // tworzymy nowa tablice o nowym rozmiarze
        Object nowaTablica[] = new Object[newSize];

        // kopiujemy elementy ze starej tablicy do nowej
        for (int i = 0; i < elements.length; i++) {
            nowaTablica[i] = elements[i];
        }

        // do tablicy elements przypisujemy nowaTablica
        elements = nowaTablica;

        // 2 rozwiazanie
        elements= Arrays.copyOf(elements, newSize);
    }
}


