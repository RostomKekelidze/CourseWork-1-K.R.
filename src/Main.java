import java.util.Random;

public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        fullEmployees();
        printFullInfo();
    }



        private static void fullEmployees(){
            Random random= new Random();
            for (int i = 0; i < EMPLOYEES.length; i++) {
                EMPLOYEES[0] = new Employee
                        ("Сотрудник "+ (i+ 1),
                                random.nextInt(6),
                                random.nextInt(45_000));
            }
        }





    private static void printFullInfo() {
                for (Employee employee : EMPLOYEES) {
                    System.out.println(employee);

                }
            }
        }

