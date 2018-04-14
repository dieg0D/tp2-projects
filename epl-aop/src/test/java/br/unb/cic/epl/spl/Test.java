package br.unb.cic.epl.spl;

import junit.framework.TestCase;
import br.unb.cic.epl.spl.Exp.*;

public class Test extends TestCase {
	public void testLiteral() {
		Literal literal1000 = new Literal(1000);		
		assertEquals("1000", literal1000.print());
	}
	public void testAdd() {
		Add add = new Add(new Literal(2), new Literal(3));
		assertEquals("(2 + 3)", add.print());
	}
	
	public void testMult() {
		Mult mult = new Mult(new Literal(2), new Literal(3));
		assertEquals("(2 * 3)", mult.print());
	}
	
	public void testSub() {
		Sub sub = new Sub(new Literal(7), new Literal(3));
		assertEquals("(7 - 3)", sub.print());
	}
}
