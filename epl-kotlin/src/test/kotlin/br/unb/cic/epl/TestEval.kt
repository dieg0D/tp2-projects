package br.unb.cic.epl

import junit.framework.TestCase


class TestEval(name: String?) : TestCase(name) {
    fun testLiteralEval() {
        val literal1000 = Literal(1000)
        val eval = Eval()
        literal1000.accept(eval)
        assertEquals(Integer (1000), eval.result())
    }

    fun testAddEval() {
        val add = Add(Literal(2), Literal(3))
        val eval = Eval()
        add.accept(eval)
        assertEquals(Integer (5), eval.result())
    }

    fun testMultEval() {
        val mult = Mult(Literal(2), Literal(3))
        val eval = Eval()
        mult.accept(eval)
        assertEquals(Integer (6), eval.result())
    }

    fun testSubEval() {
        val sub = Sub(Literal(7), Literal(3))
        val eval = Eval()
        sub.accept(eval)
        assertEquals(Integer (4), eval.result())
    }
    fun testComplexo() {
        val comp = Sub(Add (Literal(6), Literal(3)),Mult(Literal(2), Literal(3)))
        val eval = Eval()
        comp.accept(eval)
        assertEquals(Integer (3), eval.result())
    }
}