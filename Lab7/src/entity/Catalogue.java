package entity;

import java.util.List;

/**
 * todo Document type Catalogue
 */
public class Catalogue {
    String name;
    List<Item> items;

    public Catalogue(String name, List<Item> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }
}
