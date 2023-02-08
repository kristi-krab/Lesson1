public class Person {
    String fullName ;
    int age ;
    public Person(){
    }
    public Person(String fullName1, int age1){
        fullName = fullName1;
        age = age1;
    }
    public void move(String fullName2){
        System.out.println(fullName2 +" говорит:");
    }
    public void talk(String fullName2) {
        System.out.println(fullName2 +" говорит:");
    }
}
