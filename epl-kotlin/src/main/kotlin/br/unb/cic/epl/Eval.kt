package br.unb.cic.epl

class Eval() : Visitor{
    var res : Int = 0
    override fun visit(exp: Literal) {
        res = exp.value
    }
    override fun visit(exp: Add) {
        exp.lhs.accept(this)
        val vl = res
        exp.rhs.accept(this)
        val vr = res
        res = vl + vr
    }
    override fun visit(exp: Sub) {
        exp.lhs.accept(this)
        val vl = res
        exp.rhs.accept(this)
        val vr = res
        res = vl - vr
    }
    override fun visit(exp: Mult) {
        exp.lhs.accept(this)
        val vl = res
        exp.rhs.accept(this)
        val vr = res
        res = vl * vr
    }
    fun result() : Int {
        return res
    }
}
