public class Reflection {

        public static void main(String[] args) {

            int problem = 44;
            String size;

            // switch statement to check size
            switch (problem) {

                case 1:
                    size = "Small";
                    break;

                case 2:
                    size = "Medium";
                    break;

                // match the value of week
                case 3:
                    size = "Large";
                    break;

                case 4:
                    size = "Extra Large";
                    break;

                default:
                    size = "Unknown";
                    break;

            }
            System.out.println("what are your problems: " + size);
        }
    }


