import java.util.ArrayList;

public class Category {
    private ArrayList<Menu> menus;
    private String          name;
    private String          desc;

    public Category(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.menus = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

}
