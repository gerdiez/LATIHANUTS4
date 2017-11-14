/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author User
 */
public class LATIHANUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ModelDesigner md = new ModelDesigner();
        md.bonusdesigner();
        
        System.out.println("\n");
        
        ModelProgrammer mpr = new ModelProgrammer();
        mpr.bonusprogrammer();
        
        System.out.println("\n");
        
        ModelSystemAnalyst ma = new ModelSystemAnalyst();
        ma.bonusSystemAnalyst();
    }
    
}
