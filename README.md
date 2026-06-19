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
| [z. B. VS Code]      | [z. B. 1.89]| Code-Editor                    |
| [z. B. Android Studio| [z. B. 2024]| Emulator / Build               |
| [z. B. Node.js]      | [z. B. 20.x]| Laufzeitumgebung               |
| [z. B. npm]          | [z. B. 10.x]| Paketverwaltung                |
| [z. B. Git]          | [z. B. 2.45]| Versionskontrolle              |

### Frameworks & Bibliotheken

| Paket / Framework    | Version     | Zweck                          |
|----------------------|-------------|--------------------------------|
| [z. B. Ionic]        | [z. B. 7.x] | UI-Framework                   |
| [z. B. Angular]      | [z. B. 17.x]| Frontend-Framework             |
| [z. B. Capacitor]    | [z. B. 5.x] | Native Device APIs             |
| [z. B. Axios]        | [z. B. 1.x] | HTTP-Anfragen                  |

### Betriebssystem (Entwicklung)

- **OS:** [z. B. Windows 11 / macOS 14 / Ubuntu 24.04]

- [ ] [z. B. Funktioniert nur auf Android, nicht auf iOS]
- [ ] [z. B. Keine Offline-Unterstützung]
