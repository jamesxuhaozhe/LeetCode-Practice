package designpractice.movierentalexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozhexu on 3/8/16.
 */
public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {
            double thisAmount = getAmountForRental(rental);
            frequentRenterPoints += rental.getFrequentRenterPoints();
            result += "\t" + rental.getMovie().getTitle() + "\n" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private double getAmountForRental(Rental rental) {
        return rental.getCharge();
    }
}
