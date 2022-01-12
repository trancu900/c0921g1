package vn.tvc.web.dependency.injection;

import org.springframework.context.annotation.Bean;

public class ItemImpl implements Item {
    public String name;

    public ItemImpl(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ItemImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
