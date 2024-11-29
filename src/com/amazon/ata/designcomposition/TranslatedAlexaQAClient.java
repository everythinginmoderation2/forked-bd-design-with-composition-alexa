package com.amazon.ata.designcomposition;

public class TranslatedAlexaQAClient {
    private final BestAnswerAlexaQAClient bestAnswerAlexaQAClient;
    private final AlexaTranslator alexaTranslator;

    public TranslatedAlexaQAClient(BestAnswerAlexaQAClient bestAnswerAlexaQAClient, AlexaTranslator alexaTranslator) {
        this.bestAnswerAlexaQAClient = bestAnswerAlexaQAClient;
        this.alexaTranslator = alexaTranslator;
    }

    public String findBestAnswerAndTranslate(AlexaQuestion question) {
        return alexaTranslator.getTranslation(bestAnswerAlexaQAClient.findBestAnswer(question).getContent());
    }
}
