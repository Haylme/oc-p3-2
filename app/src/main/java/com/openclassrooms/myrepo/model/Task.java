package com.openclassrooms.myrepo.model;

import java.util.Date;
import java.util.Objects;

/**
 * class représentant une tâche avec sa description et sa date d'échéance
 *
 */
public class Task {
    private String description;

    private  Date dueTime;


    /**
     *
     * @param description description de la tâche
     * @param dueTime date d'échéance de la tâche
     */

    public Task(String description, Date dueTime) {
        this.description = description;
        this.dueTime = dueTime;
}


    /**
     *
     * @return date d'échéance de la tâche
     *
     *
     *
     */



    public Date getDueTime(){ return dueTime;}

    /**
     *
     * @return description de la tâche
     */

    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description nouvelle desciption de la tâche
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @param dueTime nouvelle date d'échéance
     */
    public void setDueTime(Date dueTime){this.dueTime = dueTime;}

    /**
     * vérifie si les deux objet task sont égaux en comparant leurs descriptions et leurs dates d'échéance
     * @param o l'objet à comparer
     * @return vrai si la description et les dates d'échéace sont égales, c'est faux sinon.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(description, task.description) && Objects.equals(dueTime, task.dueTime);
    }


    /**
     * Calcule le code de hachage en utilisant la description et la date d'échéance de la tâche.
     * @return le code de hachage est calculé.
     */
    @Override
    public int hashCode() {
        return Objects.hash(description, dueTime);
    }
}
