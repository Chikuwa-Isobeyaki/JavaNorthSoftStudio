public class Ready309 {
    public static void main(String[] args) {
        int x = 56;
        int y = 53;

        if( x < y && ( x % 2 == 0 && y % 2 == 0 )) {
          System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
        } else if( x == y && ( x < 0 && y < 0 )) {
          System.out.println("xとyは等しく、かつ、負の数である。");
        } else if( (x <= 10 || x >= 100) && (y >= 10 && y <=  100)) {
          System.out.println("xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
        } else if( x >= 0 &&  y >= 0 ) {
          System.out.println("xもyも負の数である、ではない。");
        }
    }
}
