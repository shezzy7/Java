import java.util.*;
public class g_firstNonRepeatingLetter{
    public static String fNonRepeatingLetter(String str){
        //lets do this by using a an auxilary array which will count freq of each letter and a queue
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;//inc freq of cur letter by one
            q.add(ch);//add cur leeter to queue
            if(freq[q.peek()-'a']<=1){//check if freq of first letter present in queue is 1 or more then one.If one then it means that it is first non-repeating character and we will add it to result
                res.append(q.peek());
            }
            else{//if count of first letter at front of queue was greater then 1, then it means that it is not first non-repeating letter till now and we will remove it from queue and we'll continue on checking on all the elements present in queue and if we found any element whose freq is less then 1 we will add it to result as we will go on removing elements until we remove all the elements.If at last our queue becomes epmty then it means that all the letters we repeated so we will ada -1 to result
                while(!q.isEmpty() && freq[q.peek()-'a']>1){
                    q.remove();
                }
                if(q.isEmpty()){
                    res.append("-1");
                }
                else{
                    res.append(q.peek());
                }
            }
        }
        return res.toString();
    }
    public static void main(String args[]){
        //Given Question asked in coding interview of 'flipkart'

        //Question:-First non repeating letter in a stream of characters.
        //We are given a string in this we to have to travers over this string and we have to track non-repeating chracter after each letter has traversed.For example we are given a string 'aabccxb'.In this string first we will go on on 'a' this is our first string now we will see that in this string which letter is first not repeating ,as here 'a' is only the one leeter so we will add to result.Now w'll move one index ahead in our given string.Now our string will become "aa"  as there is no non repeating character in this string we will add -1 to result so our resultant string will become "a-1".Now we move one index on our input string and our new string will become "aab" now in this string 'b' is the first non-repeating letter in string and we will add it to result and it will become "a-1b".As we move one index ahead on input string our new string will become "aabc".In this string both 'b' and 'c' are non-repeting letters but 'b' is the first non-repeating letter so we will add it to result which will become "a-1bb".Now again move one index ahead on input string and our new string will become "aabcc".Here 'b' is the first non-repeating character so add it to result "a-1bbb".As we move one index ahead we encounter 'x' and add it to new string "aabccx".Now in this new string both 'b' and 'x' are non-repeating characters but 'b' is the first non-repeating character so add it to result "a-1bbbb".Move index ahead and our new string will become "aabccxb".Now we see only 'x' is non-repeating character in input so we will add it to result and it will become "a-1bbbbx" as now we have traversed over our whole string so our final result is "a-1bbbbx".

        String str = "aabccxb";
        System.out.println('"'+fNonRepeatingLetter(str)+'"');
    }
}