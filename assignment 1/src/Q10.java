public class Q10 {
    public static class Flower {
        private String name;
        private int numberOfPetals;
        private float price;
        public Flower(String name,int numberOfPetals,float price) {
            this.name = name;
            this.numberOfPetals = numberOfPetals;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public int getNumberOfPetals() {
            return numberOfPetals;
        }
        public float getPrice() {
            return price;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setNumberOfPetals(int numberOfPetals) {
            this.numberOfPetals = numberOfPetals;
        }
        public void setPrice(float price) {
            this.price = price;
        }
        public static void main(String[] args) {
            Flower[] flowers = new Flower[2];
            flowers[0] = new Flower("yasmen",5,700);
            flowers[1] = new Flower("jore",12,1000);

            for (int i = 0; i < flowers.length; i++) {
                System.out.println("flowers name: "+flowers[i].getName());
                System.out.println("flowers number Of Petals: "+flowers[i].getNumberOfPetals());
                System.out.println("flowers price: "+flowers[i].getPrice());
                System.out.println("----------------------");
            }
        }
    }
}
