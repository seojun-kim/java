public class tryCatch {

    public static void main(String[] args) {

        int arrInt[] = new int[5];

        try {
            arrInt[3] = 10;
            arrInt[5] = 2;
            arrInt[7] = 5;
        }
        catch (Exception e) {
            e.printStackTrace(); //에러 부분 출력
            System.out.printf("배열 범위 초과");
            System.exit(0); //프로그램 강제 종료
        }

        System.out.printf("프로그램 종료");
    }
}
