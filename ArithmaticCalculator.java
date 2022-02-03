package ArithmaticCalci;

    // WAP to create an arithmatic calculator.
	import java.util.Scanner;
	public class ArithmaticCalculator
	{

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	      double n1;
	      double n2;
	      double total;
	      char operator;
	      Scanner S1 = new Scanner(System.in);
	      System.out.println("Enter Two Number");
	      n1 = S1.nextDouble();
	      n2 = S1.nextDouble();
	      System.out.println("\\Enter Your  Choice Operator(+, -, *, /):");
	      operator =S1.next().charAt(0);
	      switch(operator) 
	      {
	      case  '+':
	    	  total = n1 + n2;
	    	  break;
	      case '-':
	    	  total = n1 - n2;
	    	  break;
	      case '*':
	    	  total = n1 * n2;
	    	  break;
	      case '/':
	    	  total = n1 / n2;
	    	  break;
	    	  default :
	    		  System.out.println(" Wrong Operator");
	    		  return;
	    		  
	      }
	      System.out.println("The Result Is the :");
	      System.out.println(n1 + " " + operator + " " + n2 + "=" + total);
	      
		}

	}

