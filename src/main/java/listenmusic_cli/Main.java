package listenmusic_cli;


import java.io.File;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        final String path = "/home/saydum/Music/";
        List<String> fileList;

        File files = new File(path);
        fileList = List.of(Objects.requireNonNull(files.list()));

        System.out.println("mplayer " + path + fileList.get(0));

    }
}

