package DesignPatterns.Adapter;

/**
 * In this example:
 * 
 * LegacySystem is the existing class (Adaptee) that has a method
 * performLegacyOperation.
 * ModernSystem is the target interface that the client expects.
 * LegacySystemAdapter is the adapter class that implements the ModernSystem
 * interface. It has a reference to the LegacySystem and translates the
 * performModernOperation call to performLegacyOperation.
 * The client code uses the ModernSystem interface to perform operations, and
 * the LegacySystem is adapted to work with this interface using the
 * LegacySystemAdapter. This way, the existing class can be used in a new
 * context without modifying its code.
 */
public class Adapter {
    public static void main(String[] args) {
        // Using the LegacySystem with the adapter to conform to the ModernSystem
        // interface
        LegacySystem legacySystem = new LegacySystem();
        ModernSystem modernSystem = new LegacySystemAdapter(legacySystem);

        // Now, the client can use the modern system interface
        modernSystem.performModernOperation();
    }
}

// Existing class (Adaptee): LegacySystem
class LegacySystem {
    public void performLegacyOperation() {
        System.out.println("Legacy System is performing its operation.");
    }
}

// Target interface: ModernSystem
interface ModernSystem {
    void performModernOperation();
}

// Adapter: LegacySystemAdapter
class LegacySystemAdapter implements ModernSystem {
    private LegacySystem legacySystem;

    public LegacySystemAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void performModernOperation() {
        // The adapter translates the modern operation to the existing legacy operation
        legacySystem.performLegacyOperation();
    }
}
