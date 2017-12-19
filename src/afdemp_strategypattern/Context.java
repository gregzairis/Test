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
public class Context {
    private CompressionTool compressionTool;

    public Context(CompressionTool compressionTool) {
        this.compressionTool = compressionTool;
    }

  public void executeCompression(){
      compressionTool.compressFile();   
  }
    
    
}
