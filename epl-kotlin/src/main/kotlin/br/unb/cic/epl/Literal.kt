package br.unb.cic.epl

class Literal(val value: Int) : Expression {
    override fun print(): String = value.toString()
    override fun accept(v: Visitor) {
        v.visit(this)
    }
}