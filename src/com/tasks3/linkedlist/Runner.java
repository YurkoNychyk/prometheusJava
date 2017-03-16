package com.tasks3.linkedlist;

/**
 * Created by yurko on 15.03.17.
 */
public class Runner {
    public static void main(String[] args) {
        LinkedList testedList = new LinkedList();
        LinkedList testedList1 = new LinkedList();

        for (int i = 0; i < 10; i++) {
            testedList.add(i);
            testedList1.add(i);
        }

        for (int i = 0; i < testedList.size(); i++) {
            System.out.println("index: " + i + ", data: " + testedList.get(i));
        }

        System.out.println(testedList.delete(-5));


        System.out.println(testedList + " size:" + testedList.size());

        while (testedList.size() !=0) {
            testedList.delete(0);
            System.out.println(testedList + " size: " + testedList.size());
        }

        System.out.println(testedList1);

        for (int i = testedList1.size() - 1; i >= 0 ; i--) {
            testedList1.delete(i);
            System.out.println(testedList1);
        }

    }
}
