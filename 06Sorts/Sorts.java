package com.arsenyko.algs;
import java.util.*;
import java.util.Arrays;
import java.util.LinkedList;
public class Sorts{

     public static String name(){
	return "Abhimannu Majumder";
    }

    public static String period(){
	return "Period 7";
    }

    public static void main(String[]args){
	
	Random rand = new Random();
	int[] x = new int[10];
	for (int i = 0; i < 10; i++){
	    x[i] = rand.nextInt(40);
	}
	
	System.out.print(Arrays.toString(x));
        Sorts.radix(x);
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


    public static void radix(int[] array) {
	ArrayList<ArrayList<Integer>> counter = new ArrayList<ArrayList<Integer>>();
	for (int r = 0; r < 10; r++){
	    counter.add(new ArrayList<Integer>());
	}
	int max = array[0];
	for (int i = 0; i < array.length; i++){
	    if (array[i] > max){
		max = array[i];
	    }
	}
	int mod = 10;
        int dev = 1;
	int returns;
        for (int i = 0; i < max; i++, dev *= 10, mod *= 10) {
            //System.out.println(Arrays.toString(array));
            for(int j = 0; j < array.length; j++) {
                int bucket = (array[j] % mod) / dev;
                counter.get(bucket).add(array[j]);
            }
	    int pos = 0;
            for(int j = 0; j < counter.size(); j++) {
                Integer value = null;
                while ((value = counter.get(j).poll()) != null) {
                    //System.out.println(value);
                    array[pos++] = value;
                }
            }
        }
    }


}
			     

	    
	    

	    
	

