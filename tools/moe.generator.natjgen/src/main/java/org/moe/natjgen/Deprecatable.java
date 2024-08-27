package org.moe.natjgen;

public interface Deprecatable {

    /**
     * Tells whether the element is deprecated or not
     *
     * @return true if deprecated otherwise false
     */
    boolean isDeprecated();

    /**
     * Sets the element's deprecated property
     *
     * @param isDeprecated true if deprecated otherwise false
     */
    void setDeprecated(boolean isDeprecated);
}
