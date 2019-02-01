public class recursion{
  /*
 *@param n any non-negative value you want to take the sqrt of
 *@return the approximate sqrt of n within a tolerance of 0.001%
 */
  public static double sqrt(double n){
    return guess(n, 1);
  }

  public static double guess(double n, double g){
    if (n==0) return 0; //handles case of 0
    if (g*g < n * 1.00001 //0.001%
    &&  g*g > n * 0.99999){
      return g;
    }
    return guess(n, (n/g + g)/2);
  }

  /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
  public static double sqrt(double n, double tolerance){
    return guess(n, 1, tolerance);
  }

  private static double guess(double n, double g, double tolerance){
    
  }

  /*Recursively find the n'th fibbonaci number in linear time
   *fib(0) = 1; fib(1) = 1; fib(5) = 5
   *precondition: n is non-negative
   */
  public static int fib(int n){
  }

  /*As Per classwork*/
  public static ArrayList<Integer> makeAllSums(){
  }
}
