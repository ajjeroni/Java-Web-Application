import java.util.List;

public abstract class Category {
    private String categoryName;
    private String categoryDesc;
    private List<Product> products;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String name) {
        this.categoryName = name;
    }

    public String getCategoryDesc() {
        return categoryName;
    }

    public void setCategoryDesc(String desc) {
        this.categoryName = desc;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
