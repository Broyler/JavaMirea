package ru.mirea.it.java.work24.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextDocument implements IDocument{
    String fileName = "new file";
    String data = "";

    String lastSavedData = "";

    @Override
    public String getContents() {
        return data;
    }

    @Override
    public TextDocument setContents(String contents) {
        data = contents;
        return this;
    }

    public TextDocument setFName(String fName) {
        fileName = fName;
        return this;
    }

    public void save() throws RuntimeException, IOException {
        try {
            if (fileName.equals("new file")) {
                throw new RuntimeException("File name is empty");
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(getContents());
            writer.close();
            lastSavedData = data;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
