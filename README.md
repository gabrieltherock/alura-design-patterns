# alura-design-patterns

padrão de projeto: solução comum para um problema recorrente ao utilizar programação orientada a objetos

tem os criacionais, estruturais e comportamentais

strategy: ideal para algoritmos que varias de acordo com o parâmetro. criar classes específicas para cada situação. objetivo: diminuir a complexidade do código, trocando múltiplas condicionais por classes
o strategy é indicado para quando um parâmetro já define qual estratégia será utilizada (qual implementação daquela interface X será utilizada, por exemplo)

chain of responsibility: adequado para quando há uma sequência de validações a serem feitas e a ideia é criar uma classe para cada validação/regra de negócio que chama, ou não, outras classes de validação. a implementação é fácil com o uso de classes abstratas e herança.

template method: Aplicamos o pattern Template Method com a criação de um método concreto na classe “mãe” que chama métodos abstratos implementados nas classes “filhas”

state: é utilizado quando temos uma transição de estados

observer: classes são notificadas e reagem a um determinado evento