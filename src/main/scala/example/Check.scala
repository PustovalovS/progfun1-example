package example

object Check {
  def main(args: Array[String]): Unit = {
    val id :String = ""
    val productPrice : Seq[(String, Double)] = Seq[(String, Double)]("Iphone" -> 1.1, "Samsung" -> 2.0, "Xiaomi" -> 3.3, "Honor" -> 4.0)
    calculate(productPrice).foreach(x => {
      println(x)
    })
  }

  def calculate(productPrice : Seq[(String, Double)]): Seq[String] = {
    val seqString = productPrice.filter(x => x._2 % 1 == 0)
    seqString.map(x => x._1)
  }
}
