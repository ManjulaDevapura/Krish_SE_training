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
public class OverTime extends Handler {

    @Override
    public double applySalary(Payment payment) {
        System.out.println(payment);
        System.out.print("Calculate OverTime = ");
        payment.setOt((payment.getNoOfHours() - 40) * payment.getBasic() / 40);
        payment.setAmount(payment.getAmount() + payment.getOt());

        if (payment.getNoOfHours() <= 45) {
            return payment.getAmount();
        } else {
            try {
                return handler.applySalary(payment);
            } catch (NullPointerException ex) {
                System.out.println("\tFailed to calculate Salary amount after Over Time ");
            } finally {
                return payment.getAmount();
            }
        }
    }
}
