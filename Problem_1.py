

import sys
from collections import deque

def bfs(start,graph,n):
    dist=[sys.maxsize]*n
    q=deque()
    q.append(start)
    dist[start]=0
    while q:
        node=q.popleft()
        for nei,w in graph[node]:
            if dist[nei]>dist[node]+w:
                dist[nei]=dist[node]+w
                q.append(nei)
    return dist

def generate_combinations(n,k):
    result=[]
    def backtrack(start,path):
        if len(path)==k:
            result.append(path[:])
            return
        for i in range(start,n):
            path.append(i)
            backtrack(i+1,path)
            path.pop()
    backtrack(0,[])
    return result

def check(graph,n,k,maxDist):
    towns=[i for i in range(n)]
    allCombos=generate_combinations(n,k)
    for centers in allCombos:
        minDist=[sys.maxsize]*n
        for c in centers:
            dists=bfs(c,graph,n)
            for i in range(n):
                if minDist[i]>dists[i]:
                    minDist[i]=dists[i]
        if max(minDist)<=maxDist:
            return True
    return False

n,m,k=map(int,input().split())
graph=[[]for _ in range(n)]
for i in range(m):
    u,v,w=map(int,input().split())
    graph[u].append((v,w))
    graph[v].append((u,w))

low=0
high=10**9
ans=high
while low<=high:
    mid=(low+high)//2
    if check(graph,n,k,mid):
        ans=mid
        high=mid-1
    else:
        low=mid+1

print(ans)
