import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Actor> getListOfActors() {
        return new ArrayList<>(listOfActors);
    }

    public void printDirector() {
        if (director == null) {
            System.out.println("Режиссёр не указан.");
            return;
        }
        System.out.println(director);
    }

    public void printActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст.");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле.");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String surname) {
        int foundIndex = -1;
        int count = 0;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                if (foundIndex == -1) {
                    foundIndex = i;
                }
                count++;
            }
        }

        if (foundIndex == -1) {
            System.out.println("Актёр с фамилией " + surname + " не найден.");
            return;
        }

        if (count > 1) {
            System.out.println("Найдено несколько актёров с фамилией " + surname + ". Заменён первый.");
        }

        listOfActors.set(foundIndex, newActor);
    }
}