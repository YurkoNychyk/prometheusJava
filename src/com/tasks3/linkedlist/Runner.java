package com.tasks3.linkedlist;

/**
 * Created by yurko on 15.03.17.
 */
public class Runner {
    public static void main(String[] args) {
        LinkedList testedList = new LinkedList();

        for (int i = 0; i < 10; i++) {
            testedList.add(i);
        }

        System.out.println("First element:" + testedList.get(0));
        System.out.println("Last element:" + testedList.get(testedList.size() -1));


        System.out.println(testedList + " size:" + testedList.size());


        while (testedList.size() !=0) {
            testedList.delete(0);
        }
        System.out.println(testedList);
    }
}
