package com.company;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String source = args[0]; //defines the file entered in cmd
            String target = args[1];//defines the definition of the file

            File inFile = new File(source); //new file based on what we receive from command lin

            Scanner inside = new Scanner(inFile); //read the source file
            PrintWriter write = new PrintWriter(target);//write to the external file

            while (inside.hasNextLine()) {//go through every line
                String x = inside.nextLine(); //string for each line
                StringBuffer buff = new StringBuffer(x); //use string buffer to get reverse functionality
                buff = buff.reverse(); //reverse it
                String buffConvert = buff.toString(); //convert back to string
                write.println(buffConvert); //write it to the file
            }
            inside.close(); //close your scanner
            write.close(); //close your writer
            System.out.println("Successful print");
        }
        catch (Exception e){ //exception if it all fails
            System.out.println("Oh dear, file brokey");
        }
    }
}
