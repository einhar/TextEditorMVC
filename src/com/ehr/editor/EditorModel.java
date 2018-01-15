package com.ehr.editor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EditorModel {

    public void save(TextFile textFile) {
        try {
            Files.write(textFile.getPath(), textFile.getContent(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public IOResult<TextFile> load(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            return new IOResult<TextFile>(true, new TextFile(path, lines));
        } catch (IOException e) {
            e.printStackTrace();
            return new IOResult<>(false,null);
        }
    }

    public void close() {
        System.exit(0);
    }


}
