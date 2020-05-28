import scala.io.StdIn.readInt

object Fahern extends App{

def iseven(x:Int):Boolean=
 x%2 match{
 case 0 => true
 case _ => false
 }

printf("Enter a positive integer:");
var num:Int=scala.io.StdIn.readInt();
var n:Boolean=iseven(num);

println(n);

}




