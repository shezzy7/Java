public class t_interfaces{
    public static void main(String args[]){
        Queen q = new Queen();
        q.move();
    }
} 

//Interface is ablueprint of a class.With its help we implent multiple inheritance in java.In interface all methods are public,abstract and without implementation.Interfaces are used to achieve totals abstraction.Variables in the interface are final,static and public.
//Syntax ->     interface interfaceName{//body}
interface ChessPlayer{
    void move();
    //in iterfaces we can not implement any method we just declare it so it is the reason why interfaces provide 100% abstraction 
}
//To derived classes from an interface we replace 'extends' keyword with 'implements'

class Queen implements ChessPlayer{
    //here we implement the function but we have to make it public as it will be setted as dafault types by default but as all the methods of interfaces should be public so we have to make it public 
    public void move(){
        System.out.println("right,left,up,down,diagonal (in 4 direction)");
    }
    
}
class King implements ChessPlayer{
    public void move(){
        System.out.println("right,left,up,down,diagonal (in 1 direction)");
    }
    
}
class  implements ChessPlayer{
    public void move(){
        System.out.println("right,left,up,down,diagonal (in 1 direction)");
    }
    
}
class Rook implements ChessPlayer{
    public void move(){
        System.out.println("right,left,up,down");
    }
    
}