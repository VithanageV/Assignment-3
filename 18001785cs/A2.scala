import scala.io.StdIn.readInt

object Fahern extends App{

def GCD(a:Int,b:Int):Int=b match{
case 0 => a
case x if x>a => GCD(x,a)
case x => GCD(x,a%x)
}

def prime(p:Int,n:Int=2):Boolean= n match {
case x if(x==p) => true
case x if GCD(p,x)>1 => false
case x => prime(p,x+1)
}

def primeSeq(n:Int):Unit={
if (prime(n)) println(n)
if(n>0) primeSeq(n-1)
}

printf("Enter 2 positive integers:");
var num:Int=scala.io.StdIn.readInt();
var x:Unit=primeSeq(num);

println(x);

}


