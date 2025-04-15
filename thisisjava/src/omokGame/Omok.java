package omokGame;

import java.util.Scanner;

public class Omok {
	   private static Scanner scanner = new Scanner(System.in);
	   private static int usernum1;
	   private static int usernum2;
	   private static int comnum1;
	   private static int comnum2;
	   private static boolean run = true;
	   
	   private static Board board = new Board(19);
	   
	    public static void main(String[] args) {
	      
	        Player user = new Player("사용자", "O");
	        Player computer = new Player("컴퓨터", "X");
	        //Board board = new Board(19);
	        play(board, user, computer);
	        int count = 1;
	        
	        
	        //boolean run = true;
	        while(run) {
	           
	           if (count % 2 == 1) {
	                System.out.println("\n사용자 차례입니다");
	              //사용자 돌 받아오기
	               System.out.println();
	               System.out.print(user.name+"> ");
	               char ch = scanner.next().charAt(0);
	               usernum1 = (int)ch-64;
	               usernum2 = scanner.nextInt();
	        
	               playuser(board, user, computer);
	              
	           }

	            else {
	                System.out.println("\n컴퓨터 차례입니다");
	                 //컴퓨터 돌 받아오기
	                 System.out.println();
	                 System.out.print(computer.name+"> ");
	                 char ch = scanner.next().charAt(0);
	                 comnum1 = (int)ch-64;
	                 comnum2 = scanner.nextInt();
	                 playcom(board, user, computer);

	               
	            }
	           count++;
	               
	        }

	    }
	    private static void play(Board board, Player user, Player computer) {
	        board.print();
	    }
	    
	    private static void playuser(Board board, Player user, Player computer) {
	        board.usermap(usernum1, usernum2, user);
	        win();
	    }
	    
	    
	    private static void playcom(Board board, Player user, Player computer) {
	        board.computermap(comnum1,comnum2,computer);
	        win();
	    }
	    

	   public static void win(){
	      //방향 검사를 위한 2차원 배열
	      //가로, 세로, 대각선, 대각선(반대)
	      int [][] d = {{0,1}, {1,0}, {1,1}, {-1,1}};
	      // 모든 칸에 대해 오목 완성 찾기      
	      for (int row = 0; row < 19; row++) {
	         for (int cal = 0; cal < 19; cal++) {
	            if (board.map[row][cal] == "O" || board.map[row][cal] == "X") {
	               //현재위치(row, cal)에서 4가지 방향 중 하나 선택
	               for (int k = 0; k < 4; k++) {
	                  int ax = row; // x좌표
	                  int ay = cal; // y좌표
	                  int cnt = 1; // 같은 돌이 몇개 이어져 있는지 셈
	                  
	                  // 한 방향으로 증가하는 방향 탐색
	                  while (true) {
	                     ax += d[k][0];
	                     ay += d[k][1];
	                     if ( 0 <= ax && ax < 19 && 0 <= ay && ay < 19) {
	                        if(board.map[row][cal] == board.map[ax][ay])cnt ++;
	                        else {
	                           break;
	                        }
	                     } else break;
	                  }
	                  // 증가하는 방향의 반대방향 탐색
	                  ax = row;
	                  ay = cal;
	                  
	                  while( true) {
	                     ax -= d[k][0];
	                     ay -= d[k][1];
	                     if ( 0 <= ax && ax < 19 && 0 <= ay && ay < 19) {
	                        if(board.map[row][cal] == board.map[ax][ay])cnt ++;
	                        else break;
	   
	                     } else break;
	                  }
	                  
	                  // 같은 오목눈이 5개라면
	                  if (cnt == 5) {
	                     System.out.println("오목 게임 종료");
	                     run = false;
	                     
	                  }
	               }
	               
	            }
	         }
	      }
	   
	   }
	    
	 
	}



