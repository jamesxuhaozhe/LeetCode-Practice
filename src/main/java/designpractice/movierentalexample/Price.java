package designpractice.movierentalexample;

/**
 * Created by haozhexu on 3/9/16.
 */
public abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
