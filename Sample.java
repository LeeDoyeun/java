package human20221013;

public class Sample {

    public static void main(String[] args) {
     System.out.println("=======Mother=======");
     Mother mother =new Mother("엄마",20000);
     mother.printInfo();
     mother.earnMoney();
     mother.printInfo();
     System.out.println("=======Child1=======");
     Child1 child1 = new  Child1("이름", 10000, "학생");
     child1.printInfo();
     child1.earnMoney();
     child1.printInfo();
     child1.earnMoneyMoterChance();;
     child1.printInfo();
     child1.donate();
     child1.printInfo();
     System.out.println("=======Child2=======");
    Child2 child2 =new Child2("두번째 자식",50000,"변호사");
    child2.printInfo();
    child2.earnMoney();
    child2.printInfo();
    }

 }
 //상속
 class Mother{//엄마
    String name;
    int money;
    //비상금 자식들이 상속받지 못하게 접근제한자를 praivate로 지정
    private int pocketMoney = 30000;
    Mother(String name, int money){
       this.name = name;
       this.money = money;
    }
    void earnMoney() {
      System.out.println("돈 벌기 10000");
       money= money+10000;
    }
    void printInfo() {
       System.out.println("자산 : "+money);
    }
    final void donate() {
    	System.out.println("2000원 기부");
    	money -= 2000;
    }
 }
 class Child1 extends Mother{
    String job;
    
    Child1(String name, int money, String job ){
       super(name, money);
       this.job=job;
    }
     void earnMoney() {
         System.out.println("돈 벌기 3000");
          money= money+3000;
       }
     void earnMoneyMoterChance() {
       super.earnMoney();
     }

     //300원으로 기부금을 줄이지 않기 위해
//     Mother class의 donate 메서드를 final로 설정
//     void donate() {
//    	 System.out.println("300원 기부");
//    	 money -= 300;
//     }
    
 }
    class Child2 extends Mother{
       String job;
       
       Child2(String name, int money, String job ){
          super(name, money);
          this.job=job;
       }
        void earnMoney() {
            System.out.println("돈 벌기 1000");
             money= money+1000;
          }

 }
 class Father{//아빠
    String name;
    int money;
    Father(String name, int money){
       this.name = name;
       this.money = money;
 }
 }
 
 
