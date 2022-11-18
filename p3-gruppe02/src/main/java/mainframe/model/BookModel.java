package main.java.mainframe.model;

public class BookModel {

    private String Titel;
    private String AutorName;
    private String AutorVorname;
    private int Seitenanzahl;
    private boolean Gelesen;
    private double Bewertung;
    private int Erscheinungsjahr;

    public BookModel(){
    }
    // TODO: testweise auf public, soll private werden ??? sicher ??
    public BookModel(String titel) {  
        this.Titel = titel;
    }

    public BookModel(String titel, String autorname, String autorvorname, int seitenanzahl, boolean gelesen, double bewertung, int erscheinungsjahr) {
        this.Titel = titel;
        this.AutorName = autorname;
        this.AutorVorname = autorvorname;
        this.Seitenanzahl = seitenanzahl;
        this.Gelesen = gelesen;
        this.Bewertung = bewertung;
        this.Erscheinungsjahr = erscheinungsjahr;
    }
    public String getTitel(){
        return this.Titel;        
    }
    public String getAutorName(){
        return this.AutorName;        
    }
    public String getAutorVorname(){
        return this.AutorVorname;        
    }
    public int getSeitenanzahl(){
        return this.Seitenanzahl;        
    }
    public boolean getGelesen(){
        return this.Gelesen;        
    }
    public double getBewertung(){
        return this.Bewertung;        
    }
    public int getErscheinungsjahr(){
        return this.Erscheinungsjahr;        
    }
    public void setTitel(String titel){
        this.Titel = titel;
    }
    public void setAutorName(String autorname){
        this.AutorName = autorname;
    }
    public void setAutorVorname(String autorvorname){
        this.AutorVorname = autorvorname;
    }
    public void setSeitenanzahl(int seitenanzahl){
        this.Seitenanzahl = seitenanzahl;
    }
    public void setGelesen(boolean gelesen){
        this.Gelesen = gelesen;
    }
    public void setBewerung(double bewertung){
        this.Bewertung = bewertung;
    }
    public void setErscheinungsjahr(int erscheinungsjahr){
        this.Erscheinungsjahr = erscheinungsjahr;
    }
}
