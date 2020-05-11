package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class ScriptsLanguage extends Language {
    public static final ScriptsLanguage INSTANCE = new ScriptsLanguage();

    private ScriptsLanguage() {
        super("Scripts");
    }
}