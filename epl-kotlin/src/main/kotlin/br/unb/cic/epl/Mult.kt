package br.unb.cic.epl

class Mult(val lhs: Expression, val rhs: Expression) : Expression {
    override fun print() : String {
        return "(" + lhs.print() + " * " + rhs.print() + ")"
    }
    override fun accept(v: Visitor) {
        v.visit(this)
    }
}