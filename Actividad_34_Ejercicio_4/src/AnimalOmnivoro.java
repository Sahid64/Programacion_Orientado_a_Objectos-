public class AnimalOmnivoro extends Animal implements Carnivoro, Herbivoro, Omnivoro {
    public AnimalOmnivoro(String nombre) {
        super(nombre);
    }

    public void comerCarne() {
        if (nombreValido()) {
            System.out.println(nombre + " está comiendo carne.");
        } else {
            System.out.println("Error: nombre inválido para comer carne.");
        }
    }

    public void comerPlantas() {
        if (nombreValido()) {
            System.out.println(nombre + " está comiendo plantas.");
        } else {
            System.out.println("Error: nombre inválido para comer plantas.");
        }
    }

    public void comerDeTodo() {
        if (nombreValido()) {
            System.out.println(nombre + " está comiendo de todo: carne y plantas.");
        } else {
            System.out.println("Error: nombre inválido para comer de todo.");
        }
    }
}
