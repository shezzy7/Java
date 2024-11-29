import java.util.PriorityQueue;

public class G_nearbyCars  {
    static class Point implements Comparable<Point>{
        int idx , dist;
        public Point(int dist , int idx){
            this.idx = idx ; 
            this.dist = dist;
        }

        //As we arranging on the basis of distance , so will compare them on the basis of dist.
        @Override
        public int compareTo(Point obj){
            return this.dist-obj.dist;
        }
    }
    public static void main(String args[]){
        int pts[][] = {{3,3} , {5,-1} , {-2,4}};
        int k=2;
        //we are given N points in a 2D plane which are locations on N cars.If we are at the origin  , print the nearest car.
        //Approach :- From origin to see the nearest car we must first know the distance of all the cars from origin and which cars have less distance are near to origin.
        //Distance of a point(x,y) from origin is calculated by using formula -> sqrt(x^2 + y^2)
        //So if we calculate distance of each point from origin we can see points with minimum distance are more close.
        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i=0;i<pts.length ; i++){
            int dist = (int)Math.sqrt((pts[i][0]*pts[i][0])+(pts[i][1]*pts[i][1]));
            pq.add(new Point(dist , i));
        }

        //here we will print index of cars given in input as a result.
        for(int i=0;i<k;i++){
            System.out.println("C "+pq.remove().idx);
        }
    }
}
