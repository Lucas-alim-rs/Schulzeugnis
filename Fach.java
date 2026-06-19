/*
 Author: Lucas Alim Roll Sanz
 Projekt: Schulfach
 Lehrer: G.Jarz
 */
public class Fach {

    // Attribute
    private String bezeichnung; // Name des Fachs
    private int note;           // Note 1-5

    // Konstruktor
    public Fach(String bezeichnung, int note) {
        this.bezeichnung = bezeichnung;
        this.note = note;
    }

    // Getter
    public String getBezeichnung() {
        return bezeichnung;
    }
    // Getter
    public int getNote() {
        return note;
    }

    // Ausgabe als Text
    @Override
    public String toString() {
        return String.format("%-20s Note: %d", bezeichnung, note);
    }
}