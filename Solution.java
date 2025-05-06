import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		for(int c = 0; c < cases; c++){
		    int pop = scan.nextInt();
		    int inf = scan.nextInt();
		    int unif = pop - inf;
		    
		    if(inf > unif){
		        System.out.println(unif);
		    }
		    else{
		        System.out.println(inf);
		    }
		}
	}
}
