package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.threadopmode.ThreadOpMode;

@TeleOp
public class BuildTest extends ThreadOpMode {
    @Override
    public void mainInit() {

    }

    @Override
    public void mainLoop() {
        telemetry.addData("script uploaded", null);

    }
}
