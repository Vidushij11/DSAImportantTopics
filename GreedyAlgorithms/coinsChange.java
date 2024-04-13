public class coinsChange {
    public static void main(String[] args) {
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 121;
        int mincoins = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            // 410/100 = 4 10
            if (amount >= coins[i]) {
                mincoins += amount / coins[i];
                amount = amount % coins[i];
            }
        }
        System.out.println(mincoins);
    }
}
