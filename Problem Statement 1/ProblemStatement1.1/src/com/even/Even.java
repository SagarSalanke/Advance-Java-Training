package com.even;

import java.util.*;

public class Even {
	public static void main(String []args)

	   {

	       int n=0,i=0;

	         

	       Scanner X = new Scanner(System.in);

	         

	       System.out.print("Enter value n : ");

	       n = X.nextInt();

	         

	       for(i=0; i<=n; i++)

	       {

	           if(i%2==0)

	               System.out.print(i+" ");

	       }    

	       System.out.println();

	         

	   }
}
