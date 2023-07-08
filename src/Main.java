class Loopy {

    public static void main(String[] args) {

        // PART A
        System.out.println("PART A");
        // 1. A loop that counts (i.e. displays the count) up by 1 from 0 to 30
        for (int num = 0; num <= 30; num++) System.out.print(num + " ");
        System.out.println();

        // 2. A loop that counts down by 1 from 30 to 0
        for (int num = 30; num >= 0; num--) System.out.print(num + " ");
        System.out.println();

        // 3. A loop that counts up by 3 from 0 to 18
        for (int num = 0; num <= 18; num += 3) System.out.print(num + " ");
        System.out.println();

        // 4.  A loop that counts down by 2 from 10 to 0
        for (int num = 10; num >= 0; num -= 2) System.out.print(num + " ");
        System.out.println();

        System.out.println("PART B");
        //A nested loop that creates this figure (there are no blank lines)
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }

        //A nested loop that creates this figure (there are no blank lines)
        for (int row = 5; row >=1; row--) {
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }
        //A nested loop that creates this figure (there are no blank lines)
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) System.out.print("*");
            System.out.println();
        }
    }
}