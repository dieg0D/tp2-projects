package br.unb.cic.epl

interface Expression {
    fun print(): String
    fun accept(v: Visitor)
}