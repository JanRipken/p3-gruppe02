
package main.tomedb.java.mainframe.controller.settings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

    private String path = "./settings/Thema";
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
