/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SettingsDAO {

    private String path = "./data/Settings.txt";
    private String fileContent;

    public void write(String thema) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        bw.write(thema);
        bw.close();
    }

    public String read() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            fileContent = br.readLine();


            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }
}
