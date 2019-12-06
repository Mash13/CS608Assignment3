import java.io.*;
import java.util.*;

public class CS6083Bashikari {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(new File("inputData3B.txt"));
	    int[] list = new int[1000];
	    int[] list2 = new int[1000];
	    int[] list3 = new int[1000];
	    
	        for (int i = 0; i < list.length; i++) {
	        		list[i] = in.nextInt();
	        }
	        
	        list2 = list;
		    list3 = list;
	        
		    //Shell diminishing sequence #1
	        int n = list.length; 
	     
	        for (int gap = 10; gap > 0; gap /= 2) { 
	            
	            for (int i = gap; i < n; i += 1) { 

	                int temp = list[i];
	                
	                int j; 
	                for (j = i; j >= gap && list[j - gap] > temp; j -= gap) 
	                    list[j] = list[j - gap]; 
	      
	                list[j] = temp; 
	            	} 
	        	} 
	         
	        
		    //Arrays.sort(list);
	        System.out.println("Shell Sort Gap 10");
	        System.out.println(list[100]);
	        System.out.println(list[125]);
	        System.out.println(list[250]);
	        System.out.println(list[700]);
	        System.out.println(list[900]);
	        System.out.println("Time elapsed in nanoseconds for Shell Sort Gap 10 = ");
	        System.out.println(System.nanoTime());
	        System.out.println("------------------ ");
	        
	        //Shell diminishing sequence #2
	      
		        for (int gap = 6; gap > 0; gap /= 2) { 

		            for (int i = gap; i < n; i += 1) { 

		                int temp = list2[i];
		                
		                int j; 
		                for (j = i; j >= gap && list2[j - gap] > temp; j -= gap) 
		                    list2[j] = list2[j - gap]; 
		      
		                list2[j] = temp; 
		            	} 
		        	}
	            
	            System.out.println("Shell Sort Gap 6");
	            System.out.println(list2[100]);
		        System.out.println(list2[125]);
		        System.out.println(list2[250]);
		        System.out.println(list2[700]);
		        System.out.println(list2[900]);
		        System.out.println("Time elapsed in nanoseconds for Shell Sort Gap 6 = ");
		        System.out.println(System.nanoTime());
		        System.out.println("------------------ ");
	    			
	    
		        //Shell diminishing sequence #3
		        for (int gap = 3; gap > 0; gap /= 2) { 

		            for (int i = gap; i < n; i += 1) { 
		                int temp = list3[i];
		                
		                int j; 
		                for (j = i; j >= gap && list3[j - gap] > temp; j -= gap) 
		                    list3[j] = list3[j - gap]; 
		      
		                list3[j] = temp; 
		            	} 
		        	}
	        
	        System.out.println("Shell Sort Gap 3");
	        System.out.println(list3[100]);
	        System.out.println(list3[125]);
	        System.out.println(list3[250]);
	        System.out.println(list3[700]);
	        System.out.println(list3[900]);
	        System.out.println("Time elapsed in nanoseconds for Shell Sort Gap 3 = ");
	        System.out.println(System.nanoTime());
	    		
	    
	    in.close();
	    
	} 
}