package factory;

import file.File;
import file.NormalFile;
import folder.Folder;
import link.Link;

public class UnixFileSystemFactory implements FileSystemFactory{
    public File createNormalFile(String name, int size) {
        return new NormalFile(name, size);
    }

    public File createLink(String name, File linkedFile) {
        return new Link(name, linkedFile);
    }

    public File createFolder(String name) {
        return new Folder(name);
    }
}
