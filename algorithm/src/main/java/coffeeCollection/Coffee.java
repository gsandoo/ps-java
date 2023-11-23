package coffeeCollection;

public class Coffee {
    private String name; // 이름
    private int count; // 수량
    private int price; // 가격

    public Coffee(String name, int count, int price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    // iterator로 호출해서 하나씩
    public void printItem(){
        if (name == "latte"){
            System.out.println("    "+ name+ "   " + count + "       " + price);
        }else if (name == "espresso"){
            System.out.println(" "+ name+ "   " + count + "       " + price);
        }else System.out.println(name+ "   " + count + "       " + price);
    }


}
