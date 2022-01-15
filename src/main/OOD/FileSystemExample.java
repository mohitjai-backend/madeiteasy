package main.OOD;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FileSystemExample {
    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();
        //-----------------------------------------------------------------
        fileSystem.mkdir("/usr/local/mohitjai/desktop1");
        fileSystem.mkdir("/usr/local/mohitjai/desktop2");
        List<String> files = fileSystem.ls("/usr/local/mohitjai/");
        for(String file : files) {
            System.out.print(file+" ");
        }
        System.out.println();
        //-----------------------------------------------------------------
        fileSystem.addContentToFile("/mohitjai/desktop3","hello1 from new directory");
        String content = fileSystem.readContentFromFile("/mohitjai/desktop3");
        System.out.println(content);

        List<String> files2 = fileSystem.ls("/mohitjai");
        for(String file : files2) {
            System.out.print(file+" ");
        }
        System.out.println();

        //-----------------------------------------------------------------

        fileSystem.mkdir("/usr/local/mohitjai/desktop3");
        fileSystem.mkdir("/usr/local/mohitjai/desktop4");

        List<String> files3 = fileSystem.ls("/usr/local/mohitjai/");
        for(String file : files3) {
            System.out.print(file+" ");
        }
        System.out.println();

        fileSystem.addContentToFile("/usr/local/mohitjai/desktop4","hello2 from old directory");
        String content2 = fileSystem.readContentFromFile("/usr/local/mohitjai/desktop4");
        System.out.println(content2);
        //-----------------------------------------------------------------
    }
}

class FileSystem {

    FileNode root;

    public FileSystem() {
        root = new FileNode("");
    }

    public List<String> ls(String path) {
        FileNode node = findNode(path, false);
        return node == null ? null : node.listSubDirectories();
    }

    public void mkdir(String path) {
        findNode(path,true);
    }

    public void addContentToFile(String filePath, String content) {
        FileNode node = findNode(filePath, true);
        node.addContent(content);
    }

    public String readContentFromFile(String filePath) {
        FileNode node = findNode(filePath, true);
        return node.readFile();
    }

    private FileNode findNode(String path, boolean make) {
        String [] nodes = path.split("/");
        FileNode fNode = root;

        for(String node : nodes) {
            if(node.isEmpty())
                continue;
            if(!fNode.getSubDirectories().containsKey(node)) {
                if(make) {
                    fNode.createSubDirectory(node);
                } else {
                    return null;
                }
            }

            fNode = fNode.getSubDirectories().get(node);
        }

        return fNode;
    }
}

class FileNode {
    private String                    name;
    private StringBuilder             file;
    private TreeMap<String, FileNode> subDirectories;

    public FileNode(String name) {
        this.name = name;
        this.file = new StringBuilder();
        this.subDirectories = new TreeMap<>();
    }

    public TreeMap<String, FileNode> getSubDirectories() {
        return this.subDirectories;
    }

    public void createSubDirectory(String pathName) {
        this.subDirectories.put(pathName, new FileNode(pathName));
    }

    public List<String> listSubDirectories() {
        List<String> list = new ArrayList<>();

        if(this.file.length() > 0){
            list.add(this.name);
        }
        else{
            list.addAll(this.subDirectories.keySet());
        }
        return list;
    }

    public void addContent(String content){
        this.file.append(content);
    }

    public String readFile(){
        return this.file.toString();
    }
}
