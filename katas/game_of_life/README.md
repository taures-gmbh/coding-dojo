# Game of Life

Eine sehr interessante Fingerübung als Kata: Game of Life.
Das grundsätzliche Ziel ist die Darstellung von Zellen in einem regelmäßigen Gitter.

![Gospers_glider_gun.gif](assets%2FGospers_glider_gun.gif)

Unerwartete Komplexität lässt sich aus diesen 4 einfachen Regeln erzeugen:

* Jede lebende Zelle mit weniger als zwei lebenden Nachbarn stirbt an "Unterbevölkerung"
* Jede lebende Zelle mit mehr als drei lebenden Nachbarn stirbt, an "Überbevölkerung"
* Jede lebende Zelle mit zwei oder drei lebenden Nachbarn überlebt bis zur nächsten Generation
* Jede tote Zelle mit genau drei lebenden Nachbarn wird zu einer lebenden Zelle

Aufgabe des Katas ist es, Code zu schreiben, der eine Nachfolgegeneration durch Anwendung dieser 4 Regeln berechnet.

## Hinweise
* "Benachbart" bedeutet horizontal, vertikal, oder diagonal angrenzend
* Zur Vereinfachung der Testfälle beschränken wir das Gitter auf 3x3 Zellen, das Gitter selbst soll aber in Höhe und BReite variabel sein
* Die Zellen außerhalb des Gitters zählen als "tot" 