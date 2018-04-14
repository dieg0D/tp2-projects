package codes

package object MulSize {
  class Mul(l: Size.Expression, r: Size.Expression) extends Mul.GMul with Size.Expression {
    type T = Size.Expression
    lhs = l
    rhs = r

    override def size(): Int = (lhs.size() + rhs.size())+1
  }
}
