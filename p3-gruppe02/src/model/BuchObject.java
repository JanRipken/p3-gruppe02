package model;

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

    public BuchObject(String titel) {  //testweise auf public, soll private werden
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
    private void setTitel(String titel){
        this.Titel = titel;
    }
    private void setAutorName(String autorname){
        this.AutorName = autorname;
    }
    private void setAutorVorname(String autorvorname){
        this.AutorVorname = autorvorname;
    }
    private void setSeitenanzahl(int seitenanzahl){
        this.Seitenanzahl = seitenanzahl;
    }
    private void setGelesen(boolean gelesen){
        this.Gelesen = gelesen;
    }
    private void setBewerung(double bewertung){
        this.Bewertung = bewertung;
    }
    private void setErscheinungsjahr(int erscheinungsjahr){
        this.Erscheinungsjahr = erscheinungsjahr;
    }
}
