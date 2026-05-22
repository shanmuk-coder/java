/*
Delivery Drone Battery Tracker

Problem Statement

A company uses delivery drones to transport packages across the city.

Each drone starts the day with a battery level of 100.

During the day:
- Positive values represent battery charged.
- Negative values represent battery used.

The battery level must always remain between 0 and 100.

Write a Java program to calculate:
- Final battery level
- Number of charging events
- Number of usage events

If the battery level becomes less than 0 or greater than 100, print:

Invalid Battery Level

and terminate immediately.


Input Format

- First line contains an integer n — number of battery events.
- Next n lines contain an integer representing battery change.


Constraints

1 <= n <= 100
-100 <= battery change <= 100


Output Format

Print:

Final Battery: X
Charging Events: Y
Usage Events: Z

If battery becomes invalid:

Invalid Battery Level


Sample Input 1

5
-20
-10
15
-5
10


Sample Output 1

Final Battery: 90
Charging Events: 2
Usage Events: 3


Sample Input 2

3
-50
-60
20


Sample Output 2

Invalid Battery Level
*/
import java.util.Scanner;

class DroneTracker{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int chargingEvents = 0;
        int batteryLevel = 100;

        for (int i = 1; i <= n; i++) {

            int chargeUsed = sc.nextInt();

            batteryLevel = batteryLevel + chargeUsed;

            if (batteryLevel < 0 || batteryLevel > 100) {
                System.out.println("Invalid Battery Level");
                return;
            }

            if (chargeUsed > 0) {
                chargingEvents++;
            }
        }

        int usageEvents = n - chargingEvents;

        System.out.println("Final Battery: " + batteryLevel);
        System.out.println("Charging Events: " + chargingEvents);
        System.out.println("Usage Events: " + usageEvents);
    }
}
