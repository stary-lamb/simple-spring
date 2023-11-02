package com.example.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 柒加壹
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValue() {
        return this.propertyValueList.toArray(propertyValueList.toArray(new PropertyValue[0]));
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
