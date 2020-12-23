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
public class ExtraBonus extends Handler {

    @Override
    public double applySalary(Payment payment) {
        System.out.println(payment);
        System.out.print("Calculate AttendanceBonus = ");

        payment.setBonus(2500.00);
        payment.setAmount(payment.getAmount() + payment.getBonus());

        if (payment.getNoOfHours() <= 50) {
            return payment.getAmount();
        } else {
            try {
                return handler.applySalary(payment);
            } catch (NullPointerException ex) {
                System.out.println("\tFailed to calculate Salary amount after Attendance Bonus ");
            } finally {
                return payment.getAmount();
            }
        }

    }

}
