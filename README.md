# MannerQuiz
This is a Java program that presents a manners quiz in Japanese for job seekers.
The quiz consists of three levels with a total of nine questions. 
The program calculates the user's score based on their answers and provides feedback at the end.

## How to Use
1. Open the Java file `MannerQuiz.java` in a Java development environment or text editor.
2. Compile the file to generate the bytecode.
3. Run the compiled bytecode file to start the quiz.

## Quiz Structure
The quiz is divided into three levels, each containing three questions. The questions are stored in arrays along with the corresponding correct answers.
- Level 1 Questions:
  1. 主語が相手の場合は謙譲語を使う
  2. 上司に対して「お疲れ様です」という挨拶は正しい
  3. 電話相手の名前の聞き方として「お名前を教えていただけますか？」は正しい聞き方である。

- Level 2 Questions:
  1. 面接会場に入室する際のドアノックは２回である
  2. 面接が始まるときのお辞儀の角度で正しいのは30度である
  3. 面接で緊張して質問内容を忘れたとき質問を聞き返してもよい

- Level 3 Questions:
  1. 面接の後はお礼のメールを送ったほうがいい
  2. 「当社は第何志望ですか？」という質問には嘘でも「第一志望です」と答えたほうが良い
  3. 「最後に何か質問はありますか？」という質問に対して、何もなければ答えなくていい

## Running the Quiz
1. When you run the program, it will display instructions and rules for the quiz.
2. The quiz starts with Level 1 questions. Each question is displayed with options for the user to choose from (1 for "Yes" and 2 for "No").
3. After answering all three questions in Level 1, the program provides feedback on the user's correctness.
4. The quiz continues with Level 2 questions and then Level 3 questions, following the same process as Level 1.
5. After answering all nine questions, the program calculates the user's score and displays it.
6. Depending on the score, the program provides a congratulatory message or feedback for improvement.

## Scoring
The quiz follows a scoring system where each incorrect answer deducts 10 points from the initial score of 100. The minimum score that can be achieved is 0.

## Feedback
- If the score is equal to or greater than 80, the program displays: "おめでとうございます！" (Congratulations!)
- If the score is between 30 and 80 (inclusive), the program displays: "もう少し頑張りましょう。" (Let's try a little harder.)
- If the score is below 30, the program displays: "繰り返して覚えましょう。" (Let's practice and remember them better.)

Enjoy the MannerQuiz program and feel free to modify the quiz questions, add more levels, or customize the feedback messages according to your needs.
