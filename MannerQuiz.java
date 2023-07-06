import java.util.Scanner;

public class MannerQuiz {
    private static String[] level1Questions = {
            "1 主語が相手の場合は謙譲語を使う",
            "2 上司に対して「お疲れ様です」という挨拶は正しい",
            "3 電話相手の名前の聞き方として「お名前を教えていただけますか？」は正しい聞き方である。"
    };
    /* この行は、文字列型の配列変数level1Questionsを宣言します。これらの三つの文字列は、クイズのレベル1の質問を表します。 */

    private static String[] level2Questions = {
            "1 面接会場に入室する際のドアノックは２回である",
            "2 面接が始まるときのお辞儀の角度で正しいのは30度である",
            "3 面接で緊張して質問内容を忘れたとき質問を聞き返してもよい"
    };

    private static String[] level3Questions = {
            "1 面接の後はお礼のメールを送ったほうがいい",
            "2 「当社は第何志望ですか？」という質問には嘘でも「第一志望です」と答えたほうが良い",
            "3 「最後に何か質問はありますか？」という質問に対して、何もなければ答えなくていい"
    };

    private static int[] level1CorrectAnswers = { 2, 1, 1 };/* 上と同じように答えの整数が入ってる配列です。 */
    private static int[] level2CorrectAnswers = { 2, 1, 1 };
    private static int[] level3CorrectAnswers = { 1, 2, 2 };

    public static void main(String[] args) {
        int incorrectCount = 0;
        /* ユーザーの不正解の数の整数です。 */

        System.out.println("就職活動に役に立つマナークイズを出題します。");
        System.out.println("問題は全部で9問、");
        System.out.println("100点満点から開始して1問不正解ごとに-10点する減点方式です。");
        System.out.println("問題は半角の1または2にて回答してください。");
        System.out.println("それでは問題を出題します。\n");

        System.out.println("大問１");
        incorrectCount += answerJudgement(questionManagement(level1Questions), level1CorrectAnswers);
        /*
         * これは、questionManagementメソッドを呼び出してレベル1の質問を変更し、
         * 修正された質問を正解とともにanswerJudgementメソッドに入れます。返された不正解数は、incorrectCountに代入されます。
         */
        System.out.println("\n");

        System.out.println("大問２");
        incorrectCount += answerJudgement(questionManagement(level2Questions), level2CorrectAnswers);
        System.out.println("\n");

        System.out.println("大問３");
        incorrectCount += answerJudgement(questionManagement(level3Questions), level3CorrectAnswers);
        System.out.println("\n");

        int score = scoreOutput(incorrectCount);
        printResult(score);
    }

    public static String[] questionManagement(String[] questions) {
        /* iの値がquestion配列の長さより小さい限り、ループは続けます。 */
        for (int i = 0; i < questions.length; i++) {
            questions[i] = "No." + questions[i];
        }
        return questions;
    }

    public static int answerJudgement(String[] questions, int[] correctAnswers) {
        Scanner scanner = new Scanner(System.in);
        int incorrectCount = 0;
        int currentQuestion = 0;/* 現在の質問。 */

        /* currentQuestionの値がquestion配列の長さより小さい限り、ループは続けます。 */
        while (currentQuestion < questions.length) {
            System.out.println(questions[currentQuestion] + "\n" + "1.Yes" + "\n" + "2.No");

            /*
             * 答えが1か2であるか、現在の質問の正解と一致するかを確認し、一致する場合は「正解!」を出力します。
             * そしてcurrentQuestionの整数を+1します。そうではない場合incorrectCountを+1し、現在の質問をリセットします
             */

            if (scanner.hasNextInt()) {
                int ans = scanner.nextInt();
                if (ans == 1 || ans == 2) {
                    if (ans == correctAnswers[currentQuestion]) {
                        System.out.println("正解です！\n");
                        currentQuestion++;
                    } else {
                        System.out.println("不正解です。大問の最初の問題へ戻ります。");
                        incorrectCount++;
                        currentQuestion = 0;
                    }
                } else {
                    System.out.println("不正な入力値です。" + "\n" + "1又は2で選択してください");
                }
            } else {
                System.out.println("不正な入力値です。" + "\n" + "1又は2で選択してください");
                scanner.next();
            }
        }

        return incorrectCount;
    }

    public static int scoreOutput(int incorrectCount) {
        int score = 100 - incorrectCount * 10;
        if (score < 0) {
            score = 0;
        }
        System.out.println("これで問題は終了です。お疲れ様でした。");
        System.out.println("あなたのスコアは" + score + "点です。");
        return score;
    }

    public static void printResult(int score) {
        if (score >= 80) {
            System.out.println("おめでとうございます！");
        } else if (score >= 30 && score <= 80) {
            System.out.println("もう少し頑張りましょう。");
        } else {
            System.out.println("繰り返して覚えましょう。");
        }
    }

}