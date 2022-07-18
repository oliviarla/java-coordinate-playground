package coordinate.view;

import coordinate.domain.Point;
import coordinate.domain.Points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public Points inputPoint(){
        System.out.println("좌표를 입력하세요.");
        String s = scanner.next();

        Points points = new Points();
        String[] strings = s.split("-");
        for(String str: strings){
            List<Integer> numbers = new ArrayList<>();
            List<String> nums;
            nums = Arrays.stream(str.split("\\(|,|\\)")).filter(t -> !t.isEmpty()).collect(Collectors.toList());
            for(String n: nums){
                numbers.add(Integer.valueOf(n));
            }

            Point point = new Point(numbers.get(0), numbers.get(1));
            points.addPoint(point);
        }
        return points;
    }
}
