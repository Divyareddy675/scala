// Databricks notebook source
// val , var
val variable1: String = "hello world!"

// COMMAND ----------

var variable1_var : String = "hello worlld 2"
variable1_var 


// COMMAND ----------

var value1 = "hello"

// COMMAND ----------

val variable1 = "hi"
variable1 = "hi" + "world!"

// COMMAND ----------

var value2 = "hello"
value2 = "hello" + "world!"

// COMMAND ----------

val var_byte : Byte = 126
val val_int : Int = 2

print("hello")

// COMMAND ----------

print(f"hello, $val_int")

// COMMAND ----------

// switch statement
var n: Int = 3
n match{
  case 1 => print("1")
  case 2 => print("2")
  case 3 => print("holla found value 3")
  case _ => print("not found")
}

// COMMAND ----------

var a = 2
if(a==2){
println("value 2")
}
else{
  print("no value")
}

// COMMAND ----------

for (i <- 1 to 4){
  println(i)
}

// COMMAND ----------

var wh = 4
while(wh >= 1)
{
  println(f"wh, $wh")
  wh= wh-1
}

// COMMAND ----------

/*function def <name>(argument : <Type>) Return datatype Int : {
 
 commands
}
*/
def squareInt(x: Int): Int = {
  // squaring the given value
  x * x
}
//calling a function
squareInt(2)

// COMMAND ----------

def nodivisorFloat(x: Float,y: Float): Float = {
  x % y
}
nodivisorFloat(7,6)

// COMMAND ----------


val tup = ("hello","goyal",4)
tup._1


  

// COMMAND ----------

var list1 = List("tushar","goyal")
list1.head

// COMMAND ----------

var dict = 1 -> "hello"
dict._1

// COMMAND ----------

var list1 = List(1,2)
var list2 = List(3,4)
list1 ++ list2

// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.filter( (x:Int) => x!=3 )

// COMMAND ----------

var liststring = List("hi","hello")
liststring.map( (x:String) => x.length )


// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.reduce( (x:Int, y:Int) => x+y )
newlist(2)


// COMMAND ----------

var list6 = List("hi","tushar","class","is","boring")
list6(0).map( (x:String) => (x,1) )


// COMMAND ----------

var list7 = List(1,2,3,4)
list7.map( (x:Int) => (x,2) )

// COMMAND ----------

var ss : Byte = 47
ss.toChar

// COMMAND ----------


