public class MethodExample {

    public static void main(String[] args) {

        String a = "hello";
        String b = "김서준";

        System.out.printf("%s %s\n", a, b);

        MethodExample methodExample = new MethodExample(); //메소드를 호풀하기 위해 클래스 생성
        methodExample.StrCombine(a, b); //메소드 실행

        System.out.printf("%s\n", methodExample.ReturnStr(a, b));
    }

    public void StrCombine (String a, String b) { //실행형 메소드

        System.out.printf("%s %s\n", a, b);
    }

    public String ReturnStr (String a, String b) { //리턴형 메소드

        return a + " " + b;
    }
}
