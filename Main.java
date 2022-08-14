package preWork;

import java.util.Scanner;



public class Main {

 

Scanner sc = new Scanner(System.in);


           //function to checkPalindrome

       public void checkPalindrome()  {
    	   
    	System.out.println("Please select a number to check for Palindrome: ");
    	
		/*
		 * numberSelected is temp String based on user input. String is better
		 * option here to make use of in built String functions and reverse string to
		 * check if input equal to it's mirror image. 
		 */    	
    	
    	
    	String numberSelected = sc.nextLine();
   		
   		// temp var to store value 
    	
   		String temp_num_str = "";
   		
   		
   		for (int i = numberSelected.length() - 1; i >=0 ; i--) {
   			
   			temp_num_str = temp_num_str + numberSelected.charAt(i);
   		}
   		
   		if (temp_num_str.equals(numberSelected)) {
   			System.out.println("Yes, it is a Palindrome");
   		}
   		else {
   				System.out.println("No, it is not a Palindrome");
   			 }

   			 
   		}

 

            //function to printPattern

       	public void printPattern() {
       		
    		
        	System.out.println("Please select a number to show pattern: ");
     	   
        	int numberSelected = sc.nextInt();
    		
    		for (int i = numberSelected; i >= 0; i--) {
    			
    			for (int j = i; j > 0; j--) {
    				
    				System.out.print("*");
    				
    			}
    			
    			System.out.println();
    			
    		}
    		

       	}

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	
			/*
			 * Track the count of results of remainder after diving with all the numbers. If
			 * divisable for > 2 (itself or by 1), count will be > 2, hence not a prime
			 * number.
			 */
        	
        	System.out.println("Please select a number to check for Prime number: " + "\n");
        	
        	int selectedNumber = sc.nextInt();
        	
        	int count = 0;
        	
        	for (int i = 1; i <= selectedNumber; i++) {
        		
        		if(selectedNumber % i == 0 || selectedNumber % i == selectedNumber) {
        			
        			count++;
        		}
        		
        		
        		
        	}

        	if (count > 2) {
        		System.out.println("Not a prime number"+ "\n");

        	}
        	
        	else {
        		
        		System.out.println("Horray! It is a prime number"+ "\n");

        	}


        }

         

          // function to print Fibonacci Series

        public void printFibonacciSeries() {

        	//initialize the first and second value as 0,1 respectively.
        	
        	System.out.println("Please select a number to check for Fibonacci series: " + "\n");
        	
        	int selectedNumber = sc.nextInt();



        	int first = 0, second = 1;



        	int third = 0;

        	System.out.print(first + " " + second + " ");

        	for (int i = 2; i < selectedNumber; i++) {

        		third = first + second;

        		System.out.print(third + " ");
        		
        		first = second; // reassign value of second to the first
        		second = third; // reassign value of third to the second
        	}

        }
          
 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);
                
                

do {

System.out.println("Enter your choice from below list.\n\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}

