import java.util.ArrayList;
public class recursion{
  /**Uses the Newton's approximation to recursively find the square root
 *@param n any non-negative value you want to take the sqrt of
 *@return the approximate sqrt of n within a tolerance of 0.001%
 */
  private static double sqrt(double n){
    return guess(n, 1);
  }

  /**Helper function for sqrt with 1 param
  *@param n any non-negative value to sqrt
  *@param g a guess for the square root of n
  *@return g when the square of g is within a 0.001% error margin and guess(n, (n/g+g)/2) if not
  */
  private static double guess(double n, double g){
    //Base cases
    if (n==0) return 0; //handles case of 0
    if (g*g < n * 1.00001 //0.001%
    &&  g*g > n * 0.99999){
      return g;
    }
    //recursive part
    return guess(n, (n/g + g)/2);
  }

  /*You may write additional private methods */

    /**Recursively find the sqrt using Newton's approximation
     *@param n is the number to approximate the sqrt of
     *@param tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative
     *@return an approximate square root of n
    */
  public static double sqrt(double n, double tolerance){
    return guess(n, 1, tolerance);
  }

  /**Helper function for sqrt with 2 params
  *@param n any non-negative value to sqrt
  *@param g a guess for the square root of n
  *@param tolerance is the allowed percent error the squared answer is away from n
  *@return g when the square of g is within the tolerance error margin and guess(n, (n/g+g)/2, tolerance) if not
  */
  private static double guess(double n, double g, double tolerance){
    //Base cases
    if (n==0) return 0; //handles case of 0
    if (g*g < n * 1+tolerance //tolerance
    &&  g*g > n * 1-tolerance){
      return g;
    }
    //recursive part
    return guess(n, (n/g + g)/2);
  }

  /*Recursively find the n'th fibbonaci number in linear time
   *fib(0) = 1; fib(1) = 1; fib(5) = 5
   *precondition: n is non-negative
   */
  public static int fib(int n){
    if (n==1|n==2) return 1;
    return helpFib(n,1,1);
  }

  private static int helpFib(int n, int term1, int term2){
    if (n==2){
      return term2;
    }
    return (helpFib(n-1,term2,term2+term1));
  }

  /*As Per classwork*/
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList L = new ArrayList(Math.pow(2, n));
    makeAllSumsHelper(n, 0, L);
    return L;
  }

  private static void makeAllSumsHelper(int n, int ans, ArrayList<Integer> sums){
    //Base case: n == 0
    if (n==0){
      return sums;
    }
    sums.add(ans+n);
    sums.add(ans);
    makeAllSumsHelper(n-1, ans, sums);
    makeAllSumsHelper(n-1, ans+n, sums);
  }
}
