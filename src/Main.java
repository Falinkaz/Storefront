import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String welcome = "Add the giftcard balance (must be a whole number > 0):";
        String addArticle = "Enter the purchase description:";
        String pickOption = "Type 0 to continue, 1 to checkout:";
        String addPrice = "Enter the article price (must be whole number > 0):";
        Scanner keyboard = new Scanner(System.in);
        System.out.println(welcome);
        int balance = keyboard.nextInt();
        int option = 0;
        ArrayList<Product> articlesList = new ArrayList<>();

        while(option == 0){
            System.out.println(addArticle);
            keyboard.nextLine(); // Swallowing the previous token
            String article = keyboard.nextLine();
            System.out.println(addPrice);
            int price = keyboard.nextInt();
                if(balance - price < 0){
                    System.out.println("Unable to add purchase, insufficient balance! Balance is: "+balance);
                } else {
                    balance = balance - price;
                    var purchase = new Product(article, price);
                    articlesList.add(purchase);
                }
            System.out.println("New balance is : "+balance);
            System.out.println(pickOption);
            option = keyboard.nextInt();
                switch (option){
                    case 1:
                        System.out.println(articlesList);
                }
        }

    }

}
