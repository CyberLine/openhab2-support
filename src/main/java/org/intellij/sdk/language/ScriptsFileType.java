package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ScriptsFileType extends LanguageFileType {
    public static final ScriptsFileType INSTANCE = new ScriptsFileType();

    private ScriptsFileType() {
        super(ScriptsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Openhab2 Scripts File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Scripts language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "scripts";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ScriptsIcons.FILE;
    }
}
