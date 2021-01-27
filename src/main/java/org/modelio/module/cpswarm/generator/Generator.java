package org.modelio.module.cpswarm.generator;

import java.io.File;

public abstract class Generator {
    private String currentIndent = "";

    private String defaultIndent = "\t";

    protected StringBuffer content = new StringBuffer();

    protected File file = null;

    protected void addLine(String line) {
        this.content.append(this.currentIndent + line + "\r\n");
    }

    protected void addEmptyLine() {
        this.content.append("\r\n");
    }

    protected void increaseIndent() {
        this.currentIndent += this.defaultIndent;
    }

    protected void decreaseIndent() {
        this.currentIndent = this.currentIndent.replaceFirst(this.defaultIndent, "");
    }

    public void setFile(File file) {
        this.file = file;
    }

}
