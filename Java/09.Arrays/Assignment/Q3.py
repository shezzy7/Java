
def maxProfit(arr):
    # We are given an array prices where prices[i] is the price of a given stock on the ith day.Return the max profit you can achieve from this transaction.If you cannot achieve any profit , return 0.
    # input:[7,6,4,3,1] , output:0
    # input:[7,6,4,3,8] , output:5
    
    res = 0
    buy = arr[0]
    for i in range(len(arr)):
        
        if arr[i]-buy>res:
            res=arr[i]-buy
        else:
            if arr[i]<buy:
                buy=arr[i]
    
    return res

def main():
    arr = [7,7,5,3,6,4]
    res = maxProfit(arr)
    print(res)


main()