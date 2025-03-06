def convertToString(n):
    # We are given a number and we have to convert this number to a string like if we have 2019 in input then convert it to "two zero one nine"

    if n==0:
        return ""
    x = n%10
    n//=10
    res = convertToString(n)
    arr = ["zero","one","two","three","four","five","six","seven","eight","nine"]
    res+=arr[x]+" "
    return res
n = input("Enter a number : ")
res=convertToString(2029).strip()
print(res)
            
        