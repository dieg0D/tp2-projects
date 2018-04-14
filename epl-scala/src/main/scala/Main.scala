import codes._

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal with Size.Literal with Height.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal with Size.Literal with Height.Literal  

  println(lit100.print())
  println(lit100.eval())
  println(lit100.size())
  println(lit100.height())

  val sum = new Add.Add(lit100, lit500)
  println(sum.print())
  val sumE = new AddEval.Add(lit100,lit500)
  println(sumE.eval())
  val sumS = new AddSize.Add(lit100,lit500)
  println(sumS.size())
  val sumH = new AddHeight.Add(lit100,lit500)
  println(sumH.height())

  val sub = new Sub.Sub(lit100, lit500)
  println(sub.print())
  val subE = new SubEval.Sub(lit100,lit500)
  println(subE.eval())
  val subS = new SubSize.Sub(lit100,lit500)
  println(subS.size())
  val subH = new SubHeight.Sub(lit100,lit500)
  println(subH.height())

  val mul = new Mul.Mul(lit100, lit500)
  println(mul.print())
  val mulE = new MulEval.Mul(lit100,lit500)
  println(mulE.eval())
  val mulS = new MulSize.Mul(lit100,lit500)
  println(mulS.size())
  val mulH = new MulHeight.Mul(lit100,lit500)
  println(mulH.height())

}