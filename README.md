# Algoritmo de Ordenção por Comporação (Extra)

*Algoritmos implementados em Java 8.*

## Comb Sort

- A distancia começa por gap = tamanho/fator (fator=1.25)
- A entrada é ordenada com as trocas considerando elementos distanciados por gap
- O gap é atualizado (gap = gap/fator) até 1
- Quando gap=1 combo sort continua até o array estar todo ordenado

!["Comb Sort"](https://github.com/juliafealves/leda-ordenacao-extra/blob/master/comb_sort.png "Comb Sort")

## Gnome Sort

- Adota um elemento (pivot) que possui anterior.
- Se pivot e o proximo estao na ordem correta entao incrementa o pivot
- Se pivot e proximo nao estao na ordem correta entao troca eles e decrementa o pivot
- Se nao existe anterior ao pivot então anda para frente (ao invés de decrementar)
- Se nao tem proximo entao termina (ao invés de incrementar)

!["Gnome Sort"](https://github.com/juliafealves/leda-ordenacao-extra/blob/master/gnome_sort.png "Gnome Sort")

### Gráfico de Execução

!["Gráfico"](https://github.com/juliafealves/leda-ordenacao-extra/blob/master/chart.png "Gráfico")
