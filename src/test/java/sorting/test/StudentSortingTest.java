package sorting.test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sorting.AbstractSorting;
import sorting.variationsOfBubblesort.CombSort;
import sorting.variationsOfBubblesort.GnomeSort;

public class StudentSortingTest {

    private Integer[] vetorTamPar;
    private Integer[] vetorTamImpar;
    private Integer[] vetorVazio = {};
    private Integer[] vetorValoresRepetidos;
    private Integer[] vetorValoresIguais;

    public AbstractSorting<Integer> implementation;

    @Before
    public void setUp() {
        populaVetorTamanhoPar(new Integer[]{30, 28, 7, 29, 11, 26, 4, 22, 23,
                31});
        populaVetorTamanhoImpar(new Integer[]{6, 41, 32, 7, 26, 4, 37, 49,
                11, 18, 36});
        populaVetorRepetido(new Integer[]{4, 9, 3, 4, 0, 5, 1, 4});
        populaVetorIgual(new Integer[]{6, 6, 6, 6, 6, 6});

        getImplementation();
    }

    // // MÉTODOS AUXILIARES DA INICIALIZAÇÃO

    /**
     * Método que inicializa a implementação a ser testada com a implementação
     * do aluno
     */
    private void getImplementation() {
        this.implementation = new GnomeSort<>();
        this.implementation = new CombSort<>();
    }

    public void populaVetorTamanhoPar(Integer[] arrayPadrao) {
        this.vetorTamPar = Arrays.copyOf(arrayPadrao, arrayPadrao.length);
    }

    public void populaVetorTamanhoImpar(Integer[] arrayPadrao) {
        this.vetorTamImpar = Arrays.copyOf(arrayPadrao, arrayPadrao.length);
    }

    public void populaVetorRepetido(Integer[] arrayPadrao) {
        this.vetorValoresRepetidos = Arrays.copyOf(arrayPadrao,
                arrayPadrao.length);
    }

    public void populaVetorIgual(Integer[] arrayPadrao) {
        this.vetorValoresIguais = Arrays
                .copyOf(arrayPadrao, arrayPadrao.length);
    }

    // FIM DOS METODOS AUXILIARES DA INICIALIZAÇÃO

    // MÉTODOS DE TESTE

    public void genericTest(Integer[] array) {
        Integer[] copy1 = {};
        if (array.length > 0) {
            copy1 = Arrays.copyOf(array, array.length);
        }
        implementation.sort(array);
        Arrays.sort(copy1);
        Assert.assertArrayEquals(copy1, array);
    }

    @Test
    public void testSort01() {
        genericTest(vetorTamPar);
    }

    @Test
    public void testSort02() {
        genericTest(vetorTamImpar);
    }

    @Test
    public void testSort03() {
        genericTest(vetorVazio);
    }

    @Test
    public void testSort04() {
        genericTest(vetorValoresIguais);
    }

    @Test
    public void testSort05() {
        genericTest(vetorValoresRepetidos);
    }

    // MÉTODOS QUE OS ALUNOS PODEM CRIAR

    /**
     * O ALUNO PODE IMPLEMENTAR METODOS DE ORDENAÇÃO TESTANDO O SORT COM TRES
     * ARGUMENTOS PARA TESTAR A ORDENACAO EM UM PEDAÇO DO ARRAY. DICA: PROCUREM
     * SEGUIR A ESTRUTURA DOS MÉTODOS DE TESTE ACIMA DESCRITOS, ORDENANDO APENAS
     * UMA PARTE DO ARRAY.
     */

    @Test
    public void testSubArrayGnome() {
        AbstractSorting gnomeSort = new GnomeSort<>();

        //new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23, 31 }
        gnomeSort.sort(this.vetorTamPar, 2, 7);
        Assert.assertEquals(4, this.vetorTamPar[2], 0);
        Assert.assertEquals(29, this.vetorTamPar[7], 0);

        //new Integer[] { 6, 41, 32, 7, 26, 4, 37, 49, 11, 18, 36 }
        gnomeSort.sort(this.vetorTamImpar, 2, 4);
        Assert.assertEquals(7, this.vetorTamImpar[2], 0);
        Assert.assertEquals(32, this.vetorTamImpar[4], 0);

        //new Integer[]{6, 6, 6, 6, 6, 6}
        gnomeSort.sort(this.vetorValoresIguais, 2, 3);
        Assert.assertEquals(6, this.vetorValoresIguais[2], 0);
        Assert.assertEquals(6, this.vetorValoresIguais[3], 0);

        //new Integer[]{4, 9, 3, 4, 0, 5, 1, 4}
        gnomeSort.sort(this.vetorValoresRepetidos, 1, 6);
        Assert.assertEquals(0, this.vetorValoresRepetidos[1], 0);
        Assert.assertEquals(3, this.vetorValoresRepetidos[3], 0);
        Assert.assertEquals(9, this.vetorValoresRepetidos[6], 0);
    }

    @Test
    public void testSubArrayComb() {
        AbstractSorting combSort = new CombSort();

        //new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23, 31 }
        combSort.sort(this.vetorTamPar, 2, 7);
        Assert.assertEquals(4, this.vetorTamPar[2], 0);
        Assert.assertEquals(29, this.vetorTamPar[7], 0);

        //new Integer[] { 6, 41, 32, 7, 26, 4, 37, 49, 11, 18, 36 }
        combSort.sort(this.vetorTamImpar, 2, 4);
        Assert.assertEquals(7, this.vetorTamImpar[2], 0);
        Assert.assertEquals(32, this.vetorTamImpar[4], 0);

        //new Integer[]{6, 6, 6, 6, 6, 6}
        combSort.sort(this.vetorValoresIguais, 2, 3);
        Assert.assertEquals(6, this.vetorValoresIguais[2], 0);
        Assert.assertEquals(6, this.vetorValoresIguais[3], 0);

        //new Integer[]{4, 9, 3, 4, 0, 5, 1, 4}
        combSort.sort(this.vetorValoresRepetidos, 1, 6);
        Assert.assertEquals(0, this.vetorValoresRepetidos[1], 0);
        Assert.assertEquals(3, this.vetorValoresRepetidos[3], 0);
        Assert.assertEquals(9, this.vetorValoresRepetidos[6], 0);
    }
}