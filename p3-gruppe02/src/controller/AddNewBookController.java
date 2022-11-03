
package controller;

import model.BookModel;
import view.AddNewBook;


public class AddNewBookController {
    private AddNewBook view;
    private BookModel model;
    
    public AddNewBookController(AddNewBook view,BookModel model){
        this.model = model;
        this.view = view;
    }
    
    public String getTitel(){
        return model.getTitel();
    }
    
    public void setTitel(String titel){
        model.setTitel(titel);
    }
    
    public String getAutorName(){
        return model.getAutorName();
    }
    
    public void setAutorName(String AutorName){
        model.setAutorName(AutorName);
    }
     public String getAutorVorname(){
        return model.getAutorVorname();
    }
    
    public void setAutorVorname(String AutorVorName){
        model.setAutorVorname(AutorVorName);
    }
     public int getSeitenanzahl(){
        return model.getSeitenanzahl();
    }
    
    public void setSeitenanzahl(int Seitenanzahl){
        model.setSeitenanzahl(Seitenanzahl);
    }
     public boolean getGelesen(){
        return model.getGelesen();
    }
    
    public void setGelesen(boolean gelesen){
        model.setGelesen(gelesen);
    }
     public double getBewertung(){
        return model.getBewertung();
    }
    
    public void setBewertung(double bewertung){
        model.setBewerung(bewertung);
    }
    
    public int getErscheinungsjahr(){
        return model.getErscheinungsjahr();
    }
    
    public void setErscheinungsjahr(int erscheinungsjahr){
        model.setErscheinungsjahr(erscheinungsjahr);
    }
    
    
}
