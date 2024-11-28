package com.amazon.ata.designcomposition;

import java.util.List;

public class BestAnswerAlexaQAClient {
    private AlexaQAClient client;
    private List<AlexaAnswer> answers;

    public BestAnswerAlexaQAClient(AlexaQAClient client) {
        this.client = client;
    }

    public AlexaAnswer findBestAnswer(AlexaQuestion question) {
        answers = client.findAnswers(question);
        AlexaAnswer bestAnswer = answers.get(0);
        for (AlexaAnswer answer : answers) {
            if (bestAnswer.getAnswerQuality() > answer.getAnswerQuality()) {
                return bestAnswer;
            } else bestAnswer = answer;
        }
        return bestAnswer;
    }

    private void submitQuestionAnswerSuggestions(AlexaQuestion question, List<AlexaAnswer> answers) {
        client.submitQuestionAnswerSuggestion(question, findBestAnswer(question));
    }
}
