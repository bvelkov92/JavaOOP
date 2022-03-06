package Animal;

public abstract class Animal {
    private  int age;
    private  String name;
    private  String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }
    public abstract String produceSound();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(this.getClass().getSimpleName())
                .append(System.lineSeparator());

        output.append(this.name)
                .append(" ")
                .append(this.age)
                .append(" ")
                .append(this.gender)
                .append(System.lineSeparator());

        output.append(this.produceSound());

        return output.toString();
    }
}
