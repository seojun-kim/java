public class arrayExam {

    public static void main(String[] args) {

        int arrInt[] = new int[10];
        for(int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d\n", arrInt[i]);
        }
        System.out.printf("---------------------\n");

        int arrInt2[] = {1, 3, 5, 7, 9};
        for(int i = 0; i < arrInt2.length; i++) {
            System.out.printf("%d\n", arrInt2[i]);
        }
    }
}
