package PROJ1;

public class Pizza {
    private int price=0;;
    private Boolean isVeg=false;;
    private String bill="";
    private int vegBasePrice=300;
    private int nonVegBasePrice=400;
    private int vegExtraToppings=100;
    private int nonVegextraToppings=100;
    private int ExtraCheese=100;
    private int takeAway=20;
    private boolean addExtraCheese=false;
    private boolean addExtraToppings=false;
    private boolean addTakeaway=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
       if(isVeg==true){
        this.price+=vegBasePrice;
        this.bill=bill+"Veg Pizza Base Price:"+vegBasePrice+"\n";
       }
       else{
        price+=nonVegBasePrice;
        this.bill=bill+"Non Veg Pizza Base Price:"+nonVegBasePrice+"\n";
       }

    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(addExtraCheese==false)
        {
            this.price+=ExtraCheese;
            addExtraCheese=true;
        }
    }

    public void addExtraToppings(){
       
        if(addExtraToppings==false)
        {
            if(isVeg==false)
            {
                this.price+=vegExtraToppings;

            }
            else{
                this.price+=nonVegextraToppings;
            }
            addExtraToppings=true;
        }
    }

    public void addTakeaway(){
       if(addTakeaway==false)
       {
        this.price+=takeAway;
        addTakeaway=true;
       }
    }

    public String getBill(){
        if(addExtraCheese==true)
        {
            this.bill+="Extra Cheese added : "+ExtraCheese+"\n";
        }
        if(addExtraToppings==true)
        {
            if(isVeg==true)
            {
                this.bill+="Extra Toppings added : "+vegExtraToppings+"\n";
            }
            else{
                this.bill+="Extra Toppings added : "+nonVegextraToppings+"\n";
            }
        }
        if(addTakeaway==true)
        {
            this.bill+="Takeaway added : "+takeAway+"\n";
        }
        return this.bill+"Total Amount inc Tax: "+this.price+"\n";
    }
}

