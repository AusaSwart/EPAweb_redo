package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Document {
    @Id
    private long id;
    private long id_ls;
    private String body_doc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ls", nullable = false, insertable = false, updatable = false)
    private LogStatement logStatement;

    public Document() {
    }

    public LogStatement getLogStatement() {
        return logStatement;
    }
    public void setLogStatement(LogStatement logStatement) {
        this.logStatement = logStatement;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_ls() {
        return id_ls;
    }
    public void setId_ls(long id_ls) {
        this.id_ls = id_ls;
    }
    public String getBody_doc() {
        return body_doc;
    }
    public void setBody_doc(String body_doc) {
        this.body_doc = body_doc;
    }

    @Override
    public String toString() {
        return "Document {" +
                "id = " + id +
                ", id_ls = " + id_ls +
                ", body_doc = '" + body_doc + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return id == document.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
