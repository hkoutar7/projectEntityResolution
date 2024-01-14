package com.entityResolution.View.ViewBlocking;

import com.entityResolution.Controller.Blocking.Tuple;
import  com.entityResolution.Controller.Blocking.*;

import java.util.*;

public class blockingTest {

    public static void main(String[] args) {
        ArrayList<ArrayList<Tuple>> objetRec = new ArrayList<>();

        objetRec.add((ArrayList<Tuple>) List.of(
                new Tuple(1, "badr", "test", "occuperutrhfhgffhfh"),
                new Tuple(2, "badr", "testoccupation tizre", "occuper"),
                new Tuple(4, "badr", "testoc", "occuper"),
                new Tuple(10, "badr", "testocsqfedfqedqed", "occuperppppkklklklklk"),
                new Tuple(100, "badr", "testocsqfedfqedqed", "occuper"),
                new Tuple(1156, "badr", "testocsqfedfqedqed", "occuper"),
                new Tuple(110, "badr", "testocsqfedfqedqed", "occuperutrhfhgffhfh"),
                new Tuple(22, "badr", "testoccupation tizre", "occuper"),
                new Tuple(10099, "badr", "testocsqfedfqedqed", "occuperppppkklklklklk"),
                new Tuple(11, "badr", "testocsqfedfqedqed", "occuperppppkklklklklk")
        ));
//        System.out.println(objetRec.get(0).size());
//        Blocking blocking = new Blocking(0, 2, objetRec);
//        ArrayList<ArrayList<Tuple>> result =  blocking;
//        System.out.println(result);

    }

}
