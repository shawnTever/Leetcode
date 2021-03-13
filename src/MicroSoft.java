import java.util.*;

public class MicroSoft {
//    public int solution(int N) {
//        List<Integer> l = new ArrayList<>();
//        int result = 0;
//        int index = 0;
//        while (N > 0) {
//            int a = N % 10;
//            N = N / 10;
//            l.add(a);
//        }
//        int[] i = new int[l.size()];
//        for (int s : l) {
//            i[index] = s;
//            index++;
//        }
//        Arrays.sort(i);
//        for (int j = 0; j < i.length; j++) {
//            result += i[j] * Math.pow(10, j);
//        }
//        return result;
//    }

//    public int solution(String S) {
//        // write your code in Java SE 11
//        char[] c = S.toCharArray();
//        int result = 0;
//        Map<Character, Integer> map = new HashMap<>();
//        Map<Integer, String> map2 = new HashMap<>();
//        Map<Integer, Integer> map3 = new HashMap<>();
//        for (char ch : c) {
//            if (!map.containsKey(ch)) {
//                map.put(ch, 1);
//            }
//            else {
//                map.put(ch, map.get(ch) + 1);
//            }
//        }
//        for (char ch : map.keySet()) {
//            if (!map2.containsKey(map.get(ch))) {
//                map2.put(map.get(ch), Character.toString(ch));
//            }
//            else {
//                map2.put(map.get(ch), map2.get(map.get(ch)) + ch);
//            }
//        }
//        for (int i : map2.keySet()) {
//            map3.put(i, map2.get(i).length());
//        }
//        for (int i = S.length(); i > 0; i--) {
//            if (map3.containsKey(i)) {
//                result += i;
//                map3.put(i, map3.get(i) - 1);
//            }
//            else {
//                for (int j = S.length(); j > i; j--) {
//                    if (map3.containsKey(j) && map3.get(j) > 0) {
//                        result += i;
//                        map3.put(j, map3.get(j) - 1);
//                        break;
//                    }
//
//                }
//            }
//        }
//        return result;
//    }

    public int[] solution(int[] A, int[] B) {
//        double i = Math.pow(-2, 100000);
        double Asum = 0;
        double Bsum = 0;
        int resultSum;
        for (int i = 0; i < A.length; i++) {
            Asum += A[i] * Math.pow(-2, i);
        }
        for (int i = 0; i < B.length; i++) {
            Bsum += B[i] * Math.pow(-2, i);
        }
        resultSum = (int)(Asum + Bsum);
//        int len = Math.max(A.length, B.length) + 2;
//        int[] result = new int[len];
//        int pointer = 0;
//        while (resultSum != 0) {
//            int remainder = resultSum % (-2);
//            resultSum = resultSum / (-2);
//            if (remainder == -1) {
//                remainder = 1;
//                resultSum += 1;
//            }
//            result[pointer] = remainder;
//            pointer++;
//        }
        StringBuilder s = new StringBuilder();
        while (resultSum != 0) {
            int remainder = resultSum % (-2);
            resultSum = resultSum / (-2);
            if (remainder == -1) {
                remainder = 1;
                resultSum += 1;
            }
            s.append(remainder);
        }
        int[] result = new int[s.length()];
        int index = 0;
        for (char c : s.toString().toCharArray()) {
            result[index] = Integer.parseInt("" + c);
            index++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        MicroSoft microSoft = new MicroSoft();
//        int[] i = new int[]{1,2,3};
//        List<int[]> list = new ArrayList<>();
//        list = Arrays.asList(i);
//        for (int[] j : list) {
//            System.out.println(j[0]);
//        }
//        System.out.println(microSoft.solution(654892));

//        System.out.println(microSoft.solution("ccaaffddecee"));
//        System.out.println(microSoft.solution("eeee"));
//        System.out.println(microSoft.solution("eeeeffff"));

        int[] A = new int[]{0,1,1,0,0,1,0,1,1,1,0,1,0,1,1};
//        int[] A = new int[]{1,0,1,0,1,0,1};

        int[] B = new int[]{0,0,1,0,0,1,1,1,1,1,0,1};
//        int[] B = new int[]{1,0,1,0,1,0,1};

        System.out.println(Arrays.toString(microSoft.solution(A, B)));

        int sum = 0;
        for (int i = 0; i < microSoft.solution(A, B).length; i++) {
            sum += microSoft.solution(A, B)[i] * Math.pow(-2, i);
        }
        System.out.println(sum);
    }
}
