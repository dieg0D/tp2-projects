package br.unb.cic.epl

import junit.framework.TestCase


class Test(name: String?) : TestCase(name) {
    fun testLiteral() {
        val literal1000 = Literal(1000)
        assertEquals("1000", literal1000.print())
    }

    fun testAdd() {
        val add = Add(Literal(2), Literal(3))
        assertEquals("(2 + 3)", add.print())
    }

    fun testMult() {
        val mult = Mult(Literal(2), Literal(3))
        assertEquals("(2 * 3)", mult.print())
    }

    fun testSub() {
        val sub = Sub(Literal(7),Literal(3))
        assertEquals("(7 - 3)", sub.print())
    }
    fun testComplexo() {
        val comp = Sub(Add (Literal(3), Literal(3)),Mult(Literal(2), Literal(3)))
        assertEquals("((3 + 3) - (2 * 3))", comp.print())
    }
}