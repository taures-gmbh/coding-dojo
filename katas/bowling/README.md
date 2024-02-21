# Bowling 

## Aufgabe

Schreibe eine Klasse "Spiel", die für einen Spieler die Punkte für sein Bowlingspiel auswertet.

Ein Bowling-Spiel besteht aus Würfen, um 10 Pins am Ende der Bowling-Bahn abzuräumen. Mit jedem Wurf können also 0 bis 10 Pins umgeworfen werden. Pro Runde hat ein Spieler max. 2 Würfe, um die 10 Pins abzuräumen.

Würfe werden zu Frames zusammengefasst, die jeweils eine Punktzahl zugeordnet bekommen. Ein Spiel besteht aus 10 Frames.

Wieviele Würfe pro Runde von einem Spieler gemacht werden dürfen, hängt davon ab, wie viele Pins mit ihnen geworfen werden:

Wenn der erste Wurf eines Spielers alle 10 Pins abräumt (Strike), ist er der einzige Wurf in der Runde.
Ansonsten enthalten die Frames immer zwei Würfe, jeder mit 0 bis 10 Pins.

Für die Berechnung der Punktzahl eines Frames gibt es einige Regeln:

Ein Frame, dessen beide Würfe zusammen maximal 9 Pins gerissen haben, erhält die Summe der Pins als Punktzahl.
Ein Frame dessen beide Würfe zusammen 10 Pins berissen haben (Spare), erhält als Punktzahl 10 + die Zahl der Pins des nächsten Wurfes.
Ein Frame mit einem strike erhält als Punktzahl 10 + die Summe der Pins der nächsten beiden Würfe.

Extra:

Wenn der 10. Frame als ersten Wurf einen strike enthält oder beide Würfe zusammen einen spare (s.u.) ergeben, dann kann ein drittes Mal geworfen werden.