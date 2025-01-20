import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
//        String[] inputStr = scanner.nextLine().split(" ");
//        List<String> list = Arrays.stream(inputStr).collect(Collectors.toList());
//        List<Integer> numberList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
//
//        int dupCnt = 0;
//        int dupNum = 0;
//        int max = Collections.max(numberList);
//        for( int i = 0; i < numberList.size(); i++ ) {
//            int num = numberList.get(i);
//            dupCnt = numberList.stream().filter(number -> number == num).collect(Collectors.toList()).size();
//            if ( dupCnt == 3 ) {
//                dupNum = num;
////                System.out.println(10000 + (num * 1000));
//                break;
//            } else if ( dupCnt == 2 ) {
//                dupNum = num;
////                System.out.println(1000 * (num * 100));
//                break;
//            }
//        }
//
//        if ( dupCnt == 3 ) {
//            System.out.println(10000 + (dupNum * 1000));
//        } else if ( dupCnt == 2 ) {
//            System.out.println(1000 * (dupNum * 100));
//        } else if ( dupCnt == 1 ) {
//            System.out.println(max * 100);
//        } else {
//            throw new Exception("오류발생");
//        }

//        // 아래 코드는 중복된 값만 뽑아준다.
//        Map<Integer, Long> duplicates = numberList.stream()
//                .collect(Collectors.groupingBy(num -> num, Collectors.counting())) // 그룹화 후 개수 계산
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() > 1) // 중복된 값 필터링
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int reward = 0;

        if (a == b && b == c) {
            // 세 주사위가 모두 같은 경우
            reward = 10000 + a * 1000;
        } else if (a == b || a == c) {
            // 두 주사위만 같은 경우 (a와 b 또는 a와 c)
            reward = 1000 + a * 100;
        } else if (b == c) {
            // 두 주사위만 같은 경우 (b와 c)
            reward = 1000 + b * 100;
        } else {
            // 모두 다른 경우
            reward = Math.max(a, Math.max(b, c)) * 100;
        }

        // 결과 출력
        System.out.println(reward);

        scanner.close();
    }
}
