
def finding_angle(angle):
    while angle<0:
        angle+=360
    while angle>=360:
        angle-=360
    return angle

def combining_intervals(intervals):
    intervals.sort()
    combined=[]
    for current in intervals:
        if len(combined)==0:
            combined.append(current)
        else:
            last=combined[-1]
            if current[0]>last[1]:
                combined.append(current)
            else:
                last[1]=max(last[1], current[1])

    return combined
import math
def centered_angle(x, y):
    angle_in_radians=math.atan2(y,x)
    angle_in_degrees =angle_in_radians*(180/math.pi)
    return angle_in_degrees

def problem4():
    n,r= input().split()
    n=int(n)
    r=float(r)
    fielders =[]
    for i in range(n):
        x, y=map(float, input().split())
        fielders.append((x, y))
    intervals=[]
    
    for x,y in fielders:
        dist=math.sqrt(x*x + y*y)
        if dist<=r:
            print("0.000000")
            return
        center_angle=centered_angle(x, y)
        spread=math.degrees(math.asin(r / dist))
        start=finding_angle(center_angle - spread)
        end =finding_angle(center_angle + spread)
        if start> end:
            intervals.append([start, 360])
            intervals.append([0, end])
        else:
            intervals.append([start, end])
    merged= combining_intervals(intervals)
    
    max_gap=0
    for i in range(len(merged)):
        curr_end=merged[i][1]
        next_start=merged[(i+1)%len(merged)][0]
        gap=(next_start-curr_end) % 360
        max_gap=max(max_gap,gap)
    
    print(f"{max_gap:.6f}")

problem4()


