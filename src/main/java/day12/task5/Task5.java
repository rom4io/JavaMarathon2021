package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> memb1 = new ArrayList<>();
        List<MusicArtist> memb2 = new ArrayList<>();
        memb1.add(new MusicArtist("1", 1956));
        memb1.add(new MusicArtist("2", 1983));
        memb1.add(new MusicArtist("3", 1954));
        memb1.add(new MusicArtist("4", 1934));
        memb2.add(new MusicArtist("5", 1976));
        memb2.add(new MusicArtist("6", 1954));
        memb2.add(new MusicArtist("7", 2000));
        memb2.add(new MusicArtist("8", 1986));

        MusicBand mb1 = new MusicBand("mb1", 1986, memb1);
        MusicBand mb2 = new MusicBand("mb2", 2016, memb2);
        mb1.printMembers();
        mb2.printMembers();

        MusicBand.transferMembers(mb1, mb2);

        mb1.printMembers();
        mb2.printMembers();
    }
}
