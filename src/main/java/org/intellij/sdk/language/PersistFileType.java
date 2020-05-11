package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PersistFileType extends LanguageFileType {
    public static final PersistFileType INSTANCE = new PersistFileType();

    private PersistFileType() {
        super(PersistLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Openhab2 Persist File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Persist language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "persist";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return PersistIcons.FILE;
    }
}
