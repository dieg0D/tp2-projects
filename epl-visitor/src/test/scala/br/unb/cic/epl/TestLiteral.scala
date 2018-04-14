package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestLiteral extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "A Literal"

  var literal100: Literal = _ 

  before {
    literal100 = new Literal(100)
  }

  it should "return string 100 when we call literal100.print()" in {
    literal100.print() should be ("100")
  }

  it should "return Integer 1000 when we call literal1000.eval()" in {
    val eval = new Eval()
    val literal1000 = new Literal(1000)

    literal1000.accept(eval)

    eval.result() should be (1000)
  }

  it should "return 1(size expression) when we call literal1000.size()" in {
    val size = new SizeExpression()
    val literal1000 = new Literal(1000)

    literal1000.accept(size)

    size.result() should be (1)
  }

  it should "return 1(height expression) when we call literal1000.height()" in {
    val height = new Height()
    val literal1000 = new Literal(1000)

    literal1000.accept(height)

    height.result() should be (1)
  }
}
