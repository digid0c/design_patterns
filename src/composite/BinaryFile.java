package composite;

import java.util.List;

public class BinaryFile extends File {

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(String.format("File %s with size %d bytes", this.getName(), size));
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Add file operation is not supported by BinaryFile!");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Remove file operation is not supported by BinaryFile!");
    }

    @Override
    public List<File> getFiles() {
        throw new UnsupportedOperationException("Get files operation is not supported by BinaryFile!");
    }
}
