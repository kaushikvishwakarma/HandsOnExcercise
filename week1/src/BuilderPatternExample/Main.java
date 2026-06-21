package BuilderPatternExample;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== Builder Pattern - Computer Configuration ===\n");
        
        System.out.println("--- Gaming Computer ---");
        Computer gamingComputer = new Computer.Builder()
            .setCpu("Intel Core i9-13900K")
            .setRam("32GB DDR5")
            .setStorage("2TB NVMe SSD")
            .setGpu("RTX 4090")
            .setMotherboard("ASUS Z790 E-Gaming")
            .setPowerSupply("1200W Platinum")
            .build();
        
        gamingComputer.displaySpecs();
        
        System.out.println("\n--- Office Computer ---");
        Computer officeComputer = new Computer.Builder()
            .setCpu("Intel Core i5-13600K")
            .setRam("16GB DDR4")
            .setStorage("512GB SSD")
            .setMotherboard("MSI H770 Pro")
            .setPowerSupply("600W Bronze")
            .build();
        
        officeComputer.displaySpecs();
        
        System.out.println("\n--- Budget Computer ---");
        Computer budgetComputer = new Computer.Builder()
            .setCpu("AMD Ryzen 5 5500")
            .setRam("8GB DDR4")
            .setStorage("256GB SSD")
            .setPowerSupply("500W Bronze")
            .build();
        
        budgetComputer.displaySpecs();
        
        System.out.println("\n=== All computers built successfully! ===");
    }
}
