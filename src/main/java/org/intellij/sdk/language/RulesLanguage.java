package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class RulesLanguage extends Language {
    public static final RulesLanguage INSTANCE = new RulesLanguage();

    private RulesLanguage() {
        super("Rules");
    }
}