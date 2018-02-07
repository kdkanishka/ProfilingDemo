package com.kani.examlpe

class Main {
  var b1 = true

  def m1(): Unit = {
    if (b1){
      b1
    }
  }

  def m2(): Unit = {
    b1 match {
      case true => b1
    }
  }
}
