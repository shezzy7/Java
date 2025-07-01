def search(arr,target):
    # Search in rotated sorted array
    # We are given an array of integers sorted in ascending order with unique elements.After sorting array can be rotated at a partiular index.And we are given a target element.We have to find index of this element in this array and return it if target is not found then return -1.
    # We have to write an algorithm that should run with time complexity of O(log n)
    start = 0
    end = len(arr)-1
    while start<=end:
        mid = (start+end)//2
        if target==arr[mid]:
            return mid
        if arr[start]<arr[mid]:
            if target>=arr[start] and target<arr[mid]:
                end = mid-1      
            else:
                start = mid+1
        else:
            if target>arr[mid] and target<=arr[end]:
                start=mid+1    
            else:
                end=mid-1
    return -1
def main():
    arr = [4,5,6,7,0,1,2,3]
    target = 4
    print(search(arr,target))
main()