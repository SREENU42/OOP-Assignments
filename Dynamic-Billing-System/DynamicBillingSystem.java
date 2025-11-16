class Billing {
    double calculateBill(int units) {
        return units * 5;
    }

    // Correct name
    double calculateBill(int units, boolean peakHour) {
        if (peakHour) return units * 8;
        return units * 5;
    }

    // Correct name + corrected formula
    double calculateBill(int units, boolean peakHour, String customerType) {
        int base;
        switch (customerType.toUpperCase()) {
            case "DOMESTIC": base = 4; break;
            case "INDUSTRIAL": base = 10; break;
            default: base = 7; 
        }

        if (peakHour)
            return units * (base + 2); 

        return units * base;
    }
}

class Domestic extends Billing {
    @Override
    double calculateBill(int units) {
        return units * 4;
    }
}

class Industrial extends Billing {
    @Override
    double calculateBill(int units) {
        return units * 10;
    }
}

class Commercial extends Billing {
    @Override
    double calculateBill(int units) {
        return units * 7;
    }
}

public class DynamicBillingSystem {
    public static void main(String[] args) {

        Domestic d = new Domestic();
        Industrial i = new Industrial();
        Commercial c = new Commercial();
        Billing b = new Billing();

        System.out.println("Domestic Bill: " + d.calculateBill(100));
        System.out.println("Industrial Bill: " + i.calculateBill(100));
        System.out.println("Commercial Bill: " + c.calculateBill(100));

        System.out.println("Normal Bill: " + b.calculateBill(100));
        System.out.println("Peak Hour Bill: " + b.calculateBill(100, true));
        System.out.println("Domestic Peak Hour Special: " + b.calculateBill(100, true, "Domestic"));
    }
}
