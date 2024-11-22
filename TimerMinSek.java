public class TimerMinSek {
    public static int[] funksjonForTimer(int sekunder) {
        int timer = sekunder / 3600;
        int minutter = (sekunder - timer * 3600) / 60;
        int sekunderIgjen = sekunder - timer * 3600 - minutter * 60;

        int[] Return = {timer, minutter, sekunderIgjen};
        return Return;

    }
    public static void main(String[] args) {

        int[] Tid = funksjonForTimer(36610);
        System.out.println("Time(r): " + Tid[0] + ". Minutte(r): " + Tid[1] + ". Sekunde(r): " + Tid[2]);
    }
}
