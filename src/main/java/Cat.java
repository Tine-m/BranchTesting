public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miauv miauv");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood() {
        System.out.println("hvæser");
    }
}
