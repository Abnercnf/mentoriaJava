package interfaces.defaultMethods;

import java.security.InvalidParameterException;

public class BrazilInterestRateService implements InterestRateService {
    private double interestRate;

    public BrazilInterestRateService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
