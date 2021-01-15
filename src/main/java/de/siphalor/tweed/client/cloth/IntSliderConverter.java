package de.siphalor.tweed.client.cloth;

import de.siphalor.tweed.config.entry.ValueConfigEntry;
import de.siphalor.tweed.tailor.ClothTailor;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.text.TranslatableText;

public class IntSliderConverter implements ClothTailor.EntryConverter<Integer>{
    final int min, max;

    public IntSliderConverter(String[] args) {
        min = Integer.parseInt(args[0]);
        max = Integer.parseInt(args[1]);
    }

    @Override
    public AbstractConfigListEntry<?> convert(ValueConfigEntry<Integer> entry, ConfigEntryBuilder builder, String s) {
        return builder.startIntSlider(new TranslatableText(s), entry.getMainConfigValue(), min, max)
            .setDefaultValue(entry.getDefaultValue())
            .setSaveConsumer(entry::setMainConfigValue)
            .build();
    }
}
