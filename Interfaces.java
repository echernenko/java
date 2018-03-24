interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    public static void main(String[] args) {
        Gorilla benny = new Gorilla();
        benny.pet();
    }
    public boolean feed(boolean timeToEat) {
      // put gorilla food into cage
      return true;
    }
    public void groom() {
      // lather, rinse, repeat
    }
    public void pet() {
      // pet at your own risk
      System.out.println("Petting Gorilla");
    }
}
