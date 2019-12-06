import java.io.*;
import java.util.*;

public class CS6083Aashikari {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(new File("inputData3A.txt"));
	    int[] list = new int[100];

	        for (int i = 0; i < list.length; i++){
	        		list[i] = in.nextInt();
	        }
	        
	        int n = list.length; 
	        for (int i=1; i<n; ++i) 
	        { 
	            int key = list[i]; 
	            int j = i-1; 
	  
	            //Move elements of arr[0..i-1], that are 
	            //greater than key, to one position ahead 
	            //of their current position 
	            while (j>=0 && list[j] > key) 
	            { 
	                list[j+1] = list[j]; 
	                j = j-1; 
	            } 
	            list[j+1] = key; 
	        }
	        
	        
	        //Arrays.sort(list);
	        
	        System.out.println(list[10]);
	        System.out.println(list[25]);
	        System.out.println(list[50]);
	        System.out.println(list[70]);
	        System.out.println(list[90]);
	        
	        //for (int k = 0; k < list.length; k++) {   	 	
	        //		System.out.println(list[k]);  	
    	    //}
	        

	    
	    in.close();
	    
	} 
}