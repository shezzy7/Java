# simple fibbonacci code without using concept of memoization(DP)
def fib(n):
    if n==0 or n==1:
        return n
    
    return fib(n-1)+fib(n-2)

print(fib(6))


# fibonacci code using concept of memoization
def fib2(n , dp):
    if n==0 or n==1:
        return n
    
    if dp[n]!=0: # If already computed, return from memory
        return dp[n]
    
    dp[n] = fib2(n-1 , dp) + fib2(n-2 , dp)
    return dp[n]

n=7
print(fib2(n ,  [0]*(n+1))) #here we are passing n as a number of whome we have to calculate fibonacci value and a list of of n+1 size with alll the values 0. At each ith index we will be storing fibnacci of the ith number. If fibonacci of any number has been calculated already then we will not be calculating it again we will be fetching its value from this list.