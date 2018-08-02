package com.tv

object PatternMatch {

  def main(args: Array[String]) {
    
      var a = 4  
        a match{  
            case 1 => println("One")  
            case 2 => println("Two")  
            case _ => println("No")  
        }  
  }
  // var result=search("Two1");
   //println("Result::"+result);
  }

  /*def search(a:Any):Any = a match {
    case 1       => println("One")
    case "Two"   => println("Two")
    case "Hello" => println("Hello")
    case _       => println("No")

  }
  
 
} */