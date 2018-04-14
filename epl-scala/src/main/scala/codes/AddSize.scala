package codes

package object AddSize {
  class Add(l: Size.Expression, r: Size.Expression) extends Add.GAdd with Size.Expression {
    type T = Size.Expression
    lhs = l
    rhs = r

    override def size(): Int = (lhs.size() + rhs.size())+1
  }
}
