import math

def generate_combinations(arr,k):
    result=[]

    def backtrack(start,path):
        if len(path)==k:
            result.append(path[:])
            return
        for i in range(start,len(arr)):
            path.append(arr[i])
            backtrack(i+1,path)
            path.pop()

    backtrack(0,[])
    return result

def floyd_warshall(n,graph):
    dist=[[math.inf]*n for _ in range(n)]
    for i in range(n):
        dist[i][i]=0
    for u in range(n):
        for v,w in graph[u]:
            dist[u][v]=min(dist[u][v],w)
            dist[v][u]=min(dist[v][u],w)
    for k in range(n):
        for i in range(n):
            for j in range(n):
                if dist[i][j]>dist[i][k]+dist[k][j]:
                    dist[i][j]=dist[i][k]+dist[k][j]
    return dist

def is_possible(D,centers,dist,n):
    for town in range(n):
        covered=False
        for c in centers:
            if dist[town][c]<=D:
                covered=True
                break
        if not covered:
            return False
    return True

def main():
    n,m,k=map(int,input().split())
    graph=[[] for i in range(n)]

    for i in range(m):
        u,v,w=map(int,input().split())
        graph[u].append((v,w))
        graph[v].append((u,w))

    dist=floyd_warshall(n,graph)

    low=0
    high=max(max(row) for row in dist if max(row)<math.inf)
    answer=high

    towns=list(range(n))
    all_combinations=generate_combinations(towns,k)

    while low<=high:
        mid=(low+high)//2
        found=False

        for centers in all_combinations:
            if is_possible(mid,centers,dist,n):
                found=True
                break

        if found:
            answer=mid
            high=mid-1
        else:
            low=mid+1
    print(answer)

main()
