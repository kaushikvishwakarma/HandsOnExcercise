package FactoryMethodPatternExample;

public class WordDocument implements Document {
    
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
    
    @Override
    public void close() {
        System.out.println("Closing Word Document...");
    }
    
    @Override
    public void save() {
        System.out.println("Saving Word Document (.docx)...");
    }
    
    @Override
    public void print() {
        System.out.println("Printing Word Document...");
    }
}
