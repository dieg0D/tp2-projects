package codes

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestLiteral extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "A Literal"

  var literal100: codes.Core.Literal = _ 

  before {
    literal100 = new Core.Literal(100)with Eval.Literal with Size.Literal with Height.Literal
  }

  it should "return string 100 when we call literal100.print()" in {
    literal100.print() should be ("100")
  }

  it should "return Integer 1000 when we call literal1000.eval()" in {
    val literal1000 = new Core.Literal(1000) with Eval.Literal
    literal1000.eval() should be (1000) 
  }

  it should "return Integer 1 when we call literal1000.size()" in {
    val literal1000 = new Core.Literal(1000) with Size.Literal 
    literal1000.size() should be (1) 
  }

  it should "return Integer 1 when we call literal1000.height()" in {
    val literal1000 = new Core.Literal(1000) with Height.Literal
    literal1000.height() should be (1) 
  }

}


    