package za.ac.mycput.Entity;

public class ProductReport {
    private int id;
    private String date ;
    private double total;
    private int quantity;
    private int itemSoldId;

    public ProductReport() {
    }
    public ProductReport(Builder builder) {
        this.id = builder.id;
        this.date= builder.date;
        this.total = builder.total;
        this.itemSoldId= builder.itemSoldId;
        this.quantity = builder.quantity;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemSoldId() {
        return itemSoldId;
    }

    public void setItemSoldId(int itemSoldId) {
        this.itemSoldId = itemSoldId;
    }

    @Override
    public String toString() {
        return "ProductReport{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", total=" + total +
                ", quantity=" + quantity +
                ", itemSoldId=" + itemSoldId +
                '}';
    }
    public static class Builder {
        private int id;
        private String date ;
        private double total;
        private int quantity;
        private int itemSoldId;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setTotal(double total) {
            this.total = total;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
        public Builder setItemSoldId(int itemSoldId) {
            this.itemSoldId = itemSoldId;
            return this;
        }

        public Builder copy(ProductReport productReport){
            this.id= productReport.id;
            this.date = productReport.date;
            this.quantity = productReport.quantity;
            this.total = productReport.total;
            this.itemSoldId= productReport.itemSoldId;


            return this;
        }
        public ProductReport build(){
            return new ProductReport(this);
        }
    }
}