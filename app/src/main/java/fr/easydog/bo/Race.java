package fr.easydog.bo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Race {

    /**
     * int id
     */
    @PrimaryKey(autoGenerate = true)
    private int id;

    /**
     * Name of race
     * String name
     */
    private String name;

    public Race(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
