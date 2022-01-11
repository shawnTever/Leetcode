package huawei;

import java.util.*;

public class meeting {

    public static void re(Map<Integer, ArrayList<Integer>> map, int kill, ArrayList<Integer> result) {
        Queue<Integer> queue = new LinkedList<>();
        if (map.containsKey(kill)) {
            for (int i : map.get(kill)) {
                queue.offer(i);
            }
            while (!queue.isEmpty()) {
                int pid = queue.poll();
                re(map, pid, result);
                result.add(pid);
            }
        }
    }
//    public static void main(String[] args) {
//        int[] pid = new int[]{1, 3, 10, 5};
//        int[] ppid = new int[]{3, 0, 5, 3};
//        int kill = 5;
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
//        for (int i = 0; i < pid.length; i++) {
//            if (!map.containsKey(pid[i])) {
//                ArrayList<Integer> pids = new ArrayList<>(pid[i]);
//                map.put(ppid[i], pids);
//            } else {
//                ArrayList<Integer> pids = map.get(ppid[i]);
//                pids.add(pid[i]);
//                map.put(ppid[i], pids);
//            }
//        }
//        ArrayList<Integer> result = new ArrayList<>();
//        re(map, kill,result);
//        System.out.println(arrayList);
//    }

    public static void main(String[] args) {
        System.out.println();
        int[] pid = new int[]{1, 3, 10, 5};
        int[] ppid = new int[]{3, 0, 5, 3};
        int kill = 3;

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < pid.length; i++) {
            if (!map.containsKey(ppid[i])) {
                ArrayList<Integer> a = new ArrayList<>();
                a.add(pid[i]);
                map.put(ppid[i], a);
            } else {
                ArrayList<Integer> pids = map.get(ppid[i]);
                pids.add(pid[i]);
                map.put(ppid[i], pids);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(kill);
        re(map, kill, result);
        System.out.println(result);


    }
}
