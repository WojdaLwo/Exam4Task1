package task1;

/*
        Zadanie 01:
        Stworz serwis dla figur geometrycznych.
        Kazda Figura moze miec policzone pole i obwod
        Mamy 3 implementacje (Kwadrat(bok), Kolo(promien), Prostokat(dl, szer))
        Stworz Seriws dla Figur w ktorym bedziemy mieli mozliwosc
        - znalezienia figury z najwiekszym polem (arg metody; lista figur)
        - znalezienie figury z najwiekszym obwodem (typu X) arg metody: lista figur i szukany typ.
        - export listy figur to JSON *void, argument to lista figur oraz sciezka gdzie zapisac
        - import listy figur z JSON  zwraca List<Shape> i jako argument pobiera sciezke do pliku
        nastepnie napisz testy jednostkowe, gdzie trzeba uzyj mockowania (o ile trzeba)
        przygotuj tez raport jacocco z pokryciem kodu testami.
        tyle :)
        json z lista figur ma wygladac np tak:
        [{"type": "circle", "radius": 1.5}, {"type": "rectangle", "width": 15, "height": 20}]
        mozesz zrobic cos takiego aby polecenie mvn clean install budowalo paczke JAR ktora bedize sie dalo od razu
        uruchomic (jakis testowy main w ktoym bedzie np: Sysout(zaliczylem test)) pozdro ;)
*/

import task1.model.*;
import task1.service.ShapeService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Zaliczyłem test, pozdro");

    }
}
