package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	/* given a number n, for each integer i in the range from i to n inclusive,
	   print one value per line as follows:
	 * if i is a multiple of both 3 and 5, print FizzBuzz.
	 * if i is a multiple of 3 but not 5 , print Fizz.
	 * if i is a multiple of 5 but not 3, print Buzz.
	 * if i is not a multiple of 3 or 5, print the value of i
*/
    Numbers.numbers(20);
    }
}
class Numbers{
    public static void numbers(int n){
        for(int i=0;i<n;i++){
            if(i==1 || i==2){
                System.out.println(i);
            }
             if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0 && i%5!=0){
                System.out.println("Fizz");
            }
            else if(i%5==0 && i%3!=0){
                System.out.println("Buzz");
            }
            else if(i%3!=0 && i%5!=0){
                 System.out.println(i);
            }
        }
    }
}
