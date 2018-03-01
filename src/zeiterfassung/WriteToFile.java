/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeiterfassung;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

/**
 *
 * @author simon
 */
public class WriteToFile {

AssembleEntry buildString = new AssembleEntry();
File file = new File("worktime.txt");

public void stampWriter(){
try(FileWriter fw = new FileWriter(file, true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    out.println(buildString.getTimestamp());
    //more code
} catch (IOException e) {
    //exception handling left as an exercise for the reader
}
}}
