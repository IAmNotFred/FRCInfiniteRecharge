/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.TestingDashboard;
import frc.robot.subsystems.Auto;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class MoveBallsAfterDelay extends SequentialCommandGroup {
  /**
   * Creates a new MoveBallsAfterDelay.
   */
  public MoveBallsAfterDelay() {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super( new Wait(4, true),
           new MoveBalls()
          );
  }

  public static void registerWithTestingDashboard() {
    Auto auto = Auto.getInstance();
    MoveBallsAfterDelay cmd = new MoveBallsAfterDelay();
    TestingDashboard.getInstance().registerCommand(auto, "ConveyorCmds", cmd);
  }
}
