# Poker auswerten 

## Aufgabe

Schreibe eine Klasse "PokerAuswerter", die Pokerblätter auswertet. Für dieses Kata beschränken wir uns auf High Card und Paare
(falls wir so weit kommen). Designe allerdings so, als würden wir später für ein Pokerspiel alle möglichen Blätter auswerten wollen. 

Auch wenn es keine große Rolle für dieses Kata spielt, eine Zusatzinformation: Die angenommene Pokervariante ist Texas Hold'em. 

Die zentrale Methode bekommt folgende Informationen:

* Die Menge der Karten auf der Hand des Spielers (genau 2) und 
* die Menge der Karten auf dem Tisch (zwischen 0 und 5)

Die Methode gibt dann die jeweils höchste Karte aus beiden Mengen zurück.

## Die Spielkarten

Poker wird mit einem Blatt aus 52 Karten gespielt, je 13 Karten der vier Spielfarben Kreuz, Herz, Pik, Karo.
Die Wertigkeiten sind aufsteigend: 2, 3, 4, 5, 6, 7, 8, 9, 10, Bube, Dame, König und Ass.

## Mögliche Hände

![hand-rankings.jpg](/Users/j_wilmans/Documents/work/taures/bewerbung_coding-dojo/readme%2Fhand-rankings.jpg)

## Ausbaustufe

Erweitere den PokerAuswerter um die Möglichkeit, das höchste Paar zu finden, dass ein Spieler bilden kann. 

Die Methode gibt dann zurück, welchen Kartentyp das höchste Paar hat, das der Spieler insgesamt hat.