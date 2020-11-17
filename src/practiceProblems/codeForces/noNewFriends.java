package src.practiceProblems.codeForces;

import java.util.HashSet;
import java.util.Set;

public class noNewFriends {
    public static void main(String args[])
    {
        int n = 3;
        int[][] friends = {{0,1}, {1,2}};
        System.out.println(solve(n, friends));
    }
    public static boolean solve(int n, int[][] friends) {
        Set<Integer> f = new HashSet<>();
        for (int i  = 0; i < friends.length; i++) {
            f.add(friends[i][0]);
            f.add(friends[i][1]);
        }

        System.out.println(f);
        return n == f.size();
    }
}
