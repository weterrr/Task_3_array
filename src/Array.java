import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
            System.out.printf(" " + array[i]);
        }
        int minPolNum = Integer.MAX_VALUE;
        int maxOtrNum = Integer.MIN_VALUE;
        int numMinPol = 0;
        int numMaxNum = 0;
        for (int j = 0; j < array.length; j++){
            if (array[j] > 0 && array[j] < minPolNum){
                minPolNum = array[j];
                numMinPol = j;
            }
           else if (array[j] < 0 && array[j] > maxOtrNum) {
               maxOtrNum = array[j];
               numMaxNum = j;
            }
        }
        array[numMaxNum] = minPolNum;
        array[numMinPol] = maxOtrNum;
        System.out.println( "\n" + "Минимальное положительное: " + minPolNum + " порядковый номер (если их несколько, то первое): " + numMinPol);
        System.out.println("Максимальное отрицательное: " + maxOtrNum + " порядковый номер (если их несколько, то первое): " + numMaxNum);
        for (int a = 0; a < array.length; a++) {  //вывести на экран массив после изменений
            System.out.printf(" " + array[a]);
        }
    }
}
