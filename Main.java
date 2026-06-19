/*
 Author: Lucas Alim Roll Sanz
 Projekt: Schulfach
 Lehrer: G.Jarz
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Daten einlesen
        System.out.println("=== ZEUGNIS ERFASSUNG ===");
        System.out.print("Schülername: ");
        String name = scanner.nextLine();

        System.out.print("Geburtsdatum (TT.MM.JJJJ): ");
        String gebDatum = scanner.nextLine();

        System.out.print("Zeugnisdatum (TT.MM.JJJJ): ");
        String zeugDatum = scanner.nextLine();

        // Zeugnis erstellen
        Zeugnis zeugnis = new Zeugnis(name, gebDatum, zeugDatum);

        // ── PHASE 1: Fachnamen einlesen ──────────────────────────────────
        System.out.println("\nFachnamen eingeben (X drücken zum Beenden, max. 10):");

        ArrayList<String> fachnamen = new ArrayList<>();

        while (fachnamen.size() < 10) {
            System.out.print("Fach " + (fachnamen.size() + 1) + ": ");
            String eingabe = scanner.nextLine().trim();

            // Mit X beenden
            if (eingabe.equalsIgnoreCase("X")) {
                break;
            }

            // Leere Eingabe abfangen
            if (eingabe.isEmpty()) {
                System.out.println("Bitte einen Namen eingeben oder X zum Beenden.");
                continue;
            }

            fachnamen.add(eingabe);
        }

        // Noten bei jedem Fach einlesen
        if (!fachnamen.isEmpty()) {
            System.out.println("\nJetzt die Noten eingeben:");
            for (String fachName : fachnamen) {
                int note = leseNote(scanner, fachName);
                zeugnis.addSubject(new Fach(fachName, note));
            }
        }

        // Menü für  Aktionen
        boolean fertig = false;
        while (!fertig) {
            System.out.println("\n=== ZEUGNIS BEARBEITEN ===");
            System.out.println("1) Weiteres Fach hinzufügen");
            System.out.println("2) Nach Note sortieren");
            System.out.println("3) Alphabetisch sortieren");
            System.out.println("4) Zeugnis ausgeben und beenden");
            System.out.print("Auswahl: ");

            String auswahl = scanner.nextLine().trim();

            switch (auswahl) {
                case "1":
                    if (zeugnis.getAnzahlFaecher() >= 10) {
                        System.out.println("Maximale Anzahl Fächer bereits erreicht.");
                        break;
                    }
                    System.out.print("Fachbezeichnung: ");
                    String neuerName = scanner.nextLine().trim();
                    if (neuerName.isEmpty()) {
                        System.out.println("Kein Name eingegeben, abgebrochen.");
                        break;
                    }
                    int neueNote = leseNote(scanner, neuerName);
                    zeugnis.addSubject(new Fach(neuerName, neueNote));
                    System.out.println("✓ Fach hinzugefügt.");
                    zeugnis.printCertificate();
                    break;

                case "2":
                    zeugnis.sortSubjects();
                    System.out.println("✓ Nach Note sortiert.");
                    zeugnis.printCertificate();
                    break;

                case "3":
                    zeugnis.sortSubjectsByName();
                    System.out.println("✓ Alphabetisch sortiert.");
                    zeugnis.printCertificate();
                    break;

                case "4":
                    fertig = true;
                    break;

                default:
                    System.out.println("Ungültige Auswahl. Bitte 1-4 wählen.");
            }
        }

        // Ausgabe
        zeugnis.printCertificate();

        scanner.close();
    }


     // Liest eine gültige Note (1-5) für ein bestimmtes Fach ein.
     // Beispiel-Ausgabe: "Mathe Note: "

    private static int leseNote(Scanner scanner, String fachName) {
        int note = 0;
        while (note < 1 || note > 5) {
            System.out.print(fachName + " Note: ");
            try {
                note = Integer.parseInt(scanner.nextLine().trim());
                if (note < 1 || note > 5) {
                    System.out.println("Ungültige Note! Bitte 1-5 eingeben.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bitte eine Zahl eingeben!");
            }
        }
        return note;
    }
}