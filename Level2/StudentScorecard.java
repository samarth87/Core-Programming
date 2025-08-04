// Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below
// Hint =>
//Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
//Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
//Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
//Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format.

public class StudentScorecard {

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; // PCM
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 51) + 50; // random 50 to 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        int students = scores.length;
        double[][] stats = new double[students][3]; // [total, average, percentage]

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    // Method to calculate grades based on percentage
    public static char[] calculateGrades(double[][] stats) {
        int students = stats.length;
        char[] grades = new char[students];

        for (int i = 0; i < students; i++) {
            double percent = stats[i][2];

            if (percent >= 80) grades[i] = 'A';
            else if (percent >= 70) grades[i] = 'B';
            else if (percent >= 60) grades[i] = 'C';
            else if (percent >= 50) grades[i] = 'D';
            else if (percent >= 40) grades[i] = 'E';
            else grades[i] = 'R'; // Reappear
        }

        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, char[] grades) {
        System.out.printf("%-8s %-8s %-10s %-6s %-8s %-12s %-10s %-8s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d %-8d %-10d %-6d %-8.0f %-12.2f %-10.2f %-8c\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int students = 5; // change this number as needed

        int[][] scores = generateScores(students);
        double[][] stats = calculateStats(scores);
        char[] grades = calculateGrades(stats);

        displayScorecard(scores, stats, grades);
    }
}

