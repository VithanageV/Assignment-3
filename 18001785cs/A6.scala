import scala.io.StdIn.readInt

object Fahern extends App{

def fibonacci(n:Int):Int= n match{
case x if x==0 => 0
case x if x==1 => 1
case x => fibonacci(n-1)+fibonacci(n-2)
}

printf("Enter a positive integer:");
var num:Int=scala.io.StdIn.readInt();
var fib:Int=fibonacci(num);

println(fib);

}


