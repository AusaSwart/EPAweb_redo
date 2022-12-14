package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class EmployeeTask {

    @Id
    private long id;
    private long id_executor;
    private long id_employee;
    private long id_task;
    private String comment_te;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee", nullable = false, insertable = false, updatable = false)
    private Employee employee;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_task", nullable = false, insertable = false, updatable = false)
    private Task task;

    public EmployeeTask() {
    }

    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Task getTask() {
        return task;
    }
    public void setTask(Task task) {
        this.task = task;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_executor() {
        return id_executor;
    }
    public void setId_executor(long id_executor) {
        this.id_executor = id_executor;
    }
    public long getId_employee() {
        return id_employee;
    }
    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
    }
    public long getId_task() {
        return id_task;
    }
    public void setId_task(long id_task) {
        this.id_task = id_task;
    }
    public String getComment_te() {
        return comment_te;
    }
    public void setComment_te(String comment_te) {
        this.comment_te = comment_te;
    }

    @Override
    public String toString() {
        return "EmployeeTask {" +
                "id_executor = " + id_executor +
                ", id_employee = " + id_employee +
                ", id_task = " + id_task +
                ", comment_te = '" + comment_te + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTask that = (EmployeeTask) o;
        return id_executor == that.id_executor;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id_executor);
    }

}
