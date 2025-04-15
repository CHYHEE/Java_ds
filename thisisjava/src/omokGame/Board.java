package omokGame;

import java.util.Scanner;

public class Board {
    int size;
    String[][] map;
    Board(int size) {
        this.size = size;
        map = new String[size][size]; 
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                map[row][col] = ".";
            }
        }
         
    }
    
    public void print() {

        for (int row = 0; row < size; row++) {
           System.out.printf("%2d" ,row +1);
            for (int col = 0; col < size; col++) {
                System.out.print(" " + map[row][col]);
            }
            System.out.println();
        }
        System.out.printf("%4c", 65); //아스키 코드 사용해서 문자 출력 -> 65 : A
        for (int i = 66; i <= 83; i++) // A(65)부터 S(83)까지 반복
        {
           System.out.printf("%2c", i); // BCDEFGHIJKLMNOPQRS
        }

    }
    

   
   public void usermap(int usernum1, int usernum2, Player user) {
	   int row = usernum2 - 1;
	    int col = usernum1 - 1;

	    if (map[row][col].equals("O") || map[row][col].equals("X")) {
	        System.out.println("이미 바둑돌이 존재합니다.");
	        return; // 더 이상 진행하지 않고 빠져나감
	    }

	    map[row][col] = user.stone;
	   //map[usernum2-1][usernum1-1] = user.stone;
      
      for (int r = 0; r < size; r++) {
           System.out.printf("%2d" ,r +1);
            for (int c = 0; c < size; c++) {
               if(r == usernum2-1 && c == usernum1-1)
               {
                  System.out.print(" " + map[usernum2-1][usernum1-1]);

               }else {
                  System.out.print(" " + map[r][c]);
               }
            }
            System.out.println();
        }
        System.out.printf("%4c", 65); //아스키 코드 사용해서 문자 출력 -> 65 : A
        for (int i = 66; i <= 83; i++) { // A(65)부터 S(83)까지 반복
           System.out.printf("%2c", i); // BCDEFGHIJKLMNOPQRS
        }
       
   }

   
   public void computermap(int comnum1, int comnum2, Player computer) {
	   int row = comnum2 - 1;
	    int col = comnum1 - 1;

	    if (map[row][col].equals("O") || map[row][col].equals("X")) {
	        System.out.println("이미 바둑돌이 존재합니다.");
	        return;
	    }
	    
	    map[row][col] = computer.stone;
	    
      //map[comnum2-1][comnum1-1] = computer.stone;
      
      for (int r = 0; r < size; r++) {
           System.out.printf("%2d" ,r +1);
            for (int c = 0; c < size; c++) {
               if(r == comnum2-1 && c == comnum1-1)
               {
                  System.out.print(" " + map[comnum2-1][comnum1-1]);

               }else {
                  System.out.print(" " + map[r][c]);
               }
            }
            System.out.println();
        }
        System.out.printf("%4c", 65); //아스키 코드 사용해서 문자 출력 -> 65 : A
        for (int i = 66; i <= 83; i++) { // A(65)부터 S(83)까지 반복
           System.out.printf("%2c", i); // BCDEFGHIJKLMNOPQRS
        }
       
   }
   
/*
   public void win(){
      int [][] d = {{0,1}, {1,0}, {1,1}, {-1,1}};
      // 모든 칸에 대해 오목 완성 찾기      
      for (int row = 0; row < 19; row++) {
         for (int cal = 0; cal < 19; cal++) {
            if (map[row][cal] == "O" || map[row][cal] == "X") {
               for (int k = 0; k < 4; k++) {
                  int ax = row; // x좌표
                  int ay = cal; // y좌표
                  int cnt = 1; // 일치하는 바둑알의 개수
                  
                  // 증가하는 방향 탐색
                  while (true) {
                     ax += d[k][0];
                     ay += d[k][1];
                     if ( 0 <= ax && ax < 19 && 0 <= ay && ay < 19) {
                        if(map[row][cal] == map[ax][ay])cnt ++;
                        else {
                           break;
                        }
                     } else break;
                  }
                  ax = row;
                  ay = cal;
                  
                  // 증가하는 방향의 반대방향 탐색
                  while( true) {
                     ax -= d[k][0];
                     ay -= d[k][1];
                     if ( 0 <= ax && ax < 19 && 0 <= ay && ay < 19) {
                        if(map[row][cal] == map[ax][ay])cnt ++;
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
   
   //   아무도 이기지 않았을 경우
      System.out.println(0);    
   
   }*/

}
      

    

