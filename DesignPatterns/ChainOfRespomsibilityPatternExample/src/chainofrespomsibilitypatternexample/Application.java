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
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            double fullAmount;
            Salary sal = new Salary();
            OverTime ot = new OverTime();
            ExtraBonus ebonus = new ExtraBonus();
            CompanyProfit cProfit = new CompanyProfit();
            SalarySetter ss = new SalarySetter();

            ss.setHandler(sal);
            sal.setHandler(ot);
            ot.setHandler(ebonus);
            ebonus.setHandler(cProfit);

            Payment pay1 = new Payment(EmpCode.MANAGER, 123, 10);
            fullAmount = ss.applySalary(pay1);
            System.out.println(pay1);
            System.out.println("Full Salary = " + fullAmount + "\n\n");

            Payment pay2 = new Payment(EmpCode.ENGINEER, 123, 100);
            fullAmount = ss.applySalary(pay2);
            System.out.println(pay2);
            System.out.println("Full Salary = " + fullAmount + "\n\n");
        } catch (NullPointerException npex) {
            System.out.println("Error Salary calculation process chain broken ");
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Error Unknown ");
        }
    }
}
