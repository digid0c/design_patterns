package composite;

public class Client {

    public static void main(String[] args) {
        File root1 = createTree();
        root1.ls();

        System.out.println("------------------");

        File root2 = createSingleFileTree();
        root2.ls();
    }

    private static File createTree() {
        File directory1 = new Directory("first directory");
        File directory2 = new Directory("second directory");

        File file1 = new BinaryFile("first_file.txt", 1024);
        File file2 = new BinaryFile("second_file.txt", 2048);
        File file3 = new BinaryFile("third_file.txt", 4096);

        directory2.addFile(file2);
        directory2.addFile(file3);

        directory1.addFile(file1);
        directory1.addFile(directory2);

        return directory1;
    }

    private static File createSingleFileTree() {
        return new BinaryFile("single_file.txt", 512);
    }
}
