package example

import org.junit._
import Check._

class CheckSuite {

  @Test
  def productNamesWithoutKopecks() : Unit = {
    val temp : Seq[(String, Double)] = Seq[(String, Double)]("Iphone" -> 1.1, "Honor" -> 4.0)
    val test = calculate(temp)
    assert(test.head == "Honor")
  }
}
