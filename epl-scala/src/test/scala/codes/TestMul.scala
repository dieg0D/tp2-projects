package codes

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestMul extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Mul expression"

  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _
  var literal300: Size.Literal = _
  var literal400: Size.Literal = _
  var literal500: Height.Literal = _
  var literal600: Height.Literal = _

  before {
    literal100 = new Core.Literal(100) with Eval.Literal 
    literal200 = new Core.Literal(200) with Eval.Literal
    literal300 = new Core.Literal(300) with Size.Literal
    literal400 = new Core.Literal(400) with Size.Literal
    literal500 = new Core.Literal(500) with Height.Literal
    literal600 = new Core.Literal(600) with Height.Literal 
  }

  it should "return String (100 * 200) when we call Mul(Literal(100), Literal(200).print())" in {
    val mul = new MulEval.Mul(literal100, literal200)
  
    mul.print() should be ("(100 * 200)")
  }

  it should "return 20000 when we call call Mul(Literal(100), Literal(200)).eval()" in {
    val mul = new MulEval.Mul(literal100, literal200)

    mul.eval() should be (20000)
  }

  it should "return 3 when we call call Mul(Literal(300), Literal(400)).size()" in {
    val mul = new MulSize.Mul(literal300, literal400)

    mul.size() should be (3)
  }

  it should "return 2 when we call call Mul(Literal(500), Literal(600)).height()" in {
    val mul = new MulHeight.Mul(literal500, literal600)

    mul.height() should be (2)
  }
}
