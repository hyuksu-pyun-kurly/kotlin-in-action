package ch08;

import static ch08.ProcessTheAnswer.ProcessTheAnswer.processTheAnswer;

/* Java */

public class ProcessTheAnswerLambda {
    public static void main(String[] args) {
        processTheAnswer(number -> number + 1);
    }
}
