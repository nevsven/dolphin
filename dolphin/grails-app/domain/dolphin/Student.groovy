package dolphin

class Student {

    String name
    String sex
    Integer age

    static constraints = {
        name nullable: false,size: 3..40
    }
}
