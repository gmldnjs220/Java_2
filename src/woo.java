public class woo {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;

        System.out.println(b + i); //b가 int 타입으로 자동 변환
        System.out.println(10 / 4);
        System.out.println((char) 0x12340041); //4가 4.0으로 자동 변환
        System.out.println((byte) (b + i)); //=overflow 발생 (바이트의 한계인 127 을 넘어선 숫자가 나와서)
        System.out.println((int) 2.9 + 1.8); //2.9 + 1.8 = 2 + 1.8 = 3.8
        System.out.println((int) (2.9 + 1.8));//2.9 + 1.8=4.7 -> 4
        System.out.println((int) 2.9 + (int) 1.8); //2.9 + 1.8 = 2 + 1 = 3
    }
}
