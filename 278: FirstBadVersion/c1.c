// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

int firstBadVersion(int n) {
    long int left = 0;
    long int right = n;
    long int lowestIsBad = right;
    while(left<=right){
        long int median = (left+right)/2;
        bool isBad = isBadVersion(median);
        if(isBad){
            lowestIsBad = median;
            right = median-1;
        }else{
            left = median+1;          
        }
    }
    return lowestIsBad;
}
