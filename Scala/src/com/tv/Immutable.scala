package com.tv


object TitleOrder  {
  
  def main(args:Array[String]){
    
    //Var Mutable Variable 
    var i=100;
    i=200;
    println("TitleOrder"+i);
    
    //Val Immutable Variable
    val j=300;
    println("TitleOrder"+j);
    
    //Simple Function calling
    val result=checkIt(-20);
    println("Result::"+result);
  }
  //New Function CheckIt
  def checkIt(a:Int)=if(a>=0) 1 else 0;
  
}