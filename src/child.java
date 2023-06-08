 class child implements  Temp{
     @Override
     public void print() {
         System.out.println("i am printing");
     }

     @Override
     public void talk() {
         System.out.println("i am walking");
     }
     public static void main(String[] args){
         child s= new child();
         s.print();
         s.talk();
       //  s.king();
     }
 }
