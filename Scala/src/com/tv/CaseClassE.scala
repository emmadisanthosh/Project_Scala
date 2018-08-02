package com.tv

case class CaseClassExample(a:Int,b:Int)

object CaseMain {
  
  def main(args:Array[String]){
    var result=CaseClassExample(10,4);
    println("result"+result.a);
    println("result"+result.b);
  }
}