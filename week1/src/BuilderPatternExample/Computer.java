package BuilderPatternExample;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String motherboard;
    private String powerSupply;
    
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.motherboard = builder.motherboard;
        this.powerSupply = builder.powerSupply;
    }
    
    public String getCpu() {
        return cpu;
    }
    
    public String getRam() {
        return ram;
    }
    
    public String getStorage() {
        return storage;
    }
    
    public String getGpu() {
        return gpu;
    }
    
    public String getMotherboard() {
        return motherboard;
    }
    
    public String getPowerSupply() {
        return powerSupply;
    }
    
    public void displaySpecs() {
        System.out.println("Computer Specifications:");
        System.out.println("CPU: " + (cpu != null ? cpu : "Not specified"));
        System.out.println("RAM: " + (ram != null ? ram : "Not specified"));
        System.out.println("Storage: " + (storage != null ? storage : "Not specified"));
        System.out.println("GPU: " + (gpu != null ? gpu : "Not specified"));
        System.out.println("Motherboard: " + (motherboard != null ? motherboard : "Not specified"));
        System.out.println("Power Supply: " + (powerSupply != null ? powerSupply : "Not specified"));
    }
    
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private String motherboard;
        private String powerSupply;
        
        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        
        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }
        
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        
        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        
        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }
        
        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }
        
        public Computer build() {
            return new Computer(this);
        }
    }
}
