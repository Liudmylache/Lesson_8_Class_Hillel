public class For {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++){
            System.out.println("i = " + (i + 1));
        }

        for (int a = 100; a >= 1; a--){
            System.out.println("a = " + a);
        }

        for (int b = 0; b < 100; b++){
            if (b % 4 == 0 || b % 5 == 0) {
                System.out.println("b = " + b);
            }
        }
    }
}
