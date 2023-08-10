object HelloWorld {
  def main(args: Array[String]): Unit = {
    for(a: Int <- 1 to 1000; b: Int <- 1 to 1000; c: Int <- 1 to 1000 if (a * a == b * b + c * c)){
      println("a = " + a + " b = " + b + " c = " + c)
    }
  }
}
