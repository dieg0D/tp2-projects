package codes

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class TestMulUnit extends FlatSpec with Matchers  {

  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _

  literal100 = new Core.Literal(100) with Eval.Literal
  literal200 = new Core.Literal(200) with Eval.Literal

  val mul = new MulEval.Mul(literal100, literal200)

  var teste = "(100 * 200)"
  var test2 = 20000

  if(mul.print() == teste){
    print("\n====>> Teste unitario MUL print:  (100 * 200) e igual a " + mul.print() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario MUL print:  (100 * 200) e diferente de " + mul.print() + " ==> ")
    println("O teste falhou!!\n\n")
  }
  
  if(mul.eval() == test2){
    print("\n====>> Teste unitario MUL: " + mul.print() + " e igual a " + mul.eval() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario MUL: " + mul.print() + " e igual a " + mul.eval() + " mas deveria ser (100 * 200) == 20000" + " ==> ")
    println("O teste falhou!!\n\n")
  }
}
