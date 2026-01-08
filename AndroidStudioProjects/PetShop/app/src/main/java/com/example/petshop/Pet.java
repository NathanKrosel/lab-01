import java.util.Date;

public abstract class Pet {
    String name;
    Date birthDate;

    public Pet(String name) {
        Date date = new Date();
    }

    public Pet(String name, Date birthDate) {

    }

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    //public Pet getPet() {
      //  return pet;
    //}

    //public void setPet(Pet pet) {
      //  this.pet = pet;
    //}
}
