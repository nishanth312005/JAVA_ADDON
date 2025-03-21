package day4;

public class Ex1_Exception_Handling {
		public static void main(String[] args) {
			try {
				int num = 10 / 0;   //Arithmetic Exception
			} catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero:"+ e.getMessage());
			} finally{
				System.out.println("Execution completed");	
			}
		}             
	}
	        


