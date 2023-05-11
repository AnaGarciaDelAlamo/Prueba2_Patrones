package adapter;

import file.File;
import folder.Folder;

public class FolderAdapter implements File {
    private Folder folder;

    public FolderAdapter(Folder folder) {
        this.folder = folder;
    }

    public String getName() {
        return folder.getName();
    }

    public int getSize() {
        return folder.getSize();
    }
}
