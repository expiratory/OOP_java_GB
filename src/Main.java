public class Main {
    public static void main(String[] args) {
//        Cat pushok = new Cat("Пушок");
//        Animal anotherCat = new Cat("Мурка");
//        System.out.println(pushok);
//        System.out.println(anotherCat.voice());
//        System.out.println(pushok.voice());
//        Animal animal = new Animal("Животное");
//        System.out.println(animal.voice());

        Person first = new Person("Вася");
        Person second = new Person("Миша");
        Person third = new Person("Маша");
        Person forth = new Person("Человек для Маши");

        first.appendToFamily(second);
        first.appendToFamily(third);
        first.appendToFamily(null);
        view(first);
    }

    public static void view(Person rootPerson){
        System.out.println(rootPerson);
        for (Person person : rootPerson.getFamily()){
            view(person);
        }
    }
}
