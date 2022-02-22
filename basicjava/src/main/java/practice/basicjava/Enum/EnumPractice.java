package practice.basicjava.Enum;

import java.lang.Enum;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
