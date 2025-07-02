# coding-dojo: Internes Zahlungssystem

Schreibe eine Funktion welche eine Zahlungsanfrage zwischen Abteilungen eines Unternehmens erstellt. Diese Funktion nimmt entgegen wer die Zahlung angewiesen hat (Nachname), 
welche Abteilung die Zahlung erhält und die Abteilung welche bezahlt. Eine Abteilung hat eine leitende Person, welche durch den Nachnamen identifiziert wird
und außerdem ein aktuelles Budget.

Die Zahlungsanweisung folgt diesen Regeln:
- Das aktuelle Budget einer Abteilung darf nicht ins negative gehen
- Nur ein Abteilungsleiter darf Zahlungen anweisen
- Der Betrag der Zahlungsanweisung darf nicht negativ sein


Bonus:
Erstelle einen Service der die Zahlungsanfrage ausführt
- Das Budget der Abteilung die die Zahlung erhält wird um die Höhe der Zahlung erhöht 
- Zahlungen über 10.000 Euro müssen vor der Ausführung bestätigt worden sein, dies wird über einen Status an der Zahlungsanweisung festgehalten. Diese Bestätigung ist nicht mit zu implementieren. 
  Es muss nur durch Tests gezeigt werden, dass dieser Status berücksichtigt wird.





