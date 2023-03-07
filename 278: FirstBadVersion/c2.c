// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

int firstBadVersion(int n) {
    long l = 0;
    long r = n;
    long mid = 0;
    while(l<r){
        mid = (l+r)/2;
        if(isBadVersion(mid)){
            r = mid;
        }else{
            l = mid + 1;
        }
    }
    return r;
}
