//Time complexity:-It is the measurement of time in which a programm completes its execution.Basically whatever we write in our code our pc/laptop takes a time to execute this code.So this time is called time complexity.And we have to write such a code that should take minimum tike to execute.And this time is in milliseconds.Time complexity matters more when we write code for some big application.Foor example Facebook,google,instagram etc.As we see millions of people are using them at a time but it does not effect their response time.It's due to their code written in such a efficient way that it takes very low time to respond. 

//Space complexity:- It refers to amount of memory our code uses.So we have to write such an effiecient code that it should occupy minimum space in the memory.

//Order complexity Analysis :- We analyse a code on the basis of time comlexity and space complexity.If a code has less time and space complexity then it means it is a good programm else less good.
//Amount of time and space taken up by an algorithm/code as function of input.Not the actuall time taken. 


// Big O notation :- It tells the upper bound for time complexity. Mean we tell that our time complexity will not exceed this given value. If we write O(n). Then by this we mean that our code will stay in this time complexity and will not go above this time complexity in any case. It can be O(1) or O(log n) but it will never be more than O(n) eg. O(n^2) 


// for getting time complexity of an algo. First write function for this by looking at algo then apply two steps on this function. First ignore all the constants. Then pick the largest term from then it is our time complexity.
// Lets suppose our function for a specific code gives us ->  an^2 + bn + c    . Now we have to ignore all the constants and it will result into -> n^2 + n + 1  .Now we have to pick largest term which is going to be n^2 and this will be our worst case time complexity.


// Big Omega Notation :- This notaion tells us about the lower bound which mean in this notation we tell that our time complexity will not go below this point. If we write Big Omega(n) then it means that our complexity will never be (1) or logn in any case. It can go upto n^2 or more but never below. In other words it is our best case time complexity.

// Big Theta Notation :- This notaion tells us the average time complexity of any algo.



// Common time complexities we often see are ->   O(1) , O(log n ) , O(n) , O(n^2)  , O(2^n)


