package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestMul extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Mul expression"

  var literal100: Literal = _
  var literal200: Literal = _

  before {
    literal100 = new Literal(100) 
    literal200 = new Literal(200) 
  }

  it should "return String (100 * 200) when we call Mul(Literal(100), Literal(200).print())" in {
    val mul = new Mul(literal100, literal200)
  
    mul.print() should be ("(100 * 200)")
  }

  it should "return 20000 when we call Mul(Literal(100), Literal(200)).eval()" in {
    val eval = new Eval()
    val mul = new Mul(literal100, literal200)

    mul.accept(eval)

    eval.result() should be (20000)
  }

  it should "return 3(size expression) when we call Mul(Literal(100), Literal(200)).size()" in {
    val size = new SizeExpression()
    val mul = new Mul(literal100, literal200)

    mul.accept(size)

    size.result() should be (3)
  }

  it should "return 2(height expression) when we call Mul(Literal(100), Literal(200)).height()" in {
    val height = new Height()
    val mul = new Mul(literal100, literal200)

    mul.accept(height)

    height.result() should be (2)
  }
}
