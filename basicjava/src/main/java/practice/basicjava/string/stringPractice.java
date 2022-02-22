package practice.basicjava.string;

public class stringPractice {
    public static void main(String[] args) {
        String str = "abcddddeeee";

        //defddddeeee
        String str2 = str.replace("abc","def");
        System.out.println(str2);

        // d를 기준으로 나누기, 그러나 d가 연속적임으로 공백이 추가 됨
        String[] strings = str.split("d");

        /// abc, (공백), (공백), (공백), eeee 출력
        for (String string: strings) {
            System.out.println(string);
        }

        // 길이
        System.out.println(str.length());

        // true
        System.out.println(str.startsWith("a"));

        // false
        System.out.println(str.endsWith("f"));

        // true
        System.out.println(str.equals("abcddddeeee"));

        // 음수일 경우 기준 string이 더큼
        // 헷갈리면 아스키 코드 (기준 - 비교대상) 값
        if(str.compareTo("bcd")>0){
            System.out.println("str이 bcd보다 작다.");
        }
        else{
            System.out.println(str.compareTo("bcd"));
            System.out.println("str이 bcd보다 크다");
        }

        // dddd 출력
        // substring(start, end+1)
        System.out.println(str.substring(3,7));
    }
}
