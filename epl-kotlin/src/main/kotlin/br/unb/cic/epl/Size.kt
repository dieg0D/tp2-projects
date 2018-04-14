package br.unb.cic.epl

class Size() : Visitor{
    var res : Int = 0
    override fun visit(exp: Literal){
        res += 1
    }
    override fun visit(exp: Add) {
        exp.lhs.accept(this)
        exp.rhs.accept(this)
        res += 1
    }
    override fun visit(exp: Sub) {
        exp.lhs.accept(this)
        exp.rhs.accept(this)
        res +=  1
    }
    override fun visit(exp: Mult) {
        exp.lhs.accept(this)
        exp.rhs.accept(this)
        res += 1
    }
    fun result() : Int {
        return res
    }
}
