package Lesson7_LambdaExpressions;

public enum Gender {
    Male("Male"), Female("Female");

    String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "gender= " + super.toString();
    }
}
