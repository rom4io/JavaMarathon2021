package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<MusicBand>();

        bands.add(new MusicBand("1", 1986));
        bands.add(new MusicBand("2", 2014));
        bands.add(new MusicBand("3", 1999));
        bands.add(new MusicBand("4", 2000));
        bands.add(new MusicBand("5", 1945));
        bands.add(new MusicBand("6", 2021));
        bands.add(new MusicBand("7", 1763));
        bands.add(new MusicBand("8", 2002));
        bands.add(new MusicBand("9", 2016));
        bands.add(new MusicBand("410", 1913));

        Collections.shuffle(bands);

        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bands1 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() >= 2000) bands1.add(bands.get(i));
        }
        return bands1;
    }

}

