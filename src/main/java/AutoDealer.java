public class AutoDealer {

    private final int carsLimit = 10;
    private final int buildCarsTime = 5;
    private int cars;

    public void startProduction() {
        new Thread(() -> {
        for(int i = 0; i < carsLimit; i++) {
            try {
                Thread.sleep(buildCarsTime * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("| Произведенно Авто |");
            cars++;
        }
        }).start();
    }

    public void buyer(String name, int time) {
        new Thread(() -> {
            try {
                Thread.sleep(time * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while(true) {
                if (cars > 0) {
                    System.out.println(name + " Приобрёл транспорт");
                    cars--;
                }
            }
        }).start();
    }
}
