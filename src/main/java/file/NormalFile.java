package file;

public class NormalFile implements File{
    private String name;
    private int size;

    public NormalFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
