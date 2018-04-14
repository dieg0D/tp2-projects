package codes

package object SubSize {
  class Sub(l: Size.Expression, r: Size.Expression) extends Sub.GSub with Size.Expression {
    type T = Size.Expression
    lhs = l
    rhs = r

    override def size(): Int = (lhs.size() + rhs.size())+1
  }
}
