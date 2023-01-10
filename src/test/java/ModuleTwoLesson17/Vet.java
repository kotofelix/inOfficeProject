/*
Создайте класс Vet. Класс содержит параметр:

- name - имя ветеринара

Класс содержит методы:

- void treatAnimal(Animal animal) - осуществляет прием у ветеринара, вылечивает здоровье животного
 */

package ModuleTwoLesson17;

public class Vet {
    String name;        // имя ветеринара

    public Vet(String name) {
        this.name = name;
    }

    void treatAnimal(Animal animal) {
        if (animal.health.equals(HealthState.HEALTHY)) {
            System.out.println("Животное здорово");
        } else {
            animal.health = HealthState.HEALTHY;
            System.out.println("Животное вылечено");
        }

    }
}
