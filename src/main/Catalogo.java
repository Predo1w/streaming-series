package main;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Series> seriesArrayList;

public void addSerie (Series serie) {
      this.seriesArrayList.add(serie);
  }
  public Series buscarSerie (String serie) {
    for (Series s : seriesArrayList) {
        if (s.getNome().equals(serie)) {
            return s;
        }
    }
      return null;
  }
}
