/*
 Author: Lucas Alim Roll Sanz
 Projekt: Schulfach
 Lehrer: G.Jarz
 */
import java.util.ArrayList;
import java.util.Collections;


public class Zeugnis {

    // Personendaten
    private String schuelername;
    private String geburtsdatum;   // TT.MM.JJJJ
    private String zeugnisdatum;   // TT.MM.JJJJ

    // Fächerliste
    private ArrayList<Fach> faecher;
    private static final int MAX_FAECHER = 10; // max. 10 Fächer

    // Schnitt
    private double notendurchschnitt;

    // Konstruktor
    public Zeugnis(String schuelername, String geburtsdatum, String zeugnisdatum) {
        this.schuelername  = schuelername;
        this.geburtsdatum  = geburtsdatum;
        this.zeugnisdatum  = zeugnisdatum;
        this.faecher       = new ArrayList<>();
        this.notendurchschnitt = 0.0;
    }


    //Max 10 fächer
    public void addSubject(Fach fach) {
        if (faecher.size() >= MAX_FAECHER) {
            System.out.println("⚠  Maximale Fächeranzahl (" + MAX_FAECHER + ") erreicht! Fach nicht hinzugefügt.");
            return;
        }
        faecher.add(fach);
    }


     //Notendurchschnitt berechnen
    public void berechneSchnitt() {
        if (faecher.isEmpty()) {
            notendurchschnitt = 0.0;
            return;
        }

        int summe = 0;
        for (Fach f : faecher) {
            summe += f.getNote(); // Noten zusammenzählen
        }

        // Summe geteilt durch Anzahl
        notendurchschnitt = (double) summe / faecher.size();
    }


     //Sortiert die Fächer nach Note (Bubble Sort).
     //Tauscht Nachbarn, bis alles sortiert ist.

    public void sortSubjects() {
        int n = faecher.size();

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                // Vergleiche linkes und rechtes Fach

                if (faecher.get(j).getNote() > faecher.get(j + 1).getNote()) {

                    // Tauschen
                    Collections.swap(faecher, j, j + 1);
                }
            }
        }
    }


    public void printCertificate() {
        berechneSchnitt(); // Schnitt aktualisieren

        String trennlinie = "-".repeat(35);

        System.out.println();
        System.out.println(trennlinie);
        System.out.println("------------SCHULZEUGNIS-----------");
        System.out.println(trennlinie);
        System.out.println("  Name: " + schuelername);
        System.out.println("  Geburtsdatum: " + geburtsdatum);
        System.out.println(trennlinie);
        System.out.println("FÄCHER & NOTEN");
        System.out.println("─".repeat(35));

        // Alle Fächer ausgeben
        for (Fach f : faecher) {
            System.out.println("* " + f.toString());
        }

        System.out.println("─".repeat(35));
        System.out.println(zeugnisdatum + "  Notendurchschnitt:  " + notendurchschnitt);
        System.out.println(trennlinie);
        System.out.println();
    }

    // Getter
    public double getNotendurchschnitt() {
        return notendurchschnitt;
    }

    public int getAnzahlFaecher() {
        return faecher.size();
    }
    public void sortSubjectsByName() {
        int n = faecher.size();

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                String links  = faecher.get(j).getBezeichnung();
                String rechts = faecher.get(j + 1).getBezeichnung();

                // compareTo > 0 heißt: links steht im Alphabet HINTER rechts
                if (links.compareToIgnoreCase(rechts) > 0) {
                    Collections.swap(faecher, j, j + 1);
                }
            }
        }
        }
}