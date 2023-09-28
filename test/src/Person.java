public class Person {
    private int age;
    private String type;

    public Person(int age, String type) {
        this.age = age;
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public int account(Person person) {
        int cost = 0;
        if (person.age < 0)
            cost = -1;
        else {
            if (person.age >= 0 && person.age <= 12) {
                if (person.type == "NORMAL")
                    cost = 2000000;
                else if (person.type == "BUSINESS")
                    cost = 3000000;
                else if (person.type == "VIP")
                    cost = 4000000;
            } else {
                if (person.type == "NORMAL")
                    cost = 3200000;
                else if (person.type == "BUSINESS")
                    cost = 4200000;
                else if (person.type == "VIP")
                    cost = 5000000;
            }
        }
        return cost;
    }
}