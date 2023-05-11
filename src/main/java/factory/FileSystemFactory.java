package factory;

import file.File;

public interface FileSystemFactory {
    File createNormalFile(String name, int size);
    File createLink(String name, File linkedFile);
    File createFolder(String name);
}
