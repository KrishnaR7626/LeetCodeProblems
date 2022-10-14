class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        arr = [i for i in range(1,n+1)]
        for i in range(len(arr)):
            if arr[i] % 3 == 0 and arr[i] % 5 == 0:
                arr[i]="FizzBuzz"
            elif arr[i] % 5 == 0:
                arr[i]="Buzz"
            elif arr[i] % 3 == 0:
                arr[i]="Fizz"
            else:
                arr[i]=str(arr[i])
        return arr
