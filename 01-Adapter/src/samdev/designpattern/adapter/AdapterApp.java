package samdev.designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterApp {
    public static void main(String[] args) {
        List<CatalogAdapter> list = new ArrayList<>();
        list.add(new BookCatalogAdapter(new Book("Pemrograman Java", "Sam")));
        list.add(new BookCatalogAdapter(new Book("Pemrograman PHP", "Dev")));
        list.add(new BookCatalogAdapter(new Book("Pemrograman Python", "Sammi")));

        list.add(new ScreencastCatalogAdapter(new Screencast("Web Laravel", "Sam", 100l)));
        list.add(new ScreencastCatalogAdapter(new Screencast("Web Codeignter", "Sam", 100l)));
        list.add(new ScreencastCatalogAdapter(new Screencast("Flask", "Sam", 100l)));

        // display title by author
        list.forEach(item -> {
            System.out.println(item.getCatalogTitle());
        });
    }
}
