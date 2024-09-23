public class shortestPath{
    public static void main(String args[]){
        //given a route containing 4 directions (E,W,S,N) find the shortest path to reach destination
        String route = "WNEENESENNN";
        int x=0,y=0;
        for(int i=0;i<route.length();i++){
            int dir = route.charAt(i);
            if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
            else if(dir == 'S'){
                y--;
            }
            else{
                y++;
            }
        }
        x*=x;
        y*=y;
        System.out.println((float)Math.sqrt(x+y));
    }
}