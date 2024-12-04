package chapter01.domain;

import java.util.Objects;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, String model, Type type,
                      int numStrings, Wood backWood, Wood topWood) {

        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GuitarSpec otherSpec)) return false;
        if (builder != otherSpec.getBuilder()) return false;

        if (model != null &&
                !model.isEmpty() &&
                !model.isBlank() &&
                !getModel().equalsIgnoreCase(otherSpec.getModel()))
            return false;

        if (type != otherSpec.getType()) return false;
        if (numStrings != otherSpec.getNumStrings()) return false;
        if (backWood != otherSpec.getBackWood()) return false;
        if (topWood != otherSpec.getTopWood()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBuilder(), getModel(), getType(), getNumStrings(), getBackWood(), getTopWood());
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }
}
