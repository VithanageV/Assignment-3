import scala.io.StdIn.readInt

object Fahern extends App{

def sum(n:Int):Int={
if(n>1)n+sum(n-1)
else 1
}

printf("Enter a positive integer:");
var num:Int=scala.io.StdIn.readInt();
var x:Int=sum(num);


println(x);


}
