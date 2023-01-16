package main.tomedb.java.mainframe.controller.icons;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ModifyIcons{

    /**
     * Methode um Icons auf eine bestimmte Größe und Breite zu formatieren
     * 
     * @param path input datei Pfad
     * @param Height ziel Höhe
     * @param Width ziel Breite
     * @return ImageIcon
     */
    public ImageIcon scaling(String path, int Height, int Width){
        ImageIcon icon = new ImageIcon(this.getClass().getResource(path));
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(Width, Height, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);
        icon.getImage();
        return icon;       
    }  
}