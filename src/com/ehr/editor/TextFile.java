package com.ehr.editor;

import java.nio.file.Path;
import java.util.List;

public class TextFile {

    private final Path path;

    private final List<String> content;

    public TextFile(Path path, List<String> content) {
        this.path = path;
        this.content = content;
    }

    public Path getPath() {
        return path;
    }

    public List<String> getContent() {
        return content;
    }
}
