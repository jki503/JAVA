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
