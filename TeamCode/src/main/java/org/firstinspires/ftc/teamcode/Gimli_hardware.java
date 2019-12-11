package org.firstinspires.ftc.teamcode;
//import statements
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.hardware.rev.Rev2mDistanceSensor;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorREV2mDistance;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import com.qualcomm.robotcore.hardware.DistanceSensor;


public class Gimli_hardware {
    //motors
    public DcMotor Right_Bottom;
    public DcMotor Right_Top;
    public DcMotor Left_Bottom;
    public DcMotor Left_Top;
    public Servo Wrist;
    public Servo Shoulder;
    public DcMotor Slider;
    public DistanceSensor Lookie;
    //vuforia
    public VuforiaLocalizer vuforia;

    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    public Gimli_hardware() {

    }

    public void init(HardwareMap ahwMap) {


        hwMap = ahwMap;
        Right_Bottom = hwMap.get(DcMotor.class, "Right_Bottom");
        Right_Top = hwMap.get(DcMotor.class, "Right_Top");
        Left_Bottom = hwMap.get(DcMotor.class, "Left_Bottom");
        Left_Top = hwMap.get(DcMotor.class, "Left_Top");
        Wrist =hwMap.get(Servo.class,"Wrist");
        Shoulder = hwMap.get(Servo.class,"Shoulder");
        Slider = hwMap.get(DcMotor.class,"Slider");
        Lookie = hwMap.get(DistanceSensor.class, "Lookie");

        Left_Top.setDirection(DcMotor.Direction.REVERSE);
        Left_Bottom.setDirection(DcMotor.Direction.REVERSE);

        Right_Bottom.setPower(0);
        Right_Top.setPower(0);
        Left_Bottom.setPower(0);
        Left_Top.setPower(0);
    }

}