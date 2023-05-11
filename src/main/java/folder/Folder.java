package folder;
import file.File;

import java.util.ArrayList;
import java.util.List;



public class Folder implements File {
    private String name;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int totalSize = 0;
        for (File file : files) {
            totalSize += file.getSize();
        }
        return totalSize;
    }

}