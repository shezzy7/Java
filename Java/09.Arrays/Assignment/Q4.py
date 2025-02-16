
def trappedWater(arr):
    ''' 
    Given n-negative integers representing an elevation map where the width of each bar is 1,compute how much water it can trap after raining.
    example:-
        input : [0,1,0,2,1,0,1,3,2,1,2,1]
        output : 6
        
    '''

    leftMax = [0]*len(arr)
    rightMax = [0]*len(arr)
    lMax = arr[0]
    rMax = arr[len(arr)-1]


    for i in range(len(arr)):
        
        lMax = max(lMax,arr[i])
        leftMax[i] = max(lMax,arr[i])

        rMax = max(rMax,arr[len(arr)-i-1])
        rightMax[len(arr)-i-1] = max(rMax,arr[len(arr)-i-1]) 
    ans = 0
    for i in range(len(arr)):
        ans+=min(rightMax[i],leftMax[i])-arr[i]
    return ans

def main():
    # arr = [0,1,0,2,1,0,1,3,2,1,2,1]
    arr = [4,2,0,3,2,5]
    res = trappedWater(arr)
    print(res)
main()