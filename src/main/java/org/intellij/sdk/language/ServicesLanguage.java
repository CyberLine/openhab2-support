package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class ServicesLanguage extends Language {
    public static final ServicesLanguage INSTANCE = new ServicesLanguage();

    private ServicesLanguage() {
        super("Services");
    }
}