public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] Persons;
        Persons = new Person[3];

        Persons[0] = new Person( "Sam Arguello");
        Persons[1] = new Person( "Jen Stevens");
        Persons[2] = new Person( "Mia Arguello");
        Person amy = new Person("Amy Arguello");



        Person[] newPersonsArr = addPersons(Persons, amy);
        System.out.println(newPersonsArr.toString());

        for (Person person : newPersonsArr){
            System.out.println(person.getName());
        }
    }

    public static Person[] addPersons(Person[] persons, Person person){
        int personLength = persons.length;
        Person[] newPersonArr = new Person[personLength + 1];

        // can replace the for loop
//        System.arraycopy(persons, 0, newPersonArr, 0, personLength);

        for (int i = 0; i < personLength; i++){
            newPersonArr[i] = persons[i];
        }
        newPersonArr[personLength] = person;
        return newPersonArr;
    }
}

