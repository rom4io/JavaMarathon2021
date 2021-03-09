package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> member1 = new ArrayList<>();
        member1.add("Пол уокер");
        member1.add("member1 1");
        member1.add("member1 2");
        member1.add("member1 3");

        List<String> member2 = new ArrayList<>();
        member2.add("member 2 1");
        member2.add("member 2 2");
        member2.add("member 2 3");
        member2.add("member 2 4");

        MusicBand mb1 = new MusicBand("MB1",1986,member1);
        MusicBand mb2 = new MusicBand("MB2", 2016, member2);

        mb1.printMembers();
        System.out.println("");
        mb2.printMembers();

        MusicBand.transferMembers(mb1, mb2);
        System.out.println("");

        mb1.printMembers();
        System.out.println("");
        mb2.printMembers();
     }
}
