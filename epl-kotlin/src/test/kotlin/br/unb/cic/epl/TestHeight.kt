package br.unb.cic.epl

import junit.framework.TestCase


class TestHeight(name: String?) : TestCase(name) {
    fun testLiteralHeight() {
        val literal1000 = Literal(1000)
        val height = Height()
        literal1000.accept(height)
        assertEquals(Integer (1), height.result())
    }

    fun testAddHeight() {
        val add = Add(Literal(2), Literal(3))
        val height = Height()
        add.accept(height)
        assertEquals(Integer (2), height.result())
    }

    fun testMultHeight() {
        val mult = Mult(Literal(2), Literal(3))
        val height = Height()
        mult.accept(height)
        assertEquals(Integer (2), height.result())
    }

    fun testSubHeight() {
        val sub = Sub(Literal(7), Literal(3))
        val height = Height()
        sub.accept(height)
        assertEquals(Integer (2), height.result())
    }
    fun testComplexo() {
        val comp = Sub(Add (Literal(3), Literal(3)),Mult(Literal(2), Literal(3)))
        val height = Height()
        comp.accept(height)
        assertEquals(Integer (3), height.result())
    }
}