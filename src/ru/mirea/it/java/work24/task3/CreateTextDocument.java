package ru.mirea.it.java.work24.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public TextDocument CreateNew() {
        return new TextDocument();
    }

    @Override
    public TextDocument CreateOpen(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                sb.append(data);
            }
            myReader.close();
            String text = sb.toString();
            return CreateNew().setContents(text).setFName(fileName);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }
}
