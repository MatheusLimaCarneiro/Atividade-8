package exercicio3;

public class Finonacci {
    public static void main(String[] args) {
        int num = 0;
        int numtemp = 1;
        int fibonacci;

        for(int i = 0; i < 10 ; i++){
            System.out.println(num);
            fibonacci = num + numtemp;
            num = numtemp;
            numtemp = fibonacci;
        }
    }
}
