/** Week 2 lab session
 *
 * This class calculates the fibonacci numbers
 *
 * @author  Lennart Wissel
 * @version 10.10.2014
 */

public class Fibonacci {

  /**
   * @param n indicates which fibonacci number we want to compute
   * @return the nth fibonacci number in the sequence 1, 1, 2, 3, 5, 8, 13, ...
   * that is, the sequence of the next number is the sum of its two
   * predecessors.
   * 
   * @author  Lennart Wissel
   * @version 10.10.2014
   */
  public static int fibonacci(int n) {
    if (n == 0) return 1;
    if (n == 1) return 1;

    int pred1 =1, pred2 = 1, aux;
    for (int i = 1; i < n; i++) {
      aux   = pred1;
      pred1 = pred2;
      pred2 = aux + pred2;
    }
    return pred2;
  }
  public static void main(String[] args){
    System.out.println(fibonacci(5));
  }
}
