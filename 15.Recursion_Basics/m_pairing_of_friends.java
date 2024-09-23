public class m_pairing_of_friends{
    public static int ways(int n){
       if(n==1 || n==2){
        return n;
       }
       int fnm1 = ways(n-1);
       int fnm2 = ways(n-2);
       int waysAfterPair = fnm2*(n-1);
       int totalWays = fnm1+waysAfterPair;
       return totalWays;
    }
    
    public static void main(String args[]){
        //Given n friends,each one can remain single or paired up with some other friend.Each friend can be paired only once.Find out the total nmber of ways in which friends can remain single or can be paired up.
        int n=5;
        System.out.println(ways(n));

    }
}