package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SitemapsFileType extends LanguageFileType {
    public static final SitemapsFileType INSTANCE = new SitemapsFileType();

    private SitemapsFileType() {
        super(SitemapsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Openhab2 Sitemaps File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Sitemaps language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "sitemap";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SitemapsIcons.FILE;
    }
}
