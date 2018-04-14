package br.unb.cic.epl

trait Expression {
  def print() : String
  def accept(v: Visitor): Unit
}

class Literal(val value: Int) extends Expression {
  override def print(): String = value.toString
  override def accept(v: Visitor) { v.visit(this) }
}
