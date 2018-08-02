package com.tv

class CompanionClass {
  def method(){
    println("Companion E");
  }
}
object CompanionObject{
  def main(args:Array[String]){
    new CompanionClass().method();
  }
}