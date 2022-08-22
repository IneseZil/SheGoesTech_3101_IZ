package oop.interfaces;

public class InterfacesExmp {

    interface Bug {
        public void bugSound();

        public void bugSize();
    }

    interface Location {
        public void location();
    }

    class Ant implements Bug, Location {
        public void bugSound() {
            System.out.println("Tsss");
        }

        public void bugSize() {
            System.out.println("Small");
        }

        public void location() {
            System.out.println("Forest");
        }
    }

    public class InterfacesExamples {
        public void main(String[] args) {
            Ant ant = new Ant();
            ant.bugSound();
            ant.bugSize();
            ant.location();
        }
    }
}
