package TCS_NQT;

public class FirstLast {

        public static void main(String[] args) {
            String str ="take u forward is awesome";
            String[] b = str.split(" ");

            StringBuilder p = new StringBuilder();

            for(String word : b) {

                if (word.length() == 1) {
                    p.append(Character.toUpperCase(word.charAt(0)));
                }
                else {
                    char first = Character.toUpperCase(word.charAt(0));
                    char last = Character.toUpperCase(word.charAt(word.length() - 1));

                    p.append(first);

                    for(int i = 1; i < word.length() - 1; i++) {
                        p.append(word.charAt(i));
                    }

                    p.append(last);
                }

                p.append(" ");
            }

            System.out.println(p.toString().trim());
        }
    }

