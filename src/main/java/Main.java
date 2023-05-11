import adapter.FolderAdapter;
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
        System.out.println("Nombre del directorio: " + folderAdapter.getName());
        System.out.println("Tamaño del directorio: " + folderAdapter.getSize());
    }
}
