# kotlin_calc

### Calculadora criada conforme desafio proposto do curso "Introdução ao Kotlin" da Digital Innovation One

Os valores a serem calculados podem ser alterados em `firstNumber` e `secondNumber`, no escopo da função principal. Os valores devem ser sucedidos pela letra `f`, evitando erros de tipagem, já que o padrão flutuante no Kotlin é o tipo `Double` e essas constantes são tipadas como `Float?`.

A expressão escolhida deve ser atribuída em `operation`, também na função principal. Os identificadores possíveis estão declarados no escopo global, acima dessa função. São eles:

  - `PLUS // Soma`
  - `MINUS // Subtração`
  - `DIV // Divisão`
  - `TIMES // Multiplicação`
  - `MOD // Resto da Divisão`

Ao ser executado, o programa verifica se os valores a serem calculados são nulos. Caso uma das condições seja verdadeira, ele indica qual número é nulo, começando pelo primeiro. Caso contrário, ele retorna o resultado da expressão, retornada pela função `calculate()`, que recebe os dois números e o identificador da expressão como parâmetros, retornando o resultado correspondente através de uma estrutura `when`
