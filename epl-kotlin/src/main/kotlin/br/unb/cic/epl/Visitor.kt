package br.unb.cic.epl

interface Visitor {
    fun visit(exp: Literal)
    fun visit(exp: Add)
    fun visit(exp : Sub)
    fun visit(exp : Mult)
}