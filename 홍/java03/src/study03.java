public class study03 {

    public static void main(String[] args) {

        String name = "김서준";
        int a = 1, b = 1;

        if(name == "김서준") {
            System.out.printf("이름 : 김서준\n");
        }
        else if(name == "익명") {
            System.out.printf("이름 : 익명");
        }
        else {
            System.out.printf("이름 : 모름");
        }

        //AND
        if(a == 1 && b == 1) {
            System.out.printf("a == b");
        }

        //OR
        if(a == 1 || b == 1) {
            System.out.printf("a == 1 || b == 1");
        }
    }
}
