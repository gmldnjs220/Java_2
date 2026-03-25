public class Foo {
    //두 정수를 더하는 메소드
    public static int sum(int n, int m) {
        return n + m;
    }
    
    // main() 메소드에서 실행이 시작
    public static void main(String[] args) {

        int i = 20;//변수를 초기화와 선언을 동시에 할 수 있음
        int s; 
        char a; //문자열 데이터 타입
        // 상수 선언은 앞에 final을 붙여 줌 EX)final int PI = 1;
        //또한 상수 선언은 모든 알파벳을 대문자로 이름을 붙여야함

        s = sum(i, 10);
        a = '?';
        System.out.println(a);
        System.out.println("hello");
        System.out.println(s);
        
    }
}
