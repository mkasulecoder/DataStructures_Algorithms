package DesignPatterns.Facade;

/**
 * Facade, is simply a wrapper class that can be used to abstract lower-level
 * 
 * details that we don't want to worry about.
 */
public class FacadePattern {
    public static void main(String[] args) {
        // Using the Facade to start the computer
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
    }
}

// Subsystem 1: CPU
class CPU {
    public void processData() {
        System.out.println("CPU is processing data.");
    }
}

// Subsystem 2: Memory
class Memory {
    public void loadMemory() {
        System.out.println("Memory is loading data.");
    }
}

// Subsystem 3: Hard Drive
class HardDrive {
    public void readData() {
        System.out.println("Hard Drive is reading data.");
    }
}

// Facade: ComputerFacade
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        System.out.println("Starting computer...");
        cpu.processData();
        memory.loadMemory();
        hardDrive.readData();
        System.out.println("Computer started successfully.");
    }
}