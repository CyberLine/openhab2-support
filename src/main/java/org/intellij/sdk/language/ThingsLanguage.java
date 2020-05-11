package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class ThingsLanguage extends Language {
    public static final ThingsLanguage INSTANCE = new ThingsLanguage();

    private ThingsLanguage() {
        super("Things");
    }
}