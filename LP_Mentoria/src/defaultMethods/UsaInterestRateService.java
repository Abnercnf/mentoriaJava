package interfaces.defaultMethods;

import java.security.InvalidParameterException;

public class UsaInterestRateService implements InterestRateService {
    private double interestRate;

    public UsaInterestRateService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
