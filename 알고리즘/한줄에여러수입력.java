import java.util.ArrayList;
import java.util.Scanner;

public class code {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        int removeCnt;
        int runCnt = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < runCnt; i++) {

            String inputLine = scanner.nextLine();
            String[] conversionStr = inputLine.split(" ");
            for(String cntStr : conversionStr) {
                arrayList.add(cntStr);
            }

            removeCnt = scanner.nextInt();
            for(int j = 0; j < removeCnt; j++) {
                arrayList.remove(arrayList.size() - 1);
            }
            scanner.nextLine();
        }

        System.out.print("/");
        for(String cntStr : arrayList) {
            System.out.printf("%s ", cntStr);
        }
        System.out.print("/");

    }

}
