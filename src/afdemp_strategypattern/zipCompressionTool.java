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
public class zipCompressionTool implements CompressionTool {

    public zipCompressionTool() {
    }

    
    @Override
    public void compressFile() {
        System.out.println("Compressing with zip");
        
    }
    
    
    
}
