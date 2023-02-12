public class Phone {
    String number;
    String model;
    int weight;
    public Phone(String phoneNumber, String phoneModel, int phoneWeight) {
        this(phoneNumber, phoneModel);
        weight = phoneWeight;
        System.out.print(phoneNumber + " " +  phoneModel + " ");
        System.out.print(phoneWeight + "\n");
    }
    public void receiveCall(String receive) {
        System.out.println("Звонит:" + receive);
    }
    public String getNumber() {
        return number;
    }
    public Phone(String phoneNumber, String phoneModel) {
        number = phoneNumber;
        model = phoneModel;
    }
    public Phone() {
    }
    public void receiveCall(String receive,String phoneNumber) {
        System.out.println("Звонит:" + receive + phoneNumber);
    }
    public void sendMessage(String[] sentNumber) {
        System.out.println("Сообщения отправлены на номера:");
        for (String Number:sentNumber){
            System.out.println(Number+",");
        }
    }
}
