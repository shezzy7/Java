//ArrayList are like arrays but unlike array there size is dynamic which means we can modify size of arrayList at any time when required but in case of arrays once size of an array is setted it can't be changed.
//Unlike arrays in which permitive data types like int,char,boolean etc can be stored but in array list non permitive data type are stored like Integer,Character etc.
//Arraylist is just like vectors in c++.
//For using arrayList in java we have to import a library 'import java.util.ArrayList' or 'import java.util.*'
//Syntax ->  ArrayList <dataType> listNAme = new ArrayList<>();

import java.util.ArrayList;
public class a_intro{
    public static void main(String args[]){
        //lets create an Arraylist for storing integr type data
        ArrayList <Integer> list = new ArrayList<>();
        //another arraylist for storing string type data
        ArrayList <String> list2 = new ArrayList<>();
        //for boolean data
        ArrayList <Boolean> list3 = new ArrayList<>();
    }
}