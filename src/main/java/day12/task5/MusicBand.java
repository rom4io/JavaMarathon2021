package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;


    public MusicBand(String name, int year, List<MusicArtist> members){
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand a , MusicBand b){
        for (MusicArtist member : a.getMembers() ){
            b.getMembers().add(member);
        }
        a.members.clear();
    }

    public void printMembers(){
        System.out.println(this.members);
    }

    public String toString (){
        return name + " " + year;
    }


}
