import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    public String name;
    public ArrayList<Song> list = new ArrayList<Song>();
    public int id;

    public Playlist(String name) {
        this.name = name;


    }
    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void addSong(Song song) {
        list.add(song);
    }

    public String[] songNames(){
        int len = list.size();
        String[] songNames = new String[len];
        for(int i = 0; i < len; i++) {
            songNames[i] = list.get(i).title;
        }
        return songNames;
    }

    public int totalDuration() {
        int duration = 0;
        for(int i = 0; i < list.size(); i++) {
            duration += list.get(i).durationInSeconds;
        }
        return duration;
    }

    public void swap(Song a, Song b) {
        int idxA = 0;
        int idxB = 0;
        for(int i = 0; i < list.size(); i++) {
            if(a == list.get(i)) {
                idxA = i;
            } else if(b == list.get(i)) {
                idxB = i;
            }
        }
        Collections.swap(list, idxA, idxB);
    }

    public void removeSong(Song song) {
        int idx = 0;
        for(int i = 0; i < list.size(); i++) {
            if(song == list.get(i)) {
                idx = i;
            }
        }
        list.remove(idx);
    }

}
