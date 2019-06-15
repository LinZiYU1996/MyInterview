package Thread.AtomicClass.AtomicReferenceDemo;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:08 2019/6/15
 */
public class AtomicReferenceTest {

    public static void main(String[] args) {

        AtomicReference<Person> ar = new AtomicReference<Person>();

        Person person = new Person("SO",11);

        ar.set(person);

        Person updatePerson = new Person("NN",20);

        ar.compareAndSet(person,updatePerson);

        System.out.println( ar.get().getName());

        System.out.println( ar.get().getAge());

    }
}

class Person{

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
