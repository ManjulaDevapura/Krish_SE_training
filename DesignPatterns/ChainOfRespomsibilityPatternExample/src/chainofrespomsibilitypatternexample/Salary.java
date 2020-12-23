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
public class Salary extends Handler {

    @Override
    public double applySalary(Payment payment) {
        System.out.print("Calculate Salary = ");
        double sal = payment.getBasic();
        double deduct = payment.getBasic() * 0.1;//0.1 epfEtf rate
        if (payment.getNoOfHours() == 40) {
            payment.setEpfEtf(deduct);
            payment.setAmount(sal - deduct);
            return payment.getAmount();
        } else if (payment.getNoOfHours() < 40) {
            sal = payment.getNoOfHours() * payment.getBasic() / 40;
            deduct = (payment.getNoOfHours() * payment.getBasic() / 40) * 0.1;//0.1 epfEtf rate
            payment.setEpfEtf(deduct);
            payment.setAmount(sal - deduct);
            return payment.getAmount();
        } else {
            payment.setEpfEtf(deduct);
            payment.setAmount(sal - deduct);
            try {
                return handler.applySalary(payment);
            } catch (NullPointerException ex) {
                System.out.println("\tFailed to calculate Salary amount after Basic ");
            } finally {
                return payment.getAmount();
            }
        }
    }
}
