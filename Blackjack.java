package human20221123;

public class Blackjack {
   // 1.블랙잭
   // 2.전화번호부
   // 3.택트릭스

   // 블랙젝
   // 서로 원하는 만큼 카드를 받아서 카드의 합이 21에 가까운사람이 이기는 게임
   // 21이 넘어가면 패배한다.
   // jqk 는 10으로 처리한다.
   // A는 11도 되고 1도된다.

   public static void main(String[] args) {
      // c 언어 행태로 구현
      // 1. 블랙젝 구현시 재일 먼저 카드를 메모리에 올린다.
      int[] deck = new int[52];
      // 2. 0~51 까지 식별가능한 카드 생성
      for (int i = 0; i < deck.length; i++) {
         deck[i] = i;
      }

      // 3. 카드가 제대로 생성되었는지 출력해보자.
      for (int j = 0; j < deck.length; j++) {
         System.out.println(deck[j]);
      }
      // 4. 사람들에게 보여주는 형태의 카드를 출력해 보자.
      // 모양배열
      // ㅁ +한자키 특수문자표시 가능
      String[] cardShape = { "♣", "◆", "♥", "♠" };
      String[] cardNumber = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

      // 카드 모양 만드는 방법 식별자나누기 13
      // 카드 숫자 만드는 방법 식별자나머지 13
      for (int j = 0; j < deck.length; j++) {
         System.out.println(deck[j] + ":" + cardShape[deck[j] / 13] + cardNumber[deck[j] % 13]);
      }

      // 5.카드 섞기

      for (int i = 0; i < 9999; i++) {
         // int randomCard=(int)Math.random()*52;//0~51숫자생성
         int randomCard = (int) (Math.random() * 52);// 0~51숫자생성
         int cardTemp = deck[0];
         deck[0] = deck[randomCard];
         deck[randomCard] = cardTemp;
      }

      for (int j = 0; j < deck.length; j++) {
         System.out.println(deck[j] + ":" + cardShape[deck[j] / 13] + cardNumber[deck[j] % 13]);
      }
      // 6. 게임진행 간단히 구현
      // 사용한 카드와 사용할 카드 를 구분하는 인덱스
      int deckIndex = 0;
      int[] p1Deck = new int[11];// 플레이어 1의 카드 묶음 1111,2222,333 4,8,9 21
      int[] p2Deck = new int[11];// 플레이어 2의 카드 묶음
      int p1DeckIndex = 0;// 플레이어 1의 카드 개수
      int p2DeckIndex = 0;// 플레이어 2의 카드 개수

//      //7. 간단히 두플레이어가 2장의 카드를 받는 형태로 게임을 구현해 보자.
//      //p1플레이어 카드 두장 받기
//      p1Deck[p1DeckIndex++]=deck[deckIndex++];
//      //한줄더 추가할때마다 deck에서 카드 하나씩 가져오는 작업이 된다.
//      p1Deck[p1DeckIndex++]=deck[deckIndex++];
//      p1Deck[p1DeckIndex++]=deck[deckIndex++];
//      
//      //p2 플레이어 카드 두장 받기
//      p2Deck[p2DeckIndex++]=deck[deckIndex++];
//      p2Deck[p2DeckIndex++]=deck[deckIndex++];
//      p2Deck[p2DeckIndex++]=deck[deckIndex++];
//      
////      //8. 두플레이어가 가지고 있는 카드 출력하기
//      System.out.println("p1Card"); 
//      for(int i=0;i<p1DeckIndex;i++) {
//         System.out.println(p1Deck[i]+":" 
//               + cardShape[p1Deck[i]/13]+cardNumber[p1Deck[i]%13]);//0~51
//      }
//      System.out.println("p2Card"); 
//      for(int i=0;i<p2DeckIndex;i++) {
//         System.out.println(p2Deck[i]+":" 
//               + cardShape[p2Deck[i]/13]+cardNumber[p2Deck[i]%13]);//0~51
//      }

      // 11. 블랙잭 카드 받기 플레이구현
      int p1Sum = 0;// while문 안에서도 계산이 필요해서 복사해옴
      int p2Sum = 0;
      // 종료조건을 생각해보기
      // 1. 둘다 카드를 그만 받기를 원할때.
      // 2. 배열이 가득 차서 더이상 받을수 없을때.
      // 3. 둘중 1명이 21초과 이면 종료
      // 1번의 경우 boolean변수를 이용하여 확인
      boolean isP1Plag = true;
      boolean isP2Plag = true;
      while (isP1Plag || isP2Plag) {// 둘중에 한명이 카드 받는 작업을 원하면 카드 받는 작업일 계속진행함
         // 12. p1의 카드수령여부
         if (isP1Plag) {
            System.out.println("p1님 카드를 받으시겠습니까? 1. yes 2. no");
            String input = new java.util.Scanner(System.in).nextLine();
            if (input.equals("1")) {
               p1Deck[p1DeckIndex++] = deck[deckIndex++];
               if (p1Deck.length == p1DeckIndex) {
                  isP1Plag = false;
               }
            } else {
               isP1Plag = false;
            }
         }

         // 13. p2의 카드수령여부
         if (isP2Plag) {
            System.out.println("p2님 카드를 받으시겠습니까? 1. yes 2. no");
            String input = new java.util.Scanner(System.in).nextLine();
            if (input.equals("1")) {
               p2Deck[p2DeckIndex++] = deck[deckIndex++];
               if (p2Deck.length == p2DeckIndex) {
                  isP2Plag = false;
               }
            } else {
               isP2Plag = false;
            }
         }

         // 14. p1 중간 계산

         p1Sum = 0;
         p2Sum = 0;
         // p1계산
         // A를 11로 놓고 계산
         for (int i = 0; i < p1DeckIndex; i++) {
            if (p1Deck[i] % 13 == 0) {
               p1Sum = p1Sum + 11;
            } else if (p1Deck[i] % 13 < 10) {
               p1Sum = p1Sum + p1Deck[i] % 13 + 1;
            } else {
               p1Sum = p1Sum + 10;// jqk
            }
         }

         // A를 1로 놓고 계산
         // 언제 A를 1로 놓고 계산할 것인가?
         if (p1Sum > 21) {
            for (int i = 0; i < p1DeckIndex; i++) {
               if (p1Deck[i] % 13 == 0) {// A가 있으면
                  p1Sum = p1Sum - 10;
               }
               // A가 여러개 존재해도 22보다 작으면 그만 검색
               if (p1Sum < 22) {
                  break;
               }
            }
         } // p1의 총합 종료

         if (p1Sum > 22) {
            isP1Plag = false;
            isP2Plag = false;
         }

         // 15. p2 중간 계산
         // p2 총합 계산
         // A를 11로 놓고 계산
         for (int i = 0; i < p2DeckIndex; i++) {
            if (p2Deck[i] % 13 == 0) {
               p2Sum = p2Sum + 11;
            } else if (p2Deck[i] % 13 < 10) {
               p2Sum = p2Sum + p2Deck[i] % 13 + 1;
            } else {
               p2Sum = p2Sum + 10;// 10,j,q,k
            }
         }
         // A를 1로 놓고 계산
         // 언제 A를 1로 놓고 계산할 것인가?
         if (p2Sum > 21) {
            for (int i = 0; i < p2DeckIndex; i++) {
               if (p2Deck[i] % 13 == 0) {// A가 있으면
                  p2Sum = p2Sum - 10;
               }
               // A가 여러개 존재해도 22보다 작으면 그만 검색
               if (p2Sum < 22) {
                  break;
               }
            }
         } // p2의 총합 종료

         if (p2Sum > 22) {
            isP1Plag = false;
            isP2Plag = false;
         }

         System.out.println("p1Card");
         for (int i = 0; i < p1DeckIndex; i++) {
            System.out.println(p1Deck[i] + ":" + cardShape[p1Deck[i] / 13] + cardNumber[p1Deck[i] % 13]);// 0~51
         }
         System.out.println("p1의 총합:" + p1Sum);

         System.out.println("p2Card");
         for (int i = 0; i < p2DeckIndex; i++) {
            System.out.println(p2Deck[i] + ":" + cardShape[p2Deck[i] / 13] + cardNumber[p2Deck[i] % 13]);// 0~51
         }
         System.out.println("p2의 총합:" + p2Sum);
      }

      // 9. 최종
      // 결과.------------------------------------------------------------------------
      // 카드 점수를 저장할 변수 선언
      p1Sum = 0;
      p2Sum = 0;
      // p1계산
      // A를 11로 놓고 계산
      for (int i = 0; i < p1DeckIndex; i++) {
         if (p1Deck[i] % 13 == 0) {
            p1Sum = p1Sum + 11;
         } else if (p1Deck[i] % 13 < 10) {
            p1Sum = p1Sum + p1Deck[i] % 13 + 1;
         } else {
            p1Sum = p1Sum + 10;// 10,j,q,k
         }
      }
      // A를 1로 놓고 계산
      // 언제 A를 1로 놓고 계산할 것인가?
      if (p1Sum > 21) {
         for (int i = 0; i < p1DeckIndex; i++) {
            if (p1Deck[i] % 13 == 0) {// A가 있으면
               p1Sum = p1Sum - 10;
            }
            // A가 여러개 존재해도 22보다 작으면 그만 검색
            if (p1Sum < 22) {
               break;
            }
         }
      } // p1의 총합 종료
      System.out.println("p1의 총합:" + p1Sum);

      // p2 총합 계산
      // A를 11로 놓고 계산
      for (int i = 0; i < p2DeckIndex; i++) {
         if (p2Deck[i] % 13 == 0) {
            p2Sum = p2Sum + 11;
         } else if (p2Deck[i] % 13 < 10) {
            p2Sum = p2Sum + p2Deck[i] % 13 + 1;
         } else {
            p2Sum = p2Sum + 10;// jqk
         }
      }
      // A를 1로 놓고 계산
      // 언제 A를 1로 놓고 계산할 것인가?
      if (p2Sum > 21) {
         for (int i = 0; i < p2DeckIndex; i++) {
            if (p2Deck[i] % 13 == 0) {// A가 있으면
               p2Sum = p2Sum - 10;
            }
            // A가 여러개 존재해도 22보다 작으면 그만 검색
            if (p2Sum < 22) {
               break;
            }
         }
      } // p2의 총합 종료
      System.out.println("p2의 총합:" + p2Sum);

      // 10. 승패 출력
      String winner = "";
      if (p1Sum > 21 && p2Sum > 21) {
         winner = "무승부";
      } else if (p1Sum > 21) {
         winner = "p2승리";
      } else if (p2Sum > 21) {
         winner = "p1승리";
      } else if (p1Sum > p2Sum) {
         winner = "p1승리";
      } else if (p1Sum < p2Sum) {
         winner = "p2승리";
      } else {
         winner = "무승부";
      }
      System.out.println(winner);

   }

}