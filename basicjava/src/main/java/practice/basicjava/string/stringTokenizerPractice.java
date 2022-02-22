package practice.basicjava.string;

import java.util.StringTokenizer;

public class stringTokenizerPractice {
    public static void main(String[] args) {

        String str = "i0am00a00...";
        String str2 = "i am  a  ...";

        // delim 기준 설정
        StringTokenizer st = new StringTokenizer(str,"0");

        // default는 공백 기준으로
        StringTokenizer st2 = new StringTokenizer(str2);

        // str : i am a ...
        // str2 : i am a...
        while(st.hasMoreTokens() && st2.hasMoreTokens()){

            // 남아 있는 token 개수
            System.out.println(st.countTokens());
            System.out.println(st2.countTokens());

            String s1 = st.nextToken();
            String s2 = st2.nextToken();

            System.out.println(s1);
            System.out.println(s2);

            if(s1.equals(s2))
                System.out.println("is same");
        }
    }
}
