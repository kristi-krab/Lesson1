public class Main {
    public static void main(String[] args) {
        Phone instance1 = new Phone("+7-834-955-35-35", "Xiomi", 170);
        Phone instance2 = new Phone("+7-877-595-35-66", "Honor", 162);
        Phone instance3 = new Phone("+7-800-759-78-66", "Huawei", 211);

        instance1.receiveCall("Кристина");
        System.out.println(instance1.getNumber());
        instance2.receiveCall("Алена");
        System.out.println(instance2.getNumber());
        instance3.receiveCall("Никита");
        System.out.println(instance3.getNumber());

        String[] sentNumber = new String[]{"+7-740-759-78-66","+7-900-759-90-66","+7-740-759-33-55","+7-740-245-78-61","+7-767-759-12-23"};
        instance1.sendMessage(sentNumber);
        //№2
        Person p1 = new Person();
        Person p2 = new Person("Кристина", 17);
        p2.move(p2.fullName);
        p2.talk(p2.fullName);
    }
}