package testing;

import java.util.ArrayList;
import java.util.Random;

public class TestClass {
    public static void main(String[] args) {

        int[] arr = new int [34];

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            arr[i]=num;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        ArrayList list = new ArrayList();

        int min = Integer.MAX_VALUE;

        for(int j=0;j<10;j++){
            min =  Integer.MAX_VALUE;
            for(int k=0;k<arr.length;k++){
                if(arr[k]<min&&!list.contains(arr[k])) min=arr[k];
            }
            list.add(min);
        }


        System.out.println("\nMin elements:");
        for(int l=0;l<list.size();l++){
            System.out.println(list.get(l));
        }
    }
}
