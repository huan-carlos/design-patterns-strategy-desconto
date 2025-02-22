## Cálculo de Descontos

Considere que temos um sistema de vendas onde diferentes formas de desconto podem ser implementadas de acordo com as promoções vigentes, como em datas comemorativas. O sistema deve permitir o cálculo do desconto sobre a venda das seguintes maneiras:

- percentual de desconto definido (que pode vir de um banco de dados);
- percentual de desconto progressivo: `valor da compra/25`, não podendo ultrapassar 20% (este são apenas valores arbitrários de exemplo);
- desconto de 15% na data de aniversário do cliente.

O usuário é quem escolhe o tipo de desconto a ser aplicado, não o programa.
O programa deve apenas permitir que seja mudado o algoritmo de cálculo do desconto.

## Responda

1. Qual padrão de projeto pode ser utilizado no desenvolvimento de uma solução? R = Usando o padrão strategy.
2. Como poderíamos implementar estes tipos de desconto sem utilizar Padrões de Projetos? R = Utilizando IFs ou Switch
3. Quais os problemas que tal implementação traria? R = Duplicidade de código, ilegibilidade e dificil mantenabilidade (depurar esse código seria terrível).
4. Implemente o projeto e envie o link para repositório no GitHub, onde o README deve conter as respostas.