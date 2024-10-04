import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] board=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]='-');
            }
            System.out.println();
        }

        boolean finished=false;
        while(!finished){
            xboard(board);
            displayBoard(board);
            if( isXWin(board)){
                System.out.println("Player 1 Won the game!!!");
                finished=true;
                break;
            }
            if(draw(board)){
                System.out.println("Draw match!!");
                System.exit(0);
            }
            oboard(board);
            displayBoard(board);
            if(isOWin(board)){
                System.out.println("Player 2 Won the game!!!");
                finished=true;
                break;
            }
            if(draw(board)){
                System.out.println("Draw match!!");
                System.exit(0);
            }

        }
        System.out.println("Game Over!!!");
        System.exit(0);
    }
    public static boolean isXWin(char[][] board){

            if(board[0][0]=='X' && board[0][1]=='X' && board[0][2]=='X'){
                return true;
            }
            else if(board[1][0]=='X' && board[1][1]=='X' && board[1][2]=='X'){
                return true;
            }
            else if(board[2][0]=='X' && board[2][1]=='X' && board[2][2]=='X'){
                return true;
            }
            else if(board[0][0]=='X' && board[1][0]=='X' && board[2][0]=='X'){
                return true;
            }
            else if(board[0][1]=='X' && board[1][1]=='X' && board[2][1]=='X'){
                return true;
            }
            else if(board[0][2]=='X' && board[1][2]=='X' && board[2][2]=='X'){
                return true;
            }
            else if(board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X'){
                return true;
            }
            else if(board[2][0]=='X' && board[1][1]=='X' && board[0][2]=='X'){
                return true;
            }
            else{
                return false;
            }


    }

    public static boolean isOWin(char[][] board){


            if(board[0][0]=='O' && board[0][1]=='O' && board[0][2]=='O'){
                return true;
            }
            else if(board[1][0]=='O' && board[1][1]=='O' && board[1][2]=='O'){
                return true;
            }
            else if(board[2][0]=='O' && board[2][1]=='O' && board[2][2]=='O'){
                return true;
            }
            else if(board[0][0]=='O' && board[1][0]=='O' && board[2][0]=='O'){
                return true;
            }
            else if(board[0][1]=='O' && board[1][1]=='O' && board[2][1]=='O'){
                return true;
            }
            else if(board[0][2]=='O' && board[1][2]=='O' && board[2][2]=='O'){
                return true;
            }
            else if(board[0][0]=='O' && board[1][1]=='O' && board[2][2]=='O'){
                return true;
            }
            else if(board[2][0]=='O' && board[1][1]=='O' && board[0][2]=='O'){
                return true;
            }
            else{
                return false;
            }

    }
    public static void xboard(char[][] board){

        Scanner sc=new Scanner(System.in);
        System.out.println("Player 1(Enter Row and Column): ");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        if(row1<0 || col1<0 || row1>2 || col1>2 || board[row1][col1]=='X' || board[row1][col1]=='O'){
            System.out.println("Invalid Input!");
            xboard(board);
            return;
        }
        board[row1][col1]='X';
    }
    public static void oboard(char[][] board){
        Scanner sc=new Scanner(System.in);
        System.out.println("Player 2(Enter Row and Column): ");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        if(row1<0 || col1<0 || row1>2 || col1>2 || board[row1][col1]=='X' || board[row1][col1]=='O'){
            System.out.println("Invalid Input!");
            oboard(board);
            return;
        }
        board[row1][col1]='O';
    }

    public static boolean draw(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]=='-'){
                    return false;
                }
            }
        }
        return true;
    }
    public static void displayBoard(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}