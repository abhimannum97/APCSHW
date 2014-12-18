import java.util.*;
public class Sorts{

    public static void main(String[]args){
	
	Random rand = new Random();
	int[] x = new int[10];
	for (int i = 0; i < 10; i++){
	    x[i] = rand.nextInt(40);
	}
	
	System.out.print(Arrays.toString(x));
        Sorts.insertion(x);
	System.out.println(Arrays.toString(x));

    }

    public static void bubble(int[] c){
	int hold;
	for (int i = 0; i < c.length-1; i++){
	    for (int x = 0; x < c.length-i-1; x++){
		if (c[x] > c[x+1]){
		    hold = c[x];
		    c[x] = c[x+1];
		    c[x+1]=hold;
		}
	    }
	}
    }

    public static void insertion(int[] c){
	int hold;
	for (int i = 1; i < c.length; i++){
	    hold = c[i];
	    for (int x = i-1; (x >= 0) && (hold < c[x]); x--){
		c[i] = c[x];
		c[x] = hold;
		hold = c[x];
	    }
	}
    }
		     

	    
	    
}

    }

	    
	    
}



}

