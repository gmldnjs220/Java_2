import java.util.Scanner;

public class gee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ?연산자
        // prettier 깔고 alt+shift+f 누르면 들여쓰기 알아서 맞춰줌
        // int a =3, b = 5;

        // System.out.println("두 수의 차는 " + ((a > b) ? (a - b) : (b - a)));
        // ------------------------------------------------------------------------------------------------------------
        // switch문

        // System.out.print("월 (1~12)을 입력하시오 : ");
        // int month = sc.nextInt();
        // switch (month) {
        // case 3:
        // case 4:
        // case 5:
        // System.out.println("봄 입니다.");
        // break;
        // case 6:
        // case 7:
        // case 8:
        // System.out.println("여름 입니다.");
        // break;
        // case 9:
        // case 10:
        // case 11:
        // System.out.println("가을입니다.");
        // break;
        // case 12:
        // case 1:
        // case 2:
        // System.out.println("겨울입니다.");
        // break;
        // case 0:
        // break;
        // }
        // -----------------------------------------------------------------------------------------------------------------------
        // 반복문(for문)

        // int sum = 0;

        // for (int i = 1; i <= 10; i++) {
        // sum += i;
        // System.out.print(i);
        // if (i <= 9) {
        // System.out.print("+");
        // } else {
        // System.out.print("=");
        // System.out.println(sum);
        // }

        // }
        // ---------------------------------------------------------------------------------------------------------------------
        // 반복문(while문) (do while문 = 실행을 먼저 하고 그다음에 조건을 확인)
        // int i=0;
        // while(i< 10){
        // System.out.println(i);
        // i++;
        // }
        // -------------------------------------------------------------------------------------------------------------------
        // for문 중첩
        // for (int i =2 ; i < 10 ; i++){
        // System.out.println(i + " [단]");
        // for(int j = 1; j < 10 ; j++){
        // System.out.println(i + " * " + j + " = " + i*j);

        // }
        // if(i != 9){
        // System.out.println();
        // }

        // }
        // System.out.println("구구단을 가로로 출력하는 프로그램");
        // for (int i = 2; i < 10; i++) {
        //     System.out.print("[ " + i + "단 ]" + '\t');
        // }
        // System.out.println();
        // for (int k = 1; k < 10; k++) 
        //     for (int j = 2; j < 10; j++){
        //         System.out.print(j + "X" + k + "=" + j * k + '\t');
        //     System.out.println();
        //     }
        //------------------------------------------------------------------------------------------------------------------------------
        // int sum = 0;
        // System.out.println("정수 5개를 입력하세요.");
        // for (int i = 0; i < 5 ; i++){
        //     int n = sc.nextInt();
        //     if (n <= 0 ){
        //         continue;
        //     }
        //     else {
        //         sum += n;
        //     }
        // }
        // System.out.println("양수의 합 : " + sum);
//------------------------------------------------------------------------------------------------------------------------
        //break문
        // System.out.println("exit을 입력하면 종료합니다.");
        // while  (true){
        //     System.out.print(">>");
        //     String text = sc.nextLine();
            
        //     if (text.equals("exit")){
        //         break;
        //     }
            
        // }
        // System.out.println("프로그램을 종료합니다.");
        //---------------------------------------------------------------------------------------------------------------
        int intArray[];
        intArray = new int[5];
        //한줄 생성 => int intArray[] = new int[5];
        int max = 0;
        System.out.println("양수 5개를 입력하세요");

        for (int i = 0 ; i < 5 ; i++){
            intArray[i] = sc.nextInt();
            if (intArray[i] > max){
                max = intArray[i];
            }
        }
        System.out.println("가장 큰수는 " + max + "입니다");
        


    }
}
