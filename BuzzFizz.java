/**
 * 
 */

/**
 * @author jwlyn
 *
 */
public class BuzzFizz {

    /**
     * @param args
     */
    public static void main(String[] args) {
        for(int x = 1; x <= 20; x++) {
            System.out.println(x);
            if((x%3==0)){
                System.out.println("Fizz");
            }
            if (x%5 == 0) {
                System.out.println("Buzz");
            }
            if(x%3 == 0 && x%5 ==0) {
                System.out.println("FizzBuzz")
            }
        }

    } 

}
