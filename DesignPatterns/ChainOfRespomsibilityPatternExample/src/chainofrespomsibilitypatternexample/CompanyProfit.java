/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofrespomsibilitypatternexample;

/**
 *
 * @author Manjula Devapura
 */
public class CompanyProfit extends Handler {

    @Override
    public double applySalary(Payment payment) {
        System.out.println(payment);
        System.out.print("Calculate CompanyProfit = ");

        if (payment.getNoOfHours() <= 60) {
            payment.setBonus(payment.getBonus() + 2500.00);
            payment.setAmount(payment.getAmount() + 2500.00);
        } else {
            payment.setBonus(payment.getBonus() + 5000.00);
            payment.setAmount(payment.getAmount() + 5000.00);            
        }
        return payment.getAmount();

    }

}
