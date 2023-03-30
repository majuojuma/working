import java.util.Random;

class SameColorBallException extends Exception {
    public SameColorBallException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};
        int[] count = {0, 0, 0, 0};
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            try {
                String color = colors[rand.nextInt(4)];
                switch (color) {
                    case "red":
                        count[0]++;
                        break;
                    case "green":
                        count[1]++;
                        break;
                    case "blue":
                        count[2]++;
                        break;
                    case "yellow":
                        count[3]++;
                        break;
                }
                if (count[0] > 3) {
                    throw new SameColorBallException("Too many red balls");
                }
                if (count[1] > 3) {
                    throw new SameColorBallException("Too many green balls");
                }
                if (count[2] > 3) {
                    throw new SameColorBallException("Too many blue balls");
                }
                if (count[3] > 3) {
                    throw new SameColorBallException("Too many yellow balls");
                }
            } catch (SameColorBallException e) {
                i--;
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Number of red balls: " + count[0]);
        System.out.println("Number of green balls: " + count[1]);
        System.out.println("Number of blue balls: " + count[2]);
        System.out.println("Number of yellow balls: " + count[3]);
    }
}
