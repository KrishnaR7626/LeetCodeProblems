/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

int guessNumber(int n){
	int l = 1;
    int h = n;
    int res;
    int mid;
    while(l<=h){
        mid = ((long)l+h)/2;
        res = guess((int)mid);
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
