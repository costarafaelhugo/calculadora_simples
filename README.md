# calculadora_simples

Deve conter um layout com números, os símbolos (+, -, /, x, = e CE para limpar entrada) e um display que mostra o resultado.
O “display” deve mostrar apenas o valor/resultado atual.
Deve realizar as operações sequencialmente(1 + 1 x 2 = 4 -> primeira operação que foi pressionada foi +, logo temos o resultado que é 2, depois temos uma operação de multiplicação por 2, que o resultado é 4) .
Layout não precisa ser muito elaborado.
Caso a considerar: 
Ao iniciar a aplicação, o display do resultado deve ser 0.
No início, ao pressionar um número e logo depois pressionar qualquer operação menos o CE, esse número será correspondente ao seu resultado, ou seja, ele deve ser mostrado no display.
Caso ocorra essa sequência de ações - número, operação, número e operação - o cálculo da primeira operação deverá ser o resultado mostrado no display.
Nos casos de divisão, não precisa ter números decimais. Caso faça uma divisão 5 / 2 o resultado deverá ser 2.
Quando começar a digitar um número, o display de resultado deve mostrar o número atual que está sendo digitado

Requisitos Avançados (Desafio):
Sempre que houver caso onde pressione múltiplas operações seguidas, considerar apenas a última operação.
Coloque a vírgula para as casas decimais e trate os cenários dela:
Caso pressione a vírgula sem digitar nenhum número deverá resultar em “0,”.
Trate os casos onde você clica múltiplas vezes na vírgula sequencialmente e intercalado com os números. Não deve ser colocado múltiplas vírgulas no número.
Mostre o divisor de milhar, milhão, bilhão, trilhão (ponto)
Coloque os operadores “(“ e “)”, para realizar funcionalidades mais complexas. Lembre que na matemática esses operadores servem para dar prioridade para a operação que ocorre dentro dos parênteses.

