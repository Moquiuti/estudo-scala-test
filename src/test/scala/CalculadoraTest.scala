class CalculadoraTest extends org.scalatest.funsuite.AnyFunSuite {
  test("Test Soma") {
    assert(new Calculadora().soma(10, 10) == 20)
  }

  test("Test Subtração") {
    assert(new Calculadora().subtracao(10, 10) == 0)
  }

  test("Test Multiplicação") {
    assert(new Calculadora().multiplicacao(10, 10) == 100)
  }

  test("Test Divisão") {
    assert(new Calculadora().divisao(10, 10) == 1)
  }
}
