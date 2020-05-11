package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ThingsFileType extends LanguageFileType {
    public static final ThingsFileType INSTANCE = new ThingsFileType();

    private ThingsFileType() {
        super(ThingsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Openhab2 Things File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Things language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "things";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ThingsIcons.FILE;
    }
}
