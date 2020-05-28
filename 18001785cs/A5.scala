import scala.io.StdIn.readInt

object Fahern extends App{

def sumofeven(n:Int):Int=n match{
  case n if(n==0)=>0;
  case n if(n%2==0)=>(n-2)+sumofeven(n-2);
  case _ =>(n-1)+sumofeven(n-1);
}

printf("Enter a positive integer:");
var num:Int=scala.io.StdIn.readInt();
var add:Int=sumofeven(num);

println("the sum is"+add);
}
