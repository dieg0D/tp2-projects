package br.unb.cic.epl

import kotlin.math.max

class Height : Visitor{
    var res : Int = 0
    var l : Int = 0
    var r : Int = 0
    override fun visit(exp: Literal){
        res += 1
    }
    override fun visit(exp: Add) {
        l = 0
        r = 0
        exp.lhs.accept(this)
        l += 1
        exp.rhs.accept(this)
        r += 1
        res = max(l,r)+1
    }
    override fun visit(exp: Sub) {
        l = 0
        r = 0
        exp.lhs.accept(this)
        l += 1
        exp.rhs.accept(this)
        r += 1
        res = max(l,r)+1
    }
    override fun visit(exp: Mult) {
        l = 0
        r = 0
        exp.lhs.accept(this)
        l += 1
        exp.rhs.accept(this)
        r += 1
        res = max(l,r)+1
    }
    fun result() : Int {
        return res
    }
}