import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;
    public Box() {
        this.fruits = new ArrayList<>();
    }


    public ArrayList getBox(){
        return fruits;
    }
    //Добавление фрукта
    public void addFruit(T fruit){
        if (fruits.isEmpty() || fruits.get(0).getClass() == fruit.getClass()) {
            fruits.add(fruit);
        }
    }

    //Метод высчитывает вес коробки
    public void getWeight(){
        float weight = 0;
        for(T fruit: fruits ){
            weight += fruit.getWeight();
        }
        System.out.println("Вес коробки:"+weight);
    }
    //Нужен чтобы вычеслить вес внутри и вернуть значение. Используется внутри другого метода
    private double getWeightDobule(){
        double weight = 0;
        for(T fruit: fruits ){
            weight += fruit.getWeight();
        }
        return weight;
    }
    //Сравнивает веса коробок
    public boolean compare(Box<T> box){

        if(getWeightDobule() == box.getWeightDobule()) {
            return true;

        } else {
            return false;
        }
    }
    //Пересыпает фрукты из ящика в ящик.
    public void sprinkleFruit(Box<T> box){
        ArrayList<T> fruitsFromBoxes = new ArrayList<>(box.fruits);
        try {
            if (this.fruits.get(0).getClass() == fruitsFromBoxes.get(0).getClass()){

                this.fruits.addAll(fruitsFromBoxes);
                box.fruits.clear();
            }

            else {
                System.out.println("В коробках разные фрукты");

            }
        } catch (IndexOutOfBoundsException e) {
        }

    }





}
