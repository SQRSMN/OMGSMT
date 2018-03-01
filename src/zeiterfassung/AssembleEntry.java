/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeiterfassung;


import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author simon
 */


public class AssembleEntry {
    
String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());    
    
    public String getTimestamp(){
    System.out.println(timeStamp);
    return timeStamp;
    }
    
    
        
    
}

