package com.tv

object SingleTonE {
  def print(){
    println("SingleTonE");
  }
}

object MainObject {

  def main(args:Array[String]){
    SingleTonE.print()
  }
}