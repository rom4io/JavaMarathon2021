package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private List<String> member = new ArrayList<>();

    public MusicBand(String name, int year, List<String> member) {
        this.name = name;
        this.year = year;
        this.member = member;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (int i = 0; i < a.member.size(); i++) {
            b.member.add(a.member.get(i));
        }
        a.member.clear();
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " " + year;
    }

    public List<String> getMember() {
        return member;
    }

    public void setMember(List<String> member) {
        this.member = member;
    }

    public void printMembers() {
        System.out.println(this.member);
    }


}
