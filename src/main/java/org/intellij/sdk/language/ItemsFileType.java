package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ItemsFileType extends LanguageFileType {
    public static final ItemsFileType INSTANCE = new ItemsFileType();

    private ItemsFileType() {
        super(ItemsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Openhab2 Items File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Items language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "items";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ItemsIcons.FILE;
    }
}
