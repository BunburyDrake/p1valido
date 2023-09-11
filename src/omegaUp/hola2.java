package omegaUp;
import java.util.Scanner;



public class hola2 {



	public static void main(String[] lol) {



	int a,b,c,d=0;



		String msj;



	Scanner in=new Scanner(System.in);



	a=in.nextInt();

	b=in.nextInt();

    for(int i=1;i<=a;i++) {

    	c=in.nextInt();

    	if(c==b) {

    		d=d+1;

    	}

    }

System.out.println(d);

    

    

	}



}