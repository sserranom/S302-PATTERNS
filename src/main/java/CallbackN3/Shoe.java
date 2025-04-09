    package CallbackN3;

    public class Shoe {
        private String brand;
        private double size;
        private String barcode;
        private double price ;

        public Shoe(String brand, double size, String barcode, double price) {
            this.brand = brand;
            this.size = size;
            this.barcode = barcode;
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public double getSize() {
            return size;
        }

        public String getBarcode() {
            return barcode;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Shoe{" +
                    "brand='" + brand + '\'' +
                    ", size='" + size + '\'' +
                    ", barcode='" + barcode + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
