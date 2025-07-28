/**
Jonah Aney July 26th, 2025 
CSD-402 Module 12: Yearly Auto Service
*/

public class AutoService {
    
// Method 1: No parameters - returns standard service charge
    public static double yearlyService() {
        double standardCharge = 100.0;
        return standardCharge;
    }
    
// Method 2: One parameter - oil change fee
    public static double yearlyService(double oilChange) {
        double standardCharge = 100.0;
        return standardCharge + oilChange;
    }

// Method 3: Two parameters - oil change + tire rotation
    public static double yearlyService(double oilChange, double tireRotation) {
        double standardCharge = 100.0;
        return standardCharge + oilChange + tireRotation;
    }

// Method 4: Three parameters - oil change + tire rotation - coupon
    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        double standardCharge = 100.0;
        double total = standardCharge + oilChange + tireRotation - coupon;
        return total;
    }

    public static void main(String[] args) {
        
// Testing method 1: no parameters
        System.out.println("Test 1 - Standard service only: $" + yearlyService());
        System.out.println("Test 2 - Standard service only: $" + yearlyService());

// Testing method 2: one parameter (oil change)
        System.out.println("Test 3 - Standard + oil change: $" + yearlyService(30.0));
        System.out.println("Test 4 - Standard + oil change: $" + yearlyService(25.0));

// Testing method 3: two parameters (oil change + tire rotation)
        System.out.println("Test 5 - Standard + oil + tire rotation: $" + yearlyService(30.0, 20.0));
        System.out.println("Test 6 - Standard + oil + tire rotation: $" + yearlyService(25.0, 15.0));

// Testing method 4: three parameters (oil + tire + coupon)
        System.out.println("Test 7 - Standard + oil + tire - coupon: $" + yearlyService(30.0, 20.0, 10.0));
        System.out.println("Test 8 - Standard + oil + tire - coupon: $" + yearlyService(25.0, 15.0, 5.0));
    }
}
    

