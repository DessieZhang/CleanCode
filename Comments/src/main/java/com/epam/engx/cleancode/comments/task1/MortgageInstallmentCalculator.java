package com.epam.engx.cleancode.comments.task1;

import com.epam.engx.cleancode.comments.task1.thirdpartyjar.InvalidInputException;

public class MortgageInstallmentCalculator {

    /**
     *
     * @param principal principal amount
     * @param termInYears term of mortgage in years
     * @param interestRate rate of interest
     * @return monthly payment amount
     */
    public static double calculateMonthlyPayment(
            int principal, int termInYears, double interestRate) {

        if (principal < 0 || termInYears <= 0 || interestRate < 0) {
            throw new InvalidInputException("Negative values are not allowed");
        }

        // Convert interest rate into a decimal - eg. 6.5% = 0.065
        interestRate /= 100.0;

        double termInMonths = termInYears * 12;

        if(interestRate == 0)
            return  principal/termInMonths;

        double monthlyRate = interestRate / 12.0;

        // The Math.pow() method is used calculate values raised to a power
        double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));

        return monthlyPayment;
    }
}
