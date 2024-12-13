package ru.mirea.it.java.work24.task3;

import java.io.FileNotFoundException;

public interface ICreateDocument {
    public abstract IDocument CreateNew();
    public abstract IDocument CreateOpen(String fileName) throws FileNotFoundException;
}
