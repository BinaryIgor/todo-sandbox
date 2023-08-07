/*
 * This file is generated by jOOQ.
 */
package com.jakub.todoSandbox.jooq.enums;


import com.jakub.todoSandbox.jooq.Tododb;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum PriorityEnum implements EnumType {

    LOW("LOW"),

    MEDIUM("MEDIUM"),

    HIGH("HIGH");

    private final String literal;

    private PriorityEnum(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Tododb.TODODB;
    }

    @Override
    public String getName() {
        return "priority_enum";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static PriorityEnum lookupLiteral(String literal) {
        return EnumType.lookupLiteral(PriorityEnum.class, literal);
    }
}