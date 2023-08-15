object HelloWorld {
  def main(args: Array[String]): Unit = {
    import java.util.Locale

    val obj: AnyRef = "String Literal"
    // obj: AnyRef = "String Literal"

    obj match {
      case v:java.lang.Integer =>
        println("Integer!")
      case v:String =>
        println(v.toUpperCase(Locale.ENGLISH))
    }
  }
}
