    import java.util.Scanner;

    public class Main{
        public static void main(String[]  args){
            Scanner banphim = new Scanner(System.in);
            int a = banphim.nextInt();
            int b = banphim.nextInt();
            int c = (a+b) * 2;
            int d = a * b;
            System.out.println(+c);
            System.out.println(+d);
            banphim.close();
        }
    }
