package codes

import scala.math.max

package object SubHeight {
  class Sub(l: Height.Expression, r: Height.Expression) extends Sub.GSub with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def height(): Int = max(lhs.height(),rhs.height())+1
  }
}
