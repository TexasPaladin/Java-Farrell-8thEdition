/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createloans;

/**
 *
 * @author lycan
 */
public class PersonalLoan extends Loan{
    
    public PersonalLoan(int loanNumber, String customerLastName
            , int amountOfLoan, int term, double interestRate) {
        super(loanNumber, customerLastName, amountOfLoan, term);
        this.interestRate = interestRate * 1.02;
    }
    
}
