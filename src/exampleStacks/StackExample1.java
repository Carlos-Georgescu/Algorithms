package src.exampleStacks;

import java.util.*;
public class StackExample1 {
    public static void main(String args[])
    {
        Stack<Character> tower = new Stack<Character>();

        tower.add('R');
        tower.add('B');
        tower.add('Y');

        System.out.println(tower.contains('B'));
    }
}
