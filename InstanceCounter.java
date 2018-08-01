public class InstanceCounter {

    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Начиная с " +
                InstanceCounter.getCount() + " экземпляра");
        for (int i = 0; i < 500; ++i){
            new InstanceCounter();
        }
        System.out.println("Создано " +
                InstanceCounter.getCount() + " экземпляров");
    }
}