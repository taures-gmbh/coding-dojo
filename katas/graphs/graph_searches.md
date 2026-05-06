# Graphen (Breitensuche)

https://de.wikipedia.org/wiki/Graph_(Graphentheorie)

Graphen sind eine der wichtigsten Datenstrukuren der Informatik.

Diese Aufgabe versucht, an Hand eines praktischen Beispiels Verständnis für ihre Grundstruktur zu schaffen. Außerdem befassen wir uns mit der Suche in Graphen (Dieses Mal am Beispiel der Breitensuche).

## Beschreibung

Repräsentiere den unten aufgezeichneten Graphen als Code. Knoten und Kanten sind - mathematisch gesprochen - beide "gefärbt". Konten können

* Filme
* Schauspieler
* Regisseure sein.

Entsprechend drücken die Pfeile unterschiedliche Beziehungen zwischen diesen Knoten aus:

* a spielt in b
* a führte Regie in b

Die Farbe der Kanten ist für unsere Aufgabe jedoch nicht wichtig.

```
                [Christopher Nolan]
                         |
                         |
                  [Inception]
                  /        \
                 /          \
[Leonardo DiCaprio]   [Joseph Gordon-Levitt]
        |
        |
[Catch Me If You Can]
     /           \
    /             \
[Tom Hanks]   [Steven Spielberg]
```

## Aufgabe 1

https://de.wikipedia.org/wiki/Breitensuche
Schreibe eine Breitensuche, welche alle Schauspieler eines Graphen einsammelt und als Ergebnis diese in einem Set zurück gibt.

## Aufgabe 2

Formuliere die Suche allgemein, so dass nach beliebigen Knoten gesucht werden kann, die eine frei bestimmbare Bedingung erfüllen.

## Aufgabe 3

https://de.wikipedia.org/wiki/Tiefensuche

Implementiere eine allgemeine Tiefensuche, so dass nach beliebigen Knoten gesucht werden kann, die eine frei bestimmbare Bedingung erfüllen.

## Aufgabe 4
Screibe eine Suche, die den Weg zwischen zwei Knoten heraussucht (egal ob per Breiten- oder Tiefensuche). Input sollten der Start- und der Endknoten sein. Ergebnis ist eine sortierte Liste aller besuchten Knoten (inkl. der Start- und Endknoten).
