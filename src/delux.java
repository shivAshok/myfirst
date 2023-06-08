class Delux extends Nomalpizza{
    int step;
    Delux(int price,String name,int step){
        super(price,name);
        this.step=step;
    }
    void print(int step){
        this.step=step;
        System.out.println(this.step);
    }
    public static void main (String[] args){
      //  System.out.print(8+15);
        Delux d=new Delux(12,"shiv",23);
        d.print(22);
        d.print();
        System.out.println(d.getprice());
        d.setprice(4);
        System.out.println(d.getprice());
    }
}