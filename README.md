---
Title: JAVA 공부 정리하기.
category: JAVA
tags: [객체지향, Java, Spring]
Author: Jung
---

## My Goal

---

</br>

- 자바 공부
- 자바 모듈과 클래스 사용법 정리

</br>
</br>

## Table of Contents

---

- [My Goal](#my-goal)
- [Table of Contents](#table-of-contents)
  - [**Enum**](#enum)
  - [**String StringBuilder StringTokenizer**](#string-stringbuilder-stringtokenizer)
    - [String](#string)
    - [StringBuilder](#stringbuilder)
    - [StringTokenizer](#stringtokenizer)
  - [**Optional**](#optional)

</br>
</br>

### **Enum**

</br>

- class : java.lang.Enum;
  - Enum class 안에 조작할 수 있는 메소드 포함.

</br>

- method

  |     메서드      |               기능               |
  | :-------------: | :------------------------------: |
  | Enum.ordinal()  | enum 상수값의 index를 int로 반환 |
  |   Enum.name()   |   enum 상수를 string으로 반환    |
  | Enum.toString() |   enum 상수를 string으로 반환    |
  |  Enum.values()  |      enum type 배열로 반환       |

</br>

- 예시 (skill/src/main/java/com/java/skill/Enum)

```java
public enum Direction {
    // 명시적 index 설정
    // UP(2), RIGHT(5), DOWN(6), LEFT(8);

    // 상수의 index 값은 0,1,2... 오름차순 증가로 설정
    UP, RIGHT, DOWN, LEFT;

}

public class EnumPractice {
    public static void main(String[] args) {

        // Enum.values() : Enum 타입의 모든 상수 저장하는 배열
        Direction[] directions = Direction.values();

        // Direction 타입으로 출력
        for (Direction direction : directions) {
            System.out.println(direction);
        }

        // Direction을 Integer List로
        List<Integer> arrInteger = Arrays.stream(directions)
                .map(Enum::ordinal)
                .collect(Collectors.toList());
        System.out.println(arrInteger);

        // Enum 상수의 index를 int로 반환. -> 2출력
        int ordinalDown = Direction.DOWN.ordinal();
        System.out.println(ordinalDown);

        // Enum 타입의 키워드를 string으로 반환
        String nameDown = Direction.DOWN.name();
        System.out.println(nameDown);

        // Enum 타입의 키워드를 string으로 반환
        String toStringDown = Direction.DOWN.toString();
        System.out.println(toStringDown);
    }
}
```

</br>
</br>
</br>

### **String StringBuilder StringTokenizer**

---

</br>

#### String

</br>

|           메서드           |                                         기능                                         |
| :------------------------: | :----------------------------------------------------------------------------------: |
|  replace(target,replace)   |                            target 문자열을 replace로 대체                            |
|        split(regex)        | regex 기준으로 나눈 후 문자열 배열 저장, 특정 regex가 연속일 경우 중간에 공백 들어간 |
|    startsWith("prefix")    |                            접두로 시작하는지 boolean 반환                            |
|     endsWith("suffix")     |                             접미로 끝나는지 boolean 반환                             |
|  equals("compareString")   |                        compareString이랑 같은지 boolean 반환                         |
| string.compareTo("target") |                     문자열 비교, string이 크면 음수, 작으면 양수                     |
|   substring(start,end+1)   |                           start~end(포함)까지 문자열 반환                            |

</br>

```java

public class StringPractice {
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
```

</br>

#### StringBuilder

</br>

|      메서드       |            기능            |
| :---------------: | :------------------------: |
| append(type 다양) |        문자열 추가         |
|    toString()     | 추가 된 문자열 합쳐서 반환 |
| delete(start,end) |    start~end-1까지 삭제    |
|     length()      | 추가된 문자열의 길이 반환  |

</br>

> - stringBuilder는 immutable한 string의 단점을 보완
> - stringBuilder는 muttable 객체
> - append는 추가되는 원소의 다양한 자료형을 지원(int,float,char 등등)
> - length는 추가되는 횟수의 길이가 아님. 배열의 의미와 다름.

```java

public class StringBuilderPractice {

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
```

</br>

#### StringTokenizer

</br>

|     메서드      |              기능              |
| :-------------: | :----------------------------: |
| hasMoreTokens() | 토큰이 남아있는지 boolean 반환 |
|  countTokens()  |      남아있는 토큰의 개수      |
|   nextToken()   |     다음 토큰 문자열 반환      |

</br>

> - 생성시 delim을 지정할 수 있다.
> - string의 split과 다르게 delim이 여러개 붙어 있어도, 공백을 추가시키지 않음.

```java

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

```

</br>
</br>
</br>

### **Optional**

</br>

> - null을 가질 가능성을 가진 객체를 Wrapper로 담은 후 runtime시 발생되는 NPE를 체크하고 다루기 위해 나온 Wrapper 클래스.
> - NPE 발생을 개발자가 처리 X -> Optional로 위임.

</br>

[Optionla API 문서](https://docs.oracle.com/javase/9/docs/api/java/util/Optional.html)

- 요약
  - Optional은 반환값이 없음을 명확하게 표현
  - 즉 반환타입을 Optional로 사용하자고 한 것
  - 또 Optional null로 감싸는 것이 아니라 인스턴스를 바라 봐야한다는 것.

</br>

- Optional에 대한 고찰

</br>

> - API가 그렇듯 Optional도 쓰는 사람의 책임에 달려있다.
> - Optional은 직접적으로 null로 감싸지 않는다.
>   - 반환값 받은 후(사용하는 사람에 따라 다르지만)
>   - null일 경우 (이게 의도한 방식)
>     - 객체 생성 or 사용자가 지정한 객체
>     - 액션 지정
>   - 혹시나 반환 받을 객체를 직접적으로 써야할 경우
>     - null 체크 후 객체 받아오기

</br>

- Optional을 인자로 받는 것이 아닌 Optional 반환타입으로만 쓰는 이유

</br>

> - 반환 받은 Optional 인스턴스를 이용해 바로 액션
> - try catch, if else 문보다 유지보수 용이
>   - stream, fileter, flatmap등으로 chaining 가능.

</br>

- 예시

```java

```

```java

```
