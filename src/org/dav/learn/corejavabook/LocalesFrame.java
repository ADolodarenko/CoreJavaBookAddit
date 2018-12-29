package org.dav.learn.corejavabook;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class LocalesFrame extends JFrame
{
    private JComboBox<String> localesCombo;

    public LocalesFrame()
    {
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.EAST;
        add(new JLabel("Locales:"), constraints);

        initLocalesCombo(getLocales(), Locale.getDefault().getDisplayName());

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        add(localesCombo, constraints);

        pack();
    }

    private Locale[] getLocales()
    {
        Locale[] locales = Locale.getAvailableLocales().clone();
        Arrays.sort(locales, Comparator.comparing(Locale::getDisplayName));

        return locales;
    }

    private void initLocalesCombo(Locale[] locales, String defaultLocaleName)
    {
        localesCombo = new JComboBox<>();
        for (Locale locale : locales)
            localesCombo.addItem(locale.getDisplayName());
        localesCombo.setSelectedItem(defaultLocaleName);
    }
}
