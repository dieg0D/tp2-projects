package codes

import scala.math.max

package object AddHeight {
  class Add(l: Height.Expression, r: Height.Expression) extends Add.GAdd with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def height(): Int = max(lhs.height(),rhs.height())+1
  }
}
