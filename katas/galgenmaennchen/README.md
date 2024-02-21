# Aufgabe: Galgenmännchen

Schreibe eine Klasse <code>Galgenmaennchen</code>.
Über den Konstruktor erhält die Instanz das gesuchte Wort als String.
Ferner verfügt die Klasse über eine Methode <code>rateBuchstabe</code>.
Die Methode erhält ein Zeichen als Eingabe und überprüft, an welchen Stellen innerhalb des gesuchten Wortes das Zeichen vorkommt. Die Methode gibt jeweils den bis zu diesem Zeitpunkt erratenen Bestandteil des Worts zurück.

```java
public class Galgenmaennchen {

  public Galgenmaennchen(string gesuchtesWort) { ... }

  public String rateBuchstabe(char buchstabe) { ... }

}
```

Folgende Tabelle zeigt den Verlauf an einem Beispiel.


| Methode       | Eingabe   | Ausgabe   |
|---------------|-----------|-----------|
| constructor   | Developer |           |
| rateBuchstabe | u         | --------- |
| rateBuchstabe | e         | -e-e---e- |
| rateBuchstabe | n         | -e-e---e- |
| rateBuchstabe | o         | -e-e-o-e- |
| rateBuchstabe | r         | -e-e-o-er |
| rateBuchstabe | a         | -e-e-o-er |
| rateBuchstabe | d         | De-e-o-er |
| rateBuchstabe | l         | De-elo-er |
| rateBuchstabe | p         | De-eloper |
| rateBuchstabe | v         | Developer |
