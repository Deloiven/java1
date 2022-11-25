public class prostue_chisla {
    public static void main(String[] args) {
        System.out.println("Введите положительное число: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        boolean b = true;
        for (int P = 1; P <= input; P++) {
            for (int i = 1; i < P; i++)
            {
                if (P % i == 0){
                    b = false;
                }
            System.out.println(P);}
        }

    }
}