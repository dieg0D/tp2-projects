package codes

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class TestSubUnit extends FlatSpec with Matchers  {

  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _

  literal100 = new Core.Literal(100) with Eval.Literal
  literal200 = new Core.Literal(200) with Eval.Literal

  val sub = new SubEval.Sub(literal100, literal200)

  var teste = "(100 - 200)"
  var test2 = -100

  if(sub.print() == teste){
    print("\n====>> Teste unitario SUB print:  (100 - 200) e igual a " + sub.print() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario SUB print:  (100 - 200) e diferente de " + sub.print() + " ==> ")
    println("O teste falhou!!\n\n")
  }
  
  if(sub.eval() == test2){
    print("\n====>> Teste unitario SUB: " + sub.print() + " e igual a " + sub.eval() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario SUB: " + sub.print() + " e igual a " + sub.eval() + " mas deveria ser (100 - 200) == -100" + " ==> ")
    println("O teste falhou!!\n\n")
  }
}
