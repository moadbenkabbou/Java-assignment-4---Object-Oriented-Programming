package benkabbou_p1;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class DuplicateRemover {
	static String uniqueWords;
	

	
	
	public static void remove (String dataFile) throws IOException {
		
		int i = 0, j = 0;
		
		Scanner scr = new Scanner(new File("C:\\Users\\benka\\Desktop\\benkabbou_PA4\\benkabbou_p1\\src\\benkabbou_p1\\problem1.txt"));
		ArrayList<String> temp = new ArrayList<String>();
		scr.useDelimiter(" +");

		while (scr.hasNextLine()) {
		 // System.out.print(scr.next() + " ");
			temp.add(scr.nextLine());
		}
		
		String [] arr = temp.toArray(new String[temp.size()]);
		 
        for (i = 0; i < arr.length; i++)
        {
            for (j = i + 1; j < arr.length; j++)
            {
                if (arr[i].equals(arr[j]))
                {
                    arr[j] = null;
                } // this isnt working
            }
        }
        
        for(int k=0; k<arr.length; k++) {
			
			if (arr[k] != null)
			{
				System.out.println(arr[k]);
			}
			
		}// incomplete
		
	   
	}
	
	
	public static void write (String outputFile) {
		
		
	}
	
}
