import java.util.HashMap;
public class B_HashMap{
    public static void main(String args[]){
        //HashMap:-In HashMap data is stored in the form of (key,value) pairs.And the most important point is that keys must be unique.Values can be same but we can't make more then one key of same name.
        //We can visualize data in HashMap like a table.For example
        //  Key     |   Value
        //  -----------------
        //   tea    |    15
        //   fries  |    35
        //   burger |    70
        //   samosa |    15

        //In HashMap function for search,insert,remove takes time compexity of O(1).HashMap don't need to travarse through all of its elements like in array to search for specific element.This remembers the data present in it.
        //For example we are sitting in a resturant and want to check the price of tea at this resturant.First method is that we see menue list and check one by one all the items to find tea and see its price.Other method is that we call the waitor and ask him the to tell the price of tea.And he will tell the price at the spot as he already knows the price of tea.So here waitor is working as hashMap.

        //For using HashMap in our code we have add library (import java.util.HashMap;) or (import java.util.*;)
        //Declaration Syntax:- HashMap<keyType,valueType> name = new HashMap<>();
        //If we want to store some countries name with their population size.Then if we want to store country name then we will use keyType as string and valueType will be int. like  ->   HashMap<String,Integr> hs = new HashMap<>();
        
        //lets create a HashMap 
        HashMap<String,Integer> someName = new HashMap<>();

      
    }
}