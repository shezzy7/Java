public class arrayArgument {
    //as we know there are two types of fuction calling call by value and call by refrence 
    //arays are always passed through call by reference method mean any change in
    //array in the function will also make changes in original array in main function
        public static void arrayFunc(int arr[]){//when receive an array as aparameter 
                                                //then we use its dataType,anyName and also square
                                                //brackets for showing that it's a array
            for(int i=0;i<arr.length;i++){
                arr[i]+=2;//incrementing every elemnt of array by 2 
            }
        }  
        public static void main(String args[]){
            int arr[]={2,6,8,9};
            System.out.print("Array before\n");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            arrayFunc(arr);//when we pass an array to a function as an argument 
                            //then we pass just its name 
            //now if we print our array then it's each element will be increentd by two
            System.out.print("Elements after\n");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        } 
}
