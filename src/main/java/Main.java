import adapter.FolderAdapter;
import factory.FileSystemFactory;
import factory.UnixFileSystemFactory;
import file.File;
import file.NormalFile;
import folder.Folder;
import link.Link;

public class Main {
    public static void main(String[] args) {
        File file1 = new NormalFile("Archivo1.txt", 10);

        // Crear un directorio vacío
        Folder folder1 = new Folder("Directorio1");

        // Crear un enlace al archivo normal
        File file2 = new Link("Enlace a Archivo1.txt", file1);

        // Agregar los archivos al directorio
        folder1.addFile(file1);
        folder1.addFile(file2);

        // Tratar el directorio como si fuera un archivo
        File folderAdapter = new FolderAdapter(folder1);
        System.out.println("Nombre del directorio: " + folderAdapter.getName() );
        System.out.println("Tamaño del directorio: " + folderAdapter.getSize());

        FileSystemFactory factory = new UnixFileSystemFactory();

        // Crear un archivo normal
        File file3 = factory.createNormalFile("Archivo1.txt", 10);

        // Crear un directorio vacío
        File folder2 = factory.createFolder("Directorio1");

        // Crear un enlace al archivo normal
        File file4 = factory.createLink("Enlace a Archivo1.txt", file1);

        // Agregar los archivos al directorio
        ((Folder)folder1).addFile(file1);
        ((Folder)folder1).addFile(file2);

        // Tratar el directorio como si fuera un archivo
        File folderAdapter2 = new FolderAdapter((Folder)folder1);
        System.out.println("Tamaño del directorio: " + folderAdapter.getSize());
    }
}
