public class Main {
    public static void main(String[] args) {

        int weight = 100;
        while (weight > 50) {
            weight = weight - 5;
            System.out.println(weight);
        }
        System.out.println(new Color("Yellow"));
        System.out.println(calculatedNumber(11));

    }
    public static int calculatedNumber(int number){
        number = number*number;
        return number;
    }
}