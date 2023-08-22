# Poker auswerten 

## Aufgabe
Schreibe eine Klasse "PokerAuswerter", die für eine freie Anzahl von Spielern auswertet, was die aktuell höchste Hand
dieses Spielers ist.

Nach Texas Hold'Em Regeln bekommt zunächst jeder Spieler zwei zufällige, persönliche Karten. Dann wird nach einer
Bietrunde (die für dieses Dojo ignoriert werden kann) der sogenannte River aufgedeckt. Das heißt, der Dealer legt drei
Karten vom Stapel offen auf den Tisch.

Die Auswertung soll für genau diese Situation erfolgen, also 2 Karten in der Hand eines Spielers, 3 auf dem Tisch.
Die zentrale Methode bekommt die Informationen über genau diese Karten und gibt die höchste mögliche Hand des Spielers
zurück. Spielfarben können zur Vereinfachung ignoriert werden. 

## Die Spielkarten
Poker wird mit einem Blatt aus 52 Karten gespielt, je 13
Karten der vier Spielfarben Kreuz, Herz, Pik, Karo. Die
Wertigkeiten sind aufsteigend: 2, 3, 4, 5, 6, 7, 8, 9, 10,
Bube, Dame, König und Ass. Die Spielfarbe ist für die
Gewinnermittlung irrelevant.

## Mögliche Hände
![hand-rankings.jpg](readme%2Fhand-rankings.jpg)