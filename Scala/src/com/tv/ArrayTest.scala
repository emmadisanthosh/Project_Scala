package com.tv

class ArrayTest {
  val array=Array(3,5,1,99,4);
  def show(){
    for(a<-array)
      println(a)
  }
   array.foreach((element:Int)=>println(element))       // Iterating by using foreach loop  

}
object mainex{
  def main(args:Array[String]){
    val at= new ArrayTest();
    at.show();
  }
}