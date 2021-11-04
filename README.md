# calculadora_simples

App Calculadora Super Simples

Objetivo aqui é treinar bastante a capacidade de entender e fazer as funcionalidades que está sendo pedida. Não há troca de tela para que possa focar no essencial. Perceba que aqui não usamos muito Android de fato, terá mais exercícios focado em Android.

Requisitos Simples:
Deve conter um layout com números, os símbolos (+, -, /, x, = e CE para limpar entrada) e um display que mostra o resultado.
O “display” deve mostrar duas linhas, uma contendo a expressão até agora digitada, e o outro o valor/resultado atual.
Deve realizar as operações sequencialmente(1 + 1 x 2 = 4 -> primeira operação que foi pressionada foi +, logo temos o resultado que é 2, depois temos uma operação de multiplicação por 2, que o resultado é 4). Exemplo:
1 + 1 * 2 > resultado 4
Layout não precisa ser muito elaborado.
Caso a considerar: 
Ao iniciar a aplicação, o display do resultado deve ser “” (um texto vazio).

Requisitos Avançados (Desafio):
Sempre que houver caso onde pressione múltiplas operações seguidas, considerar apenas a última operação.
Coloque a vírgula para as casas decimais e trate os cenários dela:
Caso pressione a vírgula sem digitar nenhum número deverá resultar em “0,”.
Trate os casos onde você clica múltiplas vezes na vírgula sequencialmente e intercalado com os números. Não deve ser colocado múltiplas vírgulas no número.
Mostre o divisor de milhar, milhão, bilhão, trilhão (ponto)
Coloque os operadores “(“ e “)”, para realizar funcionalidades mais complexas. Lembre que na matemática esses operadores servem para dar prioridade para a operação que ocorre dentro dos parênteses.
Colocar mais uma camada, o ViewModel para fazer as regras de negócio. Utilize LiveData e MutableLiveData quando necessário, pois não é sempre que é necessário.
Veja se consegue trocar a imagem do app para ficar com mais cara de app.
Faça tratamento de rotação do device.
Coloque mais funcionalidades iguais à calculadora científica.

