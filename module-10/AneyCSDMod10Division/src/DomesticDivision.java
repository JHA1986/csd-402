/**
Jonah Aney July 13th, 2025 CSD-402 Module-10: Divisions

* Complete the following:

    Create an abstract Division class with fields for a company's division name and account number, and an abstract display () method that will be defined in the subclasses.
    Use a constructor in the superclass that requires values for both fields.
    Create two subclasses named InternationalDivision and DomesticDivision.
    The InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.
    The DomesticDivision class includes a field for the state in which the division is located and a constructor that requires all fields when created. 
    Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
    Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.

    DomesticDivision File:
 */

// DomesticDivision class extends Division and adds state field
public class DomesticDivision extends Division {
    private String state;

// Constructor requires all fields
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

// Display division details
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
