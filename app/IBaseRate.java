package app;

public interface IBaseRate {

    // Method returns the base rate
    default double getBaseRate() {
        return 2.5;
    }
}
