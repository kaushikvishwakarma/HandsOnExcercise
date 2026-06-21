package FactoryMethodPatternExample;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== Factory Method Pattern - Document Management System ===\n");
        
        System.out.println("--- Creating Word Document ---");
        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.processDocument();
        
        System.out.println();
        
        System.out.println("--- Creating PDF Document ---");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.processDocument();
        
        System.out.println();
        
        System.out.println("--- Creating Excel Document ---");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.processDocument();
        
        System.out.println();
        System.out.println("=== All documents processed successfully! ===");
    }
}
