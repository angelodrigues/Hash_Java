import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Campo[][] velha = new Campo[3][3];

        char simboloAtual = 'X';
        Boolean game = true;
        String vitoria = "";
    
        while(game){
            MakeGame(velha);
        }

        sc.close(); 
    }

    public static void MakeGame(Campo[][] velha){
        //Clean
        System.out.println("         0    1    2");
        System.out.printf("0   %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("        ----------------");
        System.out.printf("0   %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("        ----------------");
        System.out.printf("0   %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
        
    }
}
