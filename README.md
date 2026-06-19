# [Schul Zeugnis]

Erzeuge eine Klasse Zeugnis zusätzlich zur main Klasse.
•	Im Zeugnis existiert ein Schülername, Geburtsdatum, Zeugnisdatum
•	Via Konstruktor sollen alle Werte eingelesen werden
•	Erzeuge eine Klasse Schulfach mit Gegenstandsbezeichnung und Note
•	Lege eine ArrayList von Schulfächern (auf max. 10 Fächer begrenzen) innerhalb der Zeugnisklasse an
•	Aus den Elementen soll ein Notendurchschnitt via Zeugnis Klasse ausgerechnet und in dieser gespeichert werden (auch Eigenschaft der Zeugnis Klasse)
•	Danach sollen die Fächer/Objekte aufsteigend sortiert werden – eine Methode der Klasse Zeugnis  (siehe unten) – ACHTUNG: nicht die Standard Sortierfunktion der Liste verwenden ;)
•	Schreib im Zeugnis eine Ausgabefunktion welche ein selbst gestaltetes Zeugnis mit Name, Geburtsdatum… alle Fächern und Gesamtnotenschnitt und am Ende das Datum ausgibt

Bubblesort:  mit Objekten des Typs Schulfach als Übergabefeld

Erklärung des Algorithmus: (Anhand des Beispiels mit int Zahlen)
Es wird immer die aktuelle Zahl mit der nächsten verglichen und bei Bedarf getauscht.
Für das Tauschen verwende die swap Funktion.
So steht am Ende des 1. Durchlaufs die höchste Zahl am Ende  Wie eine Luftblase welche im Wasser aufsteigt. Danach wiederholt sich der Vorgang von der ersten bis zur vorletzten Zahl. Danach ist auch diese an ihrer Endposition. Usw.

---

## 📋 Projektinformationen

| Feld              | Inhalt                          |
|-------------------|---------------------------------|
| **Projektname**   | [Zeugnis]                       |
| **Klasse**        | [1aAPC]                         |
| **Schuljahr**     | [2025/26]                       |
| **Abgabedatum**   | [18.03.2026]                    |
| **Autor/in**      | [Lucas Alim Rll Sanz]           |
| **Lehrer/in**     | [G.Jarz]                        |
| **Fach**          | [ITL1/2]                        |

---

## 📝 Projektbeschreibung

1 Zeugnis für eine Person
Klasse Zeugnis
Personendaten
Datum (Geb. Datum, Zeugnisdatum)  Format
Gegenstände (ArrayList)
Anzahl Gegenstände (max. 10)
Funktionen:
sortSubjects
printCertificate
addSubject
Klasse Gegenstand
Bezeichnung, Note (, Kurzbezeichnung)
Klasse Main:
Objekt Zeugnis erstellen
Basisdaten (fix setzen oder einlesen)
Gegenstände und Noten einlesen und hinzufügen zum Zeugnis Objekt
Liste der Gegenstände sortieren (Bubble Sort – Collections.swap())
Zeugnis ausgeben
---

## 📸 Screenshot


![Screenshot der App](./screenshot.png)
![Screenshot 2 der App](./screenshot2.png)

---

## 🛠️ Entwicklungsumgebung

### Verwendete Software & Tools

| Tool / Software      | Version     | Zweck                          |
|----------------------|-------------|--------------------------------|
| [ItelliJi]           | [2026.01.01]| Code-Editor                    |
| [ GitHub]            | [online]    | Versionskontrolle              |


