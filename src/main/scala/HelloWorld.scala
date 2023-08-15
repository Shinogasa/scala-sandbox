object HelloWorld {
  def main(args: Array[String]): Unit = {
    var i: Int = 0
    while (i <= 1000) {
      val randList = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList

      randList match {
        case a :: b :: c :: d :: e :: Nil if a == e =>
          println(randList.mkString)
          i = i + 1
        case _ =>
      }
    }
//    解答例
//    for (i <- 1 to 1000) {
//      val s = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList match {
//        case List(a, b, c, d, _) => List(a, b, c, d, a).mkString
//      }
//      println(s)
//    }

  }
}
