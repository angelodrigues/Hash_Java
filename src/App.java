import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        Campo[][] velha = new Campo[3][3];

        char[] sequence = {'x', 'o'};
        char result = sequence[random.nextInt(sequence.length)]; 
        Boolean game = true;
        String win = "";
    
        while(game){
            drawGame(velha);
            win = checkWin(velha);
            if(!win.equals("")) {
                System.out.printf("Jogador %s venceu%n", win);
                break;
            }
            try{
                if(checkPlay(velha, play(sc, res)), result){
                    if(result == 'x'){
                        result = 'o';
                    }else{
                        result = 'x';
                    }
                }

            }catch(Exception e){
                System.out.println("Erro");
            }
        }
        System.out.println("Fim do Jogo");

        sc.close(); 
    }

    public static void drawGame(Campo[][] velha){
        cleanScreen();
        System.out.println("         0    1    2");
        System.out.printf("0   %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("        ----------------");
        System.out.printf("0   %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("        ----------------");
        System.out.printf("0   %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
        
    }

    public static void cleanScreen(){
        for(int i = 0; i < 200 ; i++){
            System.out.println("");
        }
    }

    public static int[] play(Scanner sc, char res){
        int[] p = new int [2];
        System.out.printf("%s %c%n", "Quem Joga: ", res);
        System.out.println("Informe a linha: ");
        p[0] = sc.nextInt();
        System.out.println("Informe a coluna: ");
        p[1] = sc.nextInt();
        return p;
    }   

    public void Boolean checkPlay(Campos[][] velha, int p[], char result){
        if(velha[p[0]][p[1]].getSimbolo() == ' '){
            velha[p[0]][p[1]].setSimbolo(result);
            return true;
        }else{
            return false;
        }
    }

    public static String checkWin(Campo[][] velha){
        return "";
    }
}
