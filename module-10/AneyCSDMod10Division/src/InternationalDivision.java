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

    InternationalDivision File:
 */

// InternationalDivision class extends Division and adds country and language fields
public class InternationalDivision extends Division {
    private String country;
    private String language;

// Constructor requires all fields
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

// Display division details
    @Override
    public void display() {
        System.out.println("International Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}