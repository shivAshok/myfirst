public class Nomalpizza {
 private int price;
    String name;
    Nomalpizza(int prize,String name){
        System.out.println("creater");
        this.price=prize;
        this.name=name;
    }
    void print(){
        System.out.println("i am parent");
    }
    int getprice(){
        return this.price;
    }
    void setprice(int i){
        if(i>2) {
            this.price = 200;
        }
    }
}
