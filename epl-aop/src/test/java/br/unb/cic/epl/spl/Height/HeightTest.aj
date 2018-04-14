package br.unb.cic.epl.spl.Height;

public aspect HeightTest {
	public void br.unb.cic.epl.spl.Test.testHeight() {
		br.unb.cic.epl.spl.Literal lit = new br.unb.cic.epl.spl.Literal(1000);
		assertEquals(new Integer(1), lit.height());
	}
	
	public void br.unb.cic.epl.spl.Test.testAddHeight() {
		br.unb.cic.epl.spl.Exp.Add add = new br.unb.cic.epl.spl.Exp.Add(new br.unb.cic.epl.spl.Literal(2), new br.unb.cic.epl.spl.Literal(3));
		assertEquals(new Integer(2), add.height());
	}
	
	public void br.unb.cic.epl.spl.Test.testMultHeigth() {
		br.unb.cic.epl.spl.Exp.Mult mult = new br.unb.cic.epl.spl.Exp.Mult(new br.unb.cic.epl.spl.Literal(2), new br.unb.cic.epl.spl.Literal(3));
		assertEquals(new Integer(2), mult.height());
	}
	
	public void br.unb.cic.epl.spl.Test.testSubHeight() {
		br.unb.cic.epl.spl.Exp.Sub sub = new br.unb.cic.epl.spl.Exp.Sub(new br.unb.cic.epl.spl.Literal(7), new br.unb.cic.epl.spl.Literal(3));
		assertEquals(new Integer(2), sub.height());
	}
	
}
