/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lo = 1, hi = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            switch(guess(mid)) {
                case -1:
                    hi = mid - 1;
                    break;
                case 1:
                    lo = mid + 1;
                    break;
                default:
                    return mid;
            }
        }
        
        return -1;
    }
}