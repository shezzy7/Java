from collections import defaultdict,deque

def min_hops(n,routes,source,dest):
    if source==dest:
        return 0

    stop_routes=defaultdict(set)
    for i,route in enumerate(routes):
        for stop in route:
            stop_routes[stop].add(i)

    vis_routes=set()
    vis_stops=set()
    q=deque()

    for i in stop_routes[source]:
        q.append((i,1))
        vis_routes.add(i)

    while q:
        idx,hop=q.popleft()
        if dest in routes[idx]:
            return hop
        for stop in routes[idx]:
            if stop in vis_stops:
                continue
            vis_stops.add(stop)
            for nei in stop_routes[stop]:
                if nei not in vis_routes:
                    vis_routes.add(nei)
                    q.append((nei,hop+1))
    return -1

n=int(input())
routes=[list(map(int,input().split())) for _ in range(n)]
s,d=map(int,input().split())
print(min_hops(n,routes,s,d))
