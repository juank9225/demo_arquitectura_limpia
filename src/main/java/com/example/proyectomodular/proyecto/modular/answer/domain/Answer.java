package com.example.proyectomodular.proyecto.modular.answer.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Answer {
    @Id
    private String id;
    private String userId;
    private String questionId;
    private String answer;
    private Integer vote;
    private Boolean modificada;
    private Integer vecesModificada;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    public Boolean getModificada() {
        return modificada;
    }

    public void setModificada(Boolean modificada) {
        this.modificada = modificada;
    }

    public Integer getVecesModificada() {
        return vecesModificada;
    }

    public void setVecesModificada(Integer vecesModificada) {
        this.vecesModificada = vecesModificada;
    }
}
