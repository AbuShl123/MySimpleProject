package OCA_book_practice;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;
import static java.util.Collections.sort;

import static OCA_book_practice.StaticB.G;
// import static OCA_book_practice.StaticA.G; // compiler will complain!

import static OCA_book_practice.StaticA.mg;
import static OCA_book_practice.StaticB.mg; // there is no problem to import two equal methods.

import static OCA_book_practice.StaticA.mgDif;
import static OCA_book_practice.StaticB.mgDif;


public class StaticImportsGames {
    public static void main(String[] args) {
        // Arrays.asList(); // this will give compiler error because we didn't import Arrays class!
        asList("one"); // but we can do like that!

        int[] arr = {1,3,2,4,6,5};
        sort(arr);

        java.util.ArrayList<Integer> nums = new java.util.ArrayList<>(asList(7,11,9,8,10,14,12,13));
        sort(nums);

        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(nums);

        System.out.println(G);
        System.out.println(StaticA.G);

       // mg(34); // but there will be some problems if we try to call one of those methods
       StaticB.mg(23);
       StaticA.mg(34); // so we have to call them like this
        // though, if method parameters would be different we would be able to call them

        mgDif(10.9); // this is from B
        mgDif(14); // this is from A
    }
}
