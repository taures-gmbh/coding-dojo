# Game of Life

Eine sehr interessante Fingerübung als Kata: Game of Life.
Das grundsätzliche Ziel ist die Berechnung von Zellen in einem regelmäßigen Gitter.

![Gospers_glider_gun.gif](Gospers_glider_gun.gif)

Zellen haben nur zwei Zustände: Lebendig oder tot. Für dieses Kata berechnen wir eine Nachfolgegeneration. Die grafische Darstellung des Gitters ist nicht Teil der Aufgabe, es geht nur um die Berechnung.



Unerwartete Komplexität lässt sich aus diesen 4 einfachen Regeln erzeugen:

* Jede lebende Zelle mit weniger als zwei lebenden Nachbarn stirbt an "Unterbevölkerung"
* Jede lebende Zelle mit mehr als drei lebenden Nachbarn stirbt, an "Überbevölkerung"
* Jede lebende Zelle mit zwei oder drei lebenden Nachbarn überlebt bis zur nächsten Generation
* Jede tote Zelle mit genau drei lebenden Nachbarn wird zu einer lebenden Zelle

Aufgabe des Katas ist es, Code zu schreiben, der eine Nachfolgegeneration durch Anwendung dieser 4 Regeln berechnet.

## Hinweise
* "Benachbart" bedeutet horizontal, vertikal, oder diagonal angrenzend
* Zur Vereinfachung der Testfälle beschränken wir das Gitter auf 3x3 Zellen. Das Gitter selbst soll aber so designed sein, dass Höhe und Breite variabel einstellbar sind
* Die Zellen außerhalb des Gitters zählen als "tot" 
