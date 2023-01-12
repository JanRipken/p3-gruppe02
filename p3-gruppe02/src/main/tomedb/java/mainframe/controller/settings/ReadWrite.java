
package main.tomedb.java.mainframe.controller.settings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

    private String path = "./settings/Thema";
    private String fileContent;

    public void write(String theme) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write(theme);
        bufferedWriter.close();
    }

    public String read() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            fileContent = bufferedReader.readLine();

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }
}
