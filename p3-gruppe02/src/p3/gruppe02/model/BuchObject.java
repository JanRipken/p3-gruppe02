package p3.gruppe02.model;

/**
 *
 * @author matthiaskoziol
 */
public class BuchObject {

    private String Titel;
    private String AutorName;
    private String AutorVorname;
    private int Seitenanzahl;
    private boolean Gelesen;
    private double Bewertung;
    private int Erscheinungsjahr;

    private BuchObject(String titel) {
        this.Titel = titel;
    }

    private BuchObject(String titel, String autorname, String autorvorname, int seitenanzahl, boolean gelesen, double bewertung, int erscheinungsjahr) {
        this.Titel = titel;
        this.AutorName = autorname;
        this.AutorVorname = autorvorname;
        this.Seitenanzahl = seitenanzahl;
        this.Gelesen = gelesen;
        this.Bewertung = bewertung;
        this.Erscheinungsjahr = erscheinungsjahr;
    }
    private String getTitel(){
        return this.Titel;        
    }
    private String getAutorName(){
        return this.AutorName;        
    }
    private String getAutorVorname(){
        return this.AutorVorname;        
    }
    private int getSeitenanzahl(){
        return this.Seitenanzahl;        
    }
    private boolean getGelesen(){
        return this.Gelesen;        
    }
    private double getBewertung(){
        return this.Bewertung;        
    }
    private int getErscheinungsjahr(){
        return this.Erscheinungsjahr;        
    }
}
