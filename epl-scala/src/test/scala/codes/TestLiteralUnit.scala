package codes

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class TestLiteralUnit extends FlatSpec with Matchers  {

  var literal100: codes.Core.Literal = _ 

  literal100 = new Core.Literal(100)
  val literal1000 = new Core.Literal(1000) with Eval.Literal

  var teste = "100"
  var test2 = 1000

  if(literal100.print() == teste){
    print("\n====>> Teste unitario LITERAL print:  100 e igual a " + literal100.print() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario LITERAL print:  100 e diferente de " + literal100.print() + " ==> ")
    println("O teste falhou!!\n\n")
  }
  
  if(literal1000.eval() == test2){
    print("\n====>> Teste unitario LITERAL: " + literal1000.print() + " e igual a " + literal1000.eval() + " ==> ")
    print("O teste passou com sucesso!!\n\n")
  }else{
    print("\n====>> Teste unitario LITERAL: " + literal1000.print() + " e igual a " + literal1000.eval() + " mas deveria ser 100 == 100" + " ==> ")
    println("O teste falhou!!\n\n")
  }
}