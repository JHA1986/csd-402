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

    UseDivision File:
    */
    
// Application to demonstrate Division subclasses
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intl1 = new InternationalDivision("Europe Sales", 1001, "Ireland", "Irish");
        InternationalDivision intl2 = new InternationalDivision("Asia Sales", 1002, "Japan", "Japanese");

        DomesticDivision dom1 = new DomesticDivision("East Coast", 2001, "Florida");
        DomesticDivision dom2 = new DomesticDivision("West Coast", 2002, "Washington");

        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}