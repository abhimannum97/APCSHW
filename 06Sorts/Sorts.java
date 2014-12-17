import java.util.*;
public class Sorts{

    public static void main(String[]args){
	
	Random rand = new Random();
	int[] x = new int[5];
	for (int i = 0; i < 5; i++){
	    x[i] = rand.nextInt(40);
	}
	
	System.out.print(Arrays.toString(x));
        Sorts.bubble(x);
	System.out.println(Arrays.toString(x));

    }

    public static void bubble(int[] c){
	for (int i = 0; i < c.length-1; i++){
	    int hold = 0;
	    for (int x = 0; x < c.length-i-1; x++){
		if (c[x] > c[x+1]){
		    hold = c[x];
		    c[x] = c[x+1];
		    c[x+1]=hold;
		}
	    }
	}
    }

	    
	    
}



}

