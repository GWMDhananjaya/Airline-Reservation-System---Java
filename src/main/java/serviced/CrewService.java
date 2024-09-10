package services;

import models.Crew;

import java.util.ArrayList;
import java.util.List;

public class CrewService {
    private List<Crew> crews = new ArrayList<>();

    public void addCrew(Crew crew) {
        crews.add(crew);
    }

    public Crew getCrewById(String id) {
        for (Crew crew : crews) {
            if (crew.getId().equals(id)) {
                return crew;
            }
        }
        return null;
    }

    public List<Crew> getAllCrews() {
        return crews;
    }
}
