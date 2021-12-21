
package javaexample93choosingcharset;

import java.io.*;
import java.util.Scanner;


public class JavaExample93ChoosingCharSet {

    
    
    public static void main(String[] args) {
        /*---------------------------------------------------------------------
        try{
        
            // when output, Unicode-characters are re-selected to the corresponding 
            // characters in the set "Cp850".
            OutputStreamWriter osw = new OutputStreamWriter(System.out, "Cp850");
            
            // The boolean; if true, the println, printf, or format methods 
            // will flush the output buffer.
            PrintWriter pw = new PrintWriter(osw, true);
            
            pw.println("En svensk mening: Vår häst är bäst under hösten.");
            pw.println();
            
            
            // when input,  local characters are interpreted according to 
            // the set "Cp850" and are converted to corresponding Unicode-set
            InputStreamReader isr = new InputStreamReader(System.in, "Cp850");
            
            BufferedReader br = new BufferedReader(isr);
            
            System.out.println("Skriv en rad....");
            String rad = br.readLine();
            
            pw.println("Din rad: "+rad);
            
            pw.println();
            pw.println();
            
            
            // another way. using Scanner
            Scanner myScan = new Scanner(System.in, "Cp850");
            System.out.println("Skriv en rad (Nu använder vi en Scanner)....");
            String radScan = myScan.nextLine();
            
            pw.println("Din rad (användning Scanner): "+radScan);
            
            pw.println();
            pw.println();
            
            // closing streams
            osw.close();
            isr.close();
        }
        // The Character Encoding is not supported.
        catch(UnsupportedEncodingException e)
        {
            System.out.println(e.toString());
        }
        
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        -------------------------------------------------------------------- */
        //AnotherWay.InputOutput();
        
        ThirdWay.InputOutput();
        
    }// end-main
    
}