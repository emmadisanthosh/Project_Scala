package com.tv

//Nothing but interface
//If extends multiple trait use extends trait1 "WITH" trait2
//If extends one trait and one abstract class it will throws mixin error, in this case first extend abstract
//next trait

trait Trait1 {
  def print();
}

trait Trait2 {
  def display();
}

//class MultiTrait extends Trait1  {
class MultiTrait extends Trait1 with Trait2 {
  var a:Int=10;
  def print() {
    println("Trait1 Function");
  }
  def display() {
    println("Trait2 Function");
  }

}

object MultiTraitMain {
  def main(args: Array[String]) {
    //var m= new MultiTrait() with Trait2   //You can also extend trait during object creation
    var m = new MultiTrait();
    m.display();
    m.print();
    println("Private Variable Access:"+m.a)

  }

}