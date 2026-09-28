import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printDirector() {
        if (director != null) {
            System.out.println(director);
        }
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Нельзя добавить пустого актёра.");
            return;
        }
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр уже участвует в спектакле.");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String surname) {
        if (newActor == null) {
            System.out.println("Нельзя заменить на пустого актёра.");
            return;
        }
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                if (listOfActors.contains(newActor)) {
                    System.out.println("Актёр уже участвует в спектакле.");
                    return;
                }
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с такой фамилией не найден.");
    }
}