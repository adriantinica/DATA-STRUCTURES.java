public class InsertDeletePeopleClassEx {

    public static void main(String[] args) {

       Person [] people =  new Person[3]; //created an array witch contains 3 values
       people[0] = new Person("Tinica Adrian");
       people[1] = new Person("Dorin Esinenco");
       people[2] = new Person("John Doe");

       Person newPerson = new Person("Maia Sandu");
       int indexToInsert = 1;

       Person[] newPeople = new Person[people.length + 1]; //created a new array witch contains 4 empty values;

       for(int oi = 0, ci = 0; oi < people.length; oi++ )
        {

            if( oi != indexToInsert ){
                newPeople[ ci++ ] = people[ oi ];
            }else{
                
                newPeople[ ci++ ] = newPerson;
                newPeople[ ci++ ] = people[ oi ];
                
            }
        }

        people = newPeople;

        for (Person person : people) {
            System.out.println(person.getFullName());
        }
    }
}

class Person{
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    
}