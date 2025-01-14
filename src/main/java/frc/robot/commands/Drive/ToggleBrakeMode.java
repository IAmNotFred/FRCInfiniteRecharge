// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Drive;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class ToggleBrakeMode extends CommandBase {
  
  private boolean isFinished;
  private boolean isTrue;
  
  /** Creates a new ToggleBrakeMode. */
  public ToggleBrakeMode(boolean tf) {
    // Use addRequirements() here to declare subsystem dependencies.
    isFinished = false;
    isTrue = tf;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Drive.getInstance().brakeModeSet(isTrue);
    isFinished = true;
  }
  
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isFinished;
  }
}
