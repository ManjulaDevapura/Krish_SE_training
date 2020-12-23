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
class Payment {

    private final int empNo;
    private final String empType;
    private final int noOfHours;
    private final double basic;
    private double ot;
    private double epfEtf;
    private double bonus;
    private double amount;

    public Payment(EmpCode empCode, int empNo, int noOfHours) {
        this.empNo = empNo;
        this.empType = empCode.getEmpCode();
        this.noOfHours = noOfHours;
        this.basic = EmpType.checkEmpType(empCode);
    }

    public void setOt(double ot) {
        this.ot = ot;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setEpfEtf(double epfEtf) {
        this.epfEtf = epfEtf;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public int getEmpNo() {
        return empNo;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public double getBasic() {
        return basic;
    }

    public double getOt() {
        return ot;
    }

    public double getEpfEtf() {
        return epfEtf;
    }

    public double getAmount() {
        return amount;
    }
        
    public String getEmpType() {
        return empType;
    }
    
    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Payment{" + "empNo=" + empNo + ", empType=" + empType + ", noOfHours=" + noOfHours + ", basic=" + basic + ", ot=" + ot + ", epfEtf=" + epfEtf + ", bonus=" + bonus + ", amount=" + amount + '}';
    }

}
