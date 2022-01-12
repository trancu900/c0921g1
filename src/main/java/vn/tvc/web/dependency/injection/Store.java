package vn.tvc.web.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Store {
    private Item item;

    public Store(Item item){
       this.item=item;
    }

    @Override
    public String toString() {
        return "Store{" +
                "item=" + item +
                '}';
    }
}
