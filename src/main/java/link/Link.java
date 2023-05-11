package link;

import file.File;

public class Link implements File {
    private String name;
    private File linkedFile;

    public Link(String name, File linkedFile) {
        this.name = name;
        this.linkedFile = linkedFile;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return linkedFile.getSize();
    }
}
