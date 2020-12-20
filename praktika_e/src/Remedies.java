public abstract class Remedies extends Product  {
private String manufacturer;
private String material;
private String size;
private String color;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        switch (size){
            case ("S"):
                this.size = size;
            case ("M"):
                this.size = size;
            case ("L"):
                this.size = size;
            case ("XL"):
                this.size = size;
            case ("XXL"):
                this.size = size;
            default:
                System.out.println("Есть только размеры от S до XXL");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
