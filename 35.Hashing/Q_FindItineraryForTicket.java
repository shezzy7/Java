import java.util.*;
public class Q_FindItineraryForTicket{
    public static String findStart(HashMap<String,String> tickets){
        //lets store reverse of this tickets map into another hashmap and then compare keys of these both maps .There will be a key in map1 which will not be present in map2 bcz map2 will have ending points and map1 keys contains starting values.So there will be point to which we cannot go from other points but we take start from there
        HashMap<String,String> reverseTickets = new HashMap<>();
        for(String key : tickets.keySet()){
            reverseTickets.put(tickets.get(key),key);
        }
        //now compare keys of both maps and find a value that is present only in map1
        for(String key : tickets.keySet()){
            if(!reverseTickets.containsKey(key)){
                return key;
            }
        }
        return null;//edge case
    }
    public static void main(String args[]){
        //We are going on a long which includes travel to different cities of a country.For this journey we have airline tickets to travel from city to other and from there to other one.But the problem is that there maybe some city from where to go ahead we don't have any ticket (for example we have tickets from
        //     Lahore -> Multan
        //     Quetta -> Islamabad
        //     Karachi -> Lahore
        //     Islamabad -> Karachi
        // now here we see if first we travel from Lahore to Multan then cannot go anywhere from multan bcz we don't have ticket from to anyother city.And if we start from Karachi to Lahore then from Lahore we only have tickets of Multan and from Multan we cannot go ahead.And if we make a start from Islamabad then from Islamabd we can go to Karachi,from karachi we can go to Lahore and from Lahore we acn go to Multan and from Multan we cannot go anywhere any we will miss our tour to Quetta. But if we travle from Quetta then from there we can go to Islamabad,Islamabd to Karachi,Karachi to Lahore and from Lahore we can to Multan and this way we can  make our tour successsfull.
        //  )
        //To overcome this problem first of all we will find place from where we can travel but cannot go there from any city.Like here Quetta.

        String tour[][] = {{"Lahore","Multan"},{"Quetta","Islamabad"},{"Karachi","Lahore"},{"Islamabad","Karachi"}};
        //lets put all the data into a map

        HashMap<String,String> tickets = new HashMap<>();
        for(int i=0;i<tour.length;i++){
            for(int j=0;j<tour[0].length;j++){
                tickets.put(tour[i][j++],tour[i][j]);
            }
        }
        //now lets find a point from where can only start but cannot return to that point
        String sPoint = findStart(tickets);
        //now lets print our Tour direction as we have found our starting point
        System.out.print(sPoint);
        for(String key : tickets.keySet()){
            System.out.print("->"+tickets.get(sPoint));
            sPoint = tickets.get(sPoint);
        } 
    }
}