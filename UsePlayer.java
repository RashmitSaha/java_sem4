interface Player {
    void play();
}

class Child implements Player {
    @Override
    public void play() {
        System.out.println("The child is playing with the toys.");
    }
}

class Musician implements Player {
    @Override
    public void play() {
        System.out.println("KK is playing a guitar.");
    }
}

class Actor implements Player {
    @Override
    public void play() {
        System.out.println("Sid is playing Lord Rama in the stage play.");
    }
}

public class UsePlayer {
    public static void main(String[] args) {
        Player child = new Child();
        Player musician = new Musician();
        Player actor = new Actor();

        child.play();
        musician.play();
        actor.play();
    }
}
