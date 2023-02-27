package main;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        LinkList<String> list = new LinkList<>();
        list.addFirst("first");
        System.out.println(list.isEmpty());
        list.addLast("second");
        list.addLast("third");
        System.out.println(list);
        System.out.println(list.contains("sec"));
        list.remove("second");
        System.out.println(list);
    }
}
