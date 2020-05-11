package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class ItemsLanguage extends Language {
    public static final ItemsLanguage INSTANCE = new ItemsLanguage();

    private ItemsLanguage() {
        super("Items");
    }
}