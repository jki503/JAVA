package com.java.skill.string;

public class stringBuilderPractice {

    public static void main(String[] args) {

        String str = "abcde";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(str);

        // 1.4abc2c
        sb1.append(1.4);
        sb1.append("abc");
        sb1.append(2);
        sb1.append('c');

        //abcde 출력
        System.out.println(sb2.toString());
        String str2 = sb1.toString();
        System.out.println(str2);

        // start ~ end-1까지 삭제
        //
        sb1.delete(1,2);

        // 14abc2c -> length 7
        System.out.println(sb1.length());

        // abcde  -> length 5
        System.out.println(sb2.length());

        // 14abc2c
        System.out.println(sb1.toString());

        // 음수로 sb1이 더 큼
        // -48 출력
        System.out.println(sb1.compareTo(sb2));


        //14def2c 출력 (start, end+1, 대체할 스트링)
        sb1.replace(2,5,"def");
        System.out.println(sb1.toString());

    }
}
