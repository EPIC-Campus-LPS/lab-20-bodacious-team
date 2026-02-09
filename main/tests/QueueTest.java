class QueueTest {

    @org.junit.jupiter.api.Test
    void add() {
        Queue thing = new Queue(5);
        thing.add(3);
        thing.add(-9832);
        thing.add(40);
        System.out.println(thing);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        Queue thing = new Queue(5);
        thing.add(30);
        thing.add(2);
        System.out.println(thing.remove());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        Queue thing = new Queue(201);
        thing.add(30);
        thing.add(7);
        thing.remove();
        System.out.println(thing.peek());
    }

    @org.junit.jupiter.api.Test
    void size() {
        Queue thing = new Queue(93);
        thing.add(26);
        thing.add(6);
        thing.add(302);
        System.out.println(thing.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Queue thing = new Queue(23);
        thing.add(89);
        System.out.println(thing.isEmpty());
        thing.remove();
        System.out.println(thing.isEmpty());
        thing.remove();
        System.out.println(thing.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void toStringTest() {
        Queue thing = new Queue(23);
        thing.add(203);
        thing.remove();
        thing.add(-983);
        thing.add(0);
        System.out.println(thing);
    }
}