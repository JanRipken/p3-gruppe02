/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import model.BookModel;
import model.BookModelList;

/**
 *
 * @author janri
 */
public class SouthPanelJList extends JList<String>  {

    private BookModelList list;
    
    
    private DefaultListModel<String> listModel;
    

    public SouthPanelJList() {
        listModel = new DefaultListModel<String>();
        
        list = new BookModelList();
        
        

    }

    public void addToList(BookModel book) {
        list.addBook(book);
        
       displayList();
    }
    
    public void displayList(){
        setModel(listModel);
        listModel.removeAllElements();
        for(BookModel b : list.bookModelList){
            
            b.getAutorName();
            
            listModel.addElement(b.getTitel());
            listModel.addElement(b.getAutorName());
            listModel.addElement(b.getAutorVorname());
            
        }
    }

}
