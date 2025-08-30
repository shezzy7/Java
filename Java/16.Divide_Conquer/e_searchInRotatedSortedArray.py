arr = [4 , 5 , 7 , 0 ,1 , 2]
 
si = 0
ei = len(arr)-1
target = 4
while si<ei:
    mid = (si+ei)//2
    # case 1
    if target==arr[mid]:
        print(mid)
        break
    
    # compare mid with target , if target is greater than mid - check in right part
    
    # else - check in left part
    
    # first check which part is sorted
    if arr[si]<=arr[mid]: #check if left part is sorted
        
        if arr[si]<=target and target<arr[mid]: #checking if target is also present in this part
            ei = mid-1 
        
        else:
            si = mid+1
    

    else:
        if arr[mid]<target and target<=arr[ei]:
            si = mid+1
        else:
            ei = mid-1

        
            
    