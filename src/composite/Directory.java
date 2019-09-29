package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

    private List<File> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + this.getName());
        children.forEach(File::ls);
    }

    @Override
    public void addFile(File file) {
        children.add(file);
    }

    @Override
    public boolean removeFile(File file) {
        return children.remove(file);
    }

    @Override
    public List<File> getFiles() {
        return children;
    }
}
