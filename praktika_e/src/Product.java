public class Product {
    private String article_product;
    private String name;
    private Double price;
    private Integer qte_in_stock;

    public String getArticle_product() {
        return article_product;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQte_in_stock() {
        return qte_in_stock;
    }

    public void setQte_in_stock(Integer qte_in_stock) {
        if (qte_in_stock < 0) {
            System.out.println("Количество товаров не может быть отрицательным");
        }
            else if(qte_in_stock == 0){
        System.out.println("Товара нет в наличии");
        } else {
            this.qte_in_stock = qte_in_stock;
        }
    }

    public void setPrice(Double price) {
        if (price <= 0) {
            System.out.println("цена не может быть отрицательной или равняться нулю");
        }
        else {
            this.price = price;
        }
    }

}
