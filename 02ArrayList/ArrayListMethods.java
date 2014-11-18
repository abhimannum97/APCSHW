import java.util.*;
import java.util.Random;

public class ArrayListMethods{
    
    public static void collapseDuplicate( ArrayList<Integer> L){
	int x = 0;
	while ( x < L.size()){
	    if (L.get(x)==L.get(x+1)){
		    L.remove(x+1);
		    x++;
		}else
		     x++;
	}
    }

   
    public static void randomize(ArrayList<Integer> L){
        Random r = new Random();
	int x = 0;
	while (x < L.size()){
	    int a1 = r.nextInt(L.size());
	    int a2 = r.nextInt(L.size());
	    L.add(a1,(remove(a2)));
	    x++;
	}
    }
		  

    public static void main(String args[]){
	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayListMethods b = new ArrayListMethods();
	
	a.add(3); 
	a.add(4);
	a.add(5 ;
	a.add(1);
	a.add(3 ; 
	a.add(4);
	a.add(5);
	a.add(7 ;
	a.add(8 ;
	a.add(5 ; 
	a.add(4 ;
	a.add(3);
	a.add(3); 
	a.add(4); 
	a.add(8); 
	a.add(2);
	a.add(1); 

	System.out.println(a);
	//       	b.collapseDuplicate(a);
	System.out.println(a);
       	b.randomize(a);
	System.out.println(a);

}


}
