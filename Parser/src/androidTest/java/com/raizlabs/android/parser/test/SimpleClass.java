package com.raizlabs.android.parser.test;

import com.raizlabs.android.parser.FieldParseable;
import com.raizlabs.android.parser.Parser;
import com.raizlabs.android.parser.core.Key;
import com.raizlabs.android.parser.core.Parseable;

/**
 * Author: andrewgrosner
 * Contributors: { }
 * Description:
 */
@Parseable
public class SimpleClass implements FieldParseable {

    @Key
    String name;

    @Override
    public void parse(Object dataInstance, Parser parser) {
        name = (String) parser.getValue(dataInstance, "name");
    }
}
