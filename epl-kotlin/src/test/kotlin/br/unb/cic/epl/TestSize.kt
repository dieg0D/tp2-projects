package br.unb.cic.epl

import junit.framework.TestCase


class TestSize(name: String?) : TestCase(name) {
    fun testLiteralSize() {
        val literal1000 = Literal(1000)
        val size = Size()
        literal1000.accept(size)
        assertEquals(Integer (1), size.result())
    }

    fun testAddSize() {
        val add = Add(Literal(2), Literal(3))
        val size = Size()
        add.accept(size)
        assertEquals(Integer (3), size.result())
    }

    fun testMultSize() {
        val mult = Mult(Literal(2), Literal(3))
        val size = Size()
        mult.accept(size)
        assertEquals(Integer (3), size.result())
    }

    fun testSubSize() {
        val sub = Sub(Literal(7), Literal(3))
        val size = Size()
        sub.accept(size)
        assertEquals(Integer (3), size.result())
    }
    fun testComplexo() {
        val comp = Sub(Add (Literal(3), Literal(3)),Mult(Literal(2), Literal(3)))
        val size = Size()
        comp.accept(size)
        assertEquals(Integer (7), size.result())
    }
}