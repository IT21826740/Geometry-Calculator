package Q1;


import java.util.Scanner;

public class Demo {
	public static void main (String [] args) {
		
	   System.out.println("Geometry Calculator");
	   System.out.println("1.Calculate the Area of a Circle");
	   System.out.println("2.Calculate the Area of a Rectangle");
	   System.out.println("3.Calculate the Area of a Triangle");
	   System.out.println("4.Quit");
	   
	   // create object
	   
	   Scanner myScanner = new Scanner(System.in);
	   Geometry G1 = new Geometry();
	   char choice;
	   do {
		   System.out.println("Enter your choice (1-4) :");
		   int x = myScanner.nextInt();
		   //System.out.println(x);
		   
		   if(x==1) {
			   System.out.println("Please enter the radius : ");
			   double r = myScanner.nextDouble();
			   System.out.println(r);
			   
			   double areaCircle=G1.getAreaOfCircle(r);
			   System.out.println("The area of the circle is " + areaCircle);
		       }
		   else if(x==2) {
			   System.out.println("Please enter the length :");
			   double l = myScanner.nextDouble();
			   System.out.println(l);
			   System.out.println("please enter the Width :");
			   double w = myScanner.nextDouble();
			   System.out.println(w);
			   
			   double areaRectangle= G1.getAreaOfRectangle(w, l);
			   System.out.println("The area of the rectangle is " +areaRectangle);      
		   }
		   else if (x==3) {
			   System.out.println("Please enter the base : " );
			   double b = myScanner.nextDouble();
			   System.out.println(b);
			   System.out.println("Please enter the height : ");
			   double h = myScanner.nextDouble();
			   System.out.println(h);
			   
			   double areaTriangle=G1.getAreaOfTriangle(b, h);
			   System.out.println("The area of the triangle is "+areaTriangle);
		   }
		   else if (x==4) {
			   System.out.println("Quit");			   
		   }
		   else {System.out.println("Invalid value") ;  
		   }
		   
		   System.out.println("Do you need to continue(Y/N)" );
		   choice=myScanner.next().charAt(0);
	   }
  
	   
	   while (choice=='Y'||choice=='y');
	   System.out.println();
	   System.out.println("Thank you !!!");
	   myScanner.close();
	   
	   
	   
	   
	}
	
}
