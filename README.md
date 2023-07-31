

# Aufgabe: Römische Zahlen umwandeln

Schreibe eine Klasse RomanNumberConverter.
Die Klasse soll eine Funktion beinhalten, die eine römische Zahl in eine dezimale Zahl umwandelt.

Römische Zahlen bestehen aus einer Kombination der folgenden Symbole:


| Symbol | Wert |
|--------|------|
| I      | 1    |
| V      | 5    |
| X      | 10   |
| L      | 50   |
| C      | 100  |
| D      | 500  |
| M      | 1000 |


### Regeln:

* Die Symbole werden von links nach rechts in absteigender Reihenfolge gelesen.
* Wenn ein kleineres Zeichen vor einem größeren steht, subtrahierst du das kleinere. Zum Beispiel: IV ist 4.
* Wenn das kleinere Zeichen nach einem größeren steht, addierst du das kleinere. Zum Beispiel: VII ist 7.

### Beispiele:

* "III" sollte 3 zurückgeben.
* "IV" sollte 4 zurückgeben.
* "IX" sollte 9 zurückgeben.
* "LVIII" sollte 58 zurückgeben, da L = 50, V = 5, III = 3.
* "MCMXCIV" sollte 1994 zurückgeben, da M = 1000, CM = 900, XC = 90 und IV = 4.


#### Zusatzfrage:
Implementiere die entgegengesetzte Funktion, die eine dezimale Zahl in eine römische Zahl umwandelt.