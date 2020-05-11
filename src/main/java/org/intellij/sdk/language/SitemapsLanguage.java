package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class SitemapsLanguage extends Language {
    public static final SitemapsLanguage INSTANCE = new SitemapsLanguage();

    private SitemapsLanguage() {
        super("Sitemaps");
    }
}