//Stack is an important data structure.We can imagine it like some plates placed over each other one by one.Plate which will be placed first will be at bottom,then secon plate will be above this first plate and so on..Now if we want to pinkup a plate then we will pick the top one plate and also if we want to place some anotherplate then we can place it on top.This is how stack works it is a linear data structure in which we can put data from one side(top) and also can get or remove data from this side(side).So from this strategy concept of LIFO comes which stands for 'Last in First Out'.As we place any element at last then it will be at top of our stack and we can only get top element of our stack at one time.
//Stack contains three operations:-
//      i- push:- it is used for pushing an element at top of stack and it works in O(1)
//      ii- pop:- it is used for removing an element from top of stack and it works in O(1).After removing it also return the value of removed element
//      iii- peek:- it is used for getting value element present at top of stack and it works in O(1).It only gives us value of element but not removes.
//      iv-isEmpty:- It is used to check whether our stack is empty or not

        //Implementation
//We can implement stack in three ways 
//  i-Using Arrays:- We can implement stack using arrays but it has drawback that arrays have fixed size and once it is full we cannot add more elements to it
//  ii-Using ArrayList:- Using ArrayList for implementing a stack is very good as it has variable size and we can add as many elements to it as many we want.
//  iii-Using LinkedList:- Using LinkedList for implementing a stack is very good as it has also variable size and we can add as many elements to it as many we want.Questions of stack with linkedlist implementation has been asked in coding interviews of companies like amazone,oyo etc.