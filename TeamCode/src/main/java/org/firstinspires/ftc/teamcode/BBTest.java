package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "BBTest")
public class BBTest extends BBAutonomous {
    @Override
    public void runOpMode() {
        setup();
        waitForStart();
        telemetry.addData("Ready", "Run");
        telemetry.update();
        //encoderDrive(10, 10);
        encoderDrive(10, 10, 10, 10,  0.75);
    }
}
