package inheritance.sample;

class Sub extends Super {
    public  void showData(){
        System.out.println("x value is: "+this.getX());
        System.out.println("y value is: "+this.getY());
    }
}
