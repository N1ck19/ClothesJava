package clothesBuilder;


public class clothes {
    
    private String clothesType;
    private double price;
    private boolean goodQuality;
    private String color;
    private double taxed;
    
    // These parameter variables become the private ones above.
    public clothes(String clothing, double p, boolean gQual, String c) {
        
        clothesType = clothing;
        price = p;
        goodQuality = gQual;
        color = c;
        
        
    }
    
    public String getClothes() {
        
        return clothesType;
        
    }
    
    public double getPrice() {
        
       return price;
        
    }
    
    public boolean getQuality() {
        
        return goodQuality;
    }
    
    public String getColor() {
        
        return color;
        
    }
    
    public double priceWithTax() {
        
        taxed = price + (price * 0.07);
        taxed = (taxed * 100);
        taxed = (int)taxed;
        taxed = (double)(taxed / 100);
        return taxed;
        
    }

    public void clothesInfo() {
        
        System.out.println("So, this "
                + getColor() + " " + getClothes() +
                " is " + getPrice() + 
                ".\nIn good quality? " + getQuality() + 
                "\nPrice with tax: " + priceWithTax() + "\n");
        
    }
    
    public static void main(String[] args) {
        
        clothes redShirt = new clothes("shirt", 14.99, true, "red");
        redShirt.clothesInfo();
        
        // Also, if you're referring to pants/jeans, write "pair of" before
        // the clothing name.
        
        clothes jeans = new clothes("pair of jeans", 24.99, true, "blue");
        jeans.clothesInfo();
        
        clothes badTShirt = new clothes("shirt", 4.99, false, "white");
        badTShirt.clothesInfo();
    }
}
