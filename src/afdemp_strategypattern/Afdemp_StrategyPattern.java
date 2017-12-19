/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afdemp_strategypattern;

/**
 *
 * @author DAYWALKER
 */
public class Afdemp_StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dfasfaga
        Context context = new Context(new rarCompressionTool());
        context.executeCompression();
        
        context = new Context(new zipCompressionTool());
        context.executeCompression();
        
    }
    
}
