package codes

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class TestAddUnit extends FlatSpec with Matchers  {

  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _

  literal100 = new Core.Literal(100) with Eval.Literal
  literal200 = new Core.Literal(200) with Eval.Literal

  val add = new AddEval.Add(literal100, literal200)

  var teste = "(100 + 200)"
  var test2 = 300

  if(add.print() == teste){
    print("\n====>> Teste unitario ADD print:  (100 + 200) e igual a " + add.print() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario ADD print:  (100 + 200) e diferente de " + add.print() + " ==> ")
    println("O teste falhou!!\n\n")
  }
  
  if(add.eval() == test2){
    print("\n====>> Teste unitario ADD: " + add.print() + " e igual a " + add.eval() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario ADD: " + add.print() + " e igual a " + add.eval() + " mas deveria ser (100 + 200) = 300" + " ==> ")
    println("O teste falhou!!\n\n")
  }
}
