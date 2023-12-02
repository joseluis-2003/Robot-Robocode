package prog;

import robocode.*;

public class Robotjoseluis extends Robot {

    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }

    public void onHitRobot(HitRobotEvent e) {
        back(50);
    }

    public void onHitWall(HitWallEvent e) {
        turnRight(180);
        ahead(100);
    }
}
