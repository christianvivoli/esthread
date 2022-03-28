public class App {
    public static void main(String[] args) throws Exception {
        ContaNani thr1=new ContaNani();
        thr1.start();
        System.out.println(Thread.currentThread().getName());    
    }
}
