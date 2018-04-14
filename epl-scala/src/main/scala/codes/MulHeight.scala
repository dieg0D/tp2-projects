package codes

import scala.math.max

package object MulHeight {
  class Mul(l: Height.Expression, r: Height.Expression) extends Mul.GMul with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def height(): Int = max(lhs.height(),rhs.height())+1
  }
}
