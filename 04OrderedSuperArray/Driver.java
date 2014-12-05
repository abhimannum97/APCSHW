import java.util.*;

public class Driver{

    public static void main(String[]args){
	
	SuperArray n = new SuperArray();
	Random rand = new Random();
	
	for(int i = 0; i < 20; i++){
	    n.add("" + rand.nextInt(100));
	}

	System.out.println(n.toString2());

    }

}
