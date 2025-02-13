
def findDuplicate(arr):
    # We are given an array of integers.We have to return true if any value appears twice in the arry else false if all the values are unique.
    
    # approach 1
    # arr.sort()
    # for i in range(len(arr)-1):
    #     if arr[i]==arr[i+1]:
    #         return True
    
    # return False

    # Approach 2
    dummySet = set()
    for i in range(len(arr)):
        if arr[i] in dummySet:
            return True
        dummySet.add(arr[i])
    return False

    
def main():
    arr=[1,2,3,4]
    print(findDuplicate(arr))
main()