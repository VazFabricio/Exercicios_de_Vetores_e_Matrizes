import java.util.Scanner;

public class Main {
    public static void exibeProdutos(double[] arr1, double [] arr2){
        System.out.println("-----TABELA DE VENDAS-----");
        System.out.println("Preco | Quantidade | Total");
        //exibe preco
        for (int i = 0; i< arr1.length; i++) {
            System.out.println("R$"+arr1[i] + "       " + arr2[i]+ "      R$" + (arr1[i]*arr2[i]));

        }
    }
    public static void registraPreco(Scanner sc, double[] arr1, double [] arr2){
        for (int i = 0; i< arr1.length; i++){
            System.out.print("Digite o preço do produto <" + (i+1) + "> :R$ ");
            arr1[i] = sc.nextDouble();
            System.out.print("Digite a quantidade vendida desse produto <" + i+1 + ">: ");
            arr2[i] = sc.nextDouble();
        }
    }
    public static double exibeValores(double[] arr1, double[] arr2) {
        double total = 0;
        for (int i = 0; i < arr1.length; i++) {
            total += arr1[i] * arr2[i];
        }
        return total;
    }
    public static double[] maisVendido(double[] arr1) {
        double maior = arr1[0];
        double posicao;
        double[] result = new double [2];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > maior) {
                maior = arr1[i];
                result[0] = maior;
                posicao = i+1;
                result[1]= posicao;
            }

        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] arr1 = new double[10];
        double[] arr2 = new double[10];
        registraPreco(sc ,arr1, arr2);

        double [] result = maisVendido(arr1);


        exibeProdutos(arr1, arr2);
        System.out.println("---------------------------------");
        System.out.println("O total das vendas foi de : R$" + exibeValores(arr1, arr2));
        System.out.println("---------------------------------");
        System.out.println("O valor da comissão e de: R$"+(exibeValores(arr1, arr2))*0.05);
        System.out.println("---------------------------------");
        System.out.println("O produto mais vendido foi o de: R$"+ result[0]+" | E sua possicao no array e:  "+ result[1]);



    }
}