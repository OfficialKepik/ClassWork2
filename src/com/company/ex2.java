package com.company;

public class ex2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20, 50};
        int[] moneyCount = {0, 0, 0, 0, 0, 0};
        int summ = 0;
        int money = 76; // - сумма сдачи
        while (money > 0) {
            for (int i = arr.length-1; i >= 0; ) {
                if (money - arr[i] >= 0) {
                    money -= arr[i];
                    summ += arr[i];
                    moneyCount[i]++;
                } else {
                    i--;
                }
                //System.out.println(summ);
            }
        }
        //System.out.println(Arrays.toString(moneyCount));
        System.out.println(" Change = " + summ + " копеек");
        for (int i = 0; i < moneyCount.length; i++) {
            if (moneyCount[i] < 2) {
                System.out.println(arr[i] + " - " + moneyCount[i] + " coin");
            } else {
                System.out.println(arr[i] + " - " + moneyCount[i] + " coins");
            }
        }
    }
}