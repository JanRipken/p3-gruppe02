/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.gruppe02.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author matthiaskoziol
 */
public class WindowEventHandler extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.out.println("exit");
        System.exit(0);
    }
}
