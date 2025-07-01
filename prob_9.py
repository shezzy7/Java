import sys

n=int(input())
tree=[[]for _ in range(n+1)]
for i in range(n-1):
    u,v=map(int,input().split())
    tree[u].append(v)
    tree[v].append(u)

dp0=[0]*(n+1)
dp1=[0]*(n+1)

def dfs(u,parent):
    for v in tree[u]:
        if v!=parent:
            dfs(v,u)
            dp0[u]+=max(dp0[v],dp1[v])
            dp1[u]+=dp0[v]

dfs(1,-1)
print(max(dp0[1],dp1[1]))
