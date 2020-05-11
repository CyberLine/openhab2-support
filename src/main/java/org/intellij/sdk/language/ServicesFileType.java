package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ServicesFileType extends LanguageFileType {
    public static final ServicesFileType INSTANCE = new ServicesFileType();

    private ServicesFileType() {
        super(ServicesLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Openhab2 Services File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Services language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "services";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ServicesIcons.FILE;
    }
}
