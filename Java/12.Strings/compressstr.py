# s = "aabbbccd" #a2b3c2d
# res=''

# for i in range(len(s)): #i=4 , count=3
#     count=1
#     while i<len(s)-1 and s[i]==s[i+1]: #7
#         count+=1
#         i+=1
#     res+=s[i]
#     if count>1:
#         res+=str(count)
#     i+=1
# print(res)

s='aabbbccd'
res = ''
i = 0
for _ in range(len(s)):
    if i >= len(s):
        break
    count = 1
    while i < len(s) - 1 and s[i] == s[i + 1]:
        count += 1
        i += 1
    res += s[i]
    if count > 1:
        res += str(count)
    i += 1
print(res)