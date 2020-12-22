/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpatternexample;

/**
 *
 * @author Manjula Devapura
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Offer offerSet1 = BenifitsFactory.createPackage(BenifitCode.BASIC);
        System.out.println(offerSet1);
        
        Offer offerSet2 = BenifitsFactory.createPackage(BenifitCode.SILVER);
        System.out.println(offerSet2);
        
        Offer offerSet3 = BenifitsFactory.createPackage(BenifitCode.GOLD);
        System.out.println(offerSet3);
        
        Offer offerSet4 = BenifitsFactory.createPackage(BenifitCode.PLATINUM);
        System.out.println(offerSet4);
    }
    
}
