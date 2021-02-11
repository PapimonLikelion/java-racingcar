package racingcar.model;

import java.util.Objects;

public class Name {
    private static final int NAME_LEN = 5;

    private final String name;

    public Name(final String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(final String name) {
        if (name.length() > NAME_LEN) {
            throw new IllegalArgumentException("[Error] 자동차 이름은 5자 이하여야 합니다.\n");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
