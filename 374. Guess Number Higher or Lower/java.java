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
        int l = 1;
        int h = n;
        int res;
        int mid = 0;
        while(l<=h){
            mid = (l+h)/2;
            res = guess(mid);
            if(res == 0){
                return mid;
            }else if(res == 1){
            l = mid+1;    
            }else{
            h = mid-1;
            }
        }
        return mid;
    }
}
