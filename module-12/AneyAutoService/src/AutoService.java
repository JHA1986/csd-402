/**
Jonah Aney July 26th, 2025 
CSD-402 Module 12: Yearly Auto Service

Directions:
Write a program with four methods for calculating the cost of a yearly auto service visit. The methods will be titled yearlyService.

    yearlyService(no parameters) - Will return the standard service charge.
    yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
    yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
    yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge, along with a coupon amount that will be deducted from the total cost.

Write a main method that will test each of these methods two times.

This class provides 4 methods to calculate the yearly service cost for an auto service center.
The methods are built to handle 4 different service package sale scenarios:
*/

public class AutoService {
    
// Constant for standard service charge
    private static final double STANDARD_CHARGE = 100.0;
    
// Method 1: No parameters - returns standard service charge
    public static double yearlyService() {
        return STANDARD_CHARGE;
    }
    
// Method 2: One parameter - oil change fee
    public static double yearlyService(double oilChange) {
        return STANDARD_CHARGE + oilChange;
    }

// Method 3: Two parameters - oil change + tire rotation
    public static double yearlyService(double oilChange, double tireRotation) {
        return STANDARD_CHARGE + oilChange + tireRotation;
    }

// Method 4: Three parameters - oil change + tire rotation - coupon
    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        return STANDARD_CHARGE + oilChange + tireRotation - coupon;
    }

    public static void main(String[] args) {

// Title for test result output
        System.out.println("Auto Service Test Results:");
        
// Testing method 1: no parameters (consistently returns the same value)
        System.out.println("Test 1 - Standard service only: $" + yearlyService());
        System.out.println("Test 2 - Standard service only: $" + yearlyService());

// Testing method 2: one parameter (oil change cost at two different prices)
        System.out.println("Test 3 - Standard + oil change: $" + yearlyService(45.0));
        System.out.println("Test 4 - Standard + oil change: $" + yearlyService(50.0));

// Testing method 3: two parameters (oil change + tire rotation cost at two different prices)
        System.out.println("Test 5 - Standard + oil + tire rotation: $" + yearlyService(45.0, 35.0));
        System.out.println("Test 6 - Standard + oil + tire rotation: $" + yearlyService(50.0, 40.0));

// Testing method 4: three parameters (oil + tire + coupon of the same value)
        System.out.println("Test 7 - Standard + oil + tire - coupon: $" + yearlyService(45.0, 35.0, 15.0));
        System.out.println("Test 8 - Standard + oil + tire - coupon: $" + yearlyService(50.0, 40.0, 15.0));
    }
}
    


    

